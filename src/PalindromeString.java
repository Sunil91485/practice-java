public class PalindromeString {
    public void checkPalindrome(String string) {
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString = reverseString + string.charAt(i);
        }
        if (string.equals(reverseString)) {
            System.out.println("Yes the given string is palindrome");
        } else {
            System.out.println("No the given string is not a palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeString palindromeString = new PalindromeString();
        palindromeString.checkPalindrome("level");
    }
}
