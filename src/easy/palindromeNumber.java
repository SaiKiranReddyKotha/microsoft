package easy;

public class palindromeNumber{
    public boolean isPalindrome(int number) {
        if (number <= 0) {
            System.out.println("false");
            return false;
        }
        int reverse = 0, remainder, original = number;
        while(number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(original == reverse);
        return original == reverse;
    }
}
