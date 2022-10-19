public class PalindromeNumber {
    public void checkPalindrome(int number) {
        int data = number;
        int sum = 0;
        int rem;
        while (number > 0) {
            rem = number % 10;
            sum = (sum * 10) + rem;
            number = number / 10;
        }
        if (data == sum) {
            System.out.println("The given number is palindrome");
        } else {
            System.out.println("The given number is not a palindrome ");
        }
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        palindromeNumber.checkPalindrome(123);
    }
}
