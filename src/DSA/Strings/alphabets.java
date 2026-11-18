package DSA.Strings;

import java.util.Arrays;

//same code ith optimal solution of duplicate and count
public class alphabets {
    public static void main(String[] args) {
        String s = "banana";
        int[] freq = new int[26];
        Arrays.fill(freq, 0);

        // Count each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);//b a n a n a
            freq[ch - 'a']++; //ascci 98- 97 =1
                               //freq[1]++ So the frequency of b increases by 1.
                               //index is 1 from 0 to 25
        }

        // Print each distinct character once
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) ('a' + i) + " = " + freq[i]);
                                          // 0+0 = 0   0+1        0+13
                                          //a            b         n
            }
        }
    }
}