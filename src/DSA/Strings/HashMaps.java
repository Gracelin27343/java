package DSA.Strings;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        String s = "banana";
            //key      value
        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
                     //b,(b,0+ 1)
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
//entrySet - return all key value
        for (Map.Entry<Character, Integer> entry
                : freq.entrySet()) {
            System.out.println(
                    entry.getKey() + " = " + entry.getValue()
            );
        }
    }
}


//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//
//    public static String firstNonRepeating(String s) {
//        Map<Character, Integer> freq = new HashMap<>();
//        String res = "";
//
//        for (char ch : s.toCharArray()) {
//            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
//        }
//
//        for (char ch : s.toCharArray()) {
//            if (freq.get(ch) == 1) {
//                res += ch;
//            }
//        }
//
//        return res; // No non-repeating character
//    }
//    public static void main(String[] args) {
//        System.out.println(firstNonRepeating("swiss"));
//    }
//}