/**
 * https://leetcode.com/problems/palindrome-number/description/
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int n1=141;
        int n2=1441;
        int n3=142;
        int n4=1421;
        System.out.println(n1 + " : " + isPalindrome(n1));
        System.out.println(n2 + " : " + isPalindrome(n2));
        System.out.println(n3 + " : " + isPalindrome(n3));
        System.out.println(n4 + " : " + isPalindrome(n4));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        if (x == 0) {
            return true;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x/=10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }
}
