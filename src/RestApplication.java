import easy.palindromeNumber;
import easy.romanToInteger;
import easy.runningSum1dArray;

public class RestApplication {
    public static void main(String[] args){

        int[] nums = new int[]{1, 2, 3, 4};
        runningSum1dArray array = new runningSum1dArray();
        array.runningSum(nums);

        int number = 12221;
        palindromeNumber isPalindrome = new palindromeNumber();
        isPalindrome.isPalindrome(number);

        String roman = "MCMXCIV";
        romanToInteger romanToInteger = new romanToInteger();
        romanToInteger.romanToInt(roman);
    }
}
