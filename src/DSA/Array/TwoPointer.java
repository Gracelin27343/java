package DSA.Array;

public class TwoPointer {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6};

        int target = 6;
//two sum
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(
                        arr[left] + " + " + arr[right] + " = " + target
                );
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

//palindrome using twopointers
        String str = "bananan";

        int lefts = 0;
        int rights = str.length() - 1;

        boolean isPalindrome = true;

        while (lefts < rights) {

            if (str.charAt(lefts) != str.charAt(rights)) {
                isPalindrome = false;
                break;
            }

            lefts++;
            rights--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}