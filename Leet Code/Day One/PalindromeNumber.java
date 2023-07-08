//Palindrome Number

// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int number = x;
        int reversed = 0;

        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return reversed == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1321));
    }
}
