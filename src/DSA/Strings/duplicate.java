package DSA.Strings;

public class duplicate {
    public static void main(String[] args) {
        String s = "happyday";
        String seen = "";
//time com -O(n*2)
        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            if (seen.indexOf(s.charAt(i)) != -1) {
                continue;
            }

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            seen += s.charAt(i);
            System.out.println(seen);
            System.out.println(s.charAt(i) + " = " + count);
        }
    }
}