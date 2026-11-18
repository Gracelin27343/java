package DSA.Strings;


class VowelCount {
//    public static void main(String[] args) {
//        String input = "Umberalla".toLowerCase();
//        String vowel = "aeiou";
////brute force
//        for (int i = 0; i < vowel.length(); i++) {
//            int count = 0;
//            for(int j = 0; j < input.length(); j++) {
//                if(vowel.charAt(i) == input.charAt(j)) {
//                    count += 1;
//                }
//            }
//            System.out.println("Vowel = " + vowel.charAt(i) + " count = " + count);
//        }
//    }
//}

//optimized

    public static void main(String[] args) {
        String input = "Gracelin".toLowerCase();
        String vowel = "aeiou";
        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            if(vowel.indexOf(input.charAt(i)) != -1) { //input.charAt(i)	Gets the current character
                                                    //vowel.indexOf()	Checks whether that character exists in the vowel string
                                                   // != -1	Checks whether the character was found
                count+=1;
            }
        }

        System.out.println(" Total number of vowels in given string = " + count);
    }
}