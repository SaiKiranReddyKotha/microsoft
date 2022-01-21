import easy.*;

import java.util.Stack;

public class RestApplication {
    public static void main(String[] args){

//        int[] nums = new int[]{1, 2, 3, 4};
//        runningSum1dArray array = new runningSum1dArray();
//        array.runningSum(nums);
//
//        int number = 12221;
//        palindromeNumber isPalindrome = new palindromeNumber();
//        isPalindrome.isPalindrome(number);
//
//        String roman = "MCMXCIV";
//        romanToInteger romanToInteger = new romanToInteger();
//        romanToInteger.romanToInt(roman);
//
//        String[] str = {"flower","flow","flight"};
//        longestCommonPrefix longestCommonPrefix = new longestCommonPrefix();
//        System.out.println(longestCommonPrefix.longestCommonPrefix(str));
//
//        String s = "({[])";
//        validParentheses validParentheses = new validParentheses();
//        System.out.println(validParentheses.isValidParentheses(s));

          Stack stack = new Stack();
          stack.push("test1");
          stack.push("test2");
          stack.push("test3");
          stackReversal reversal = new stackReversal();
          reversal.reverseStack(stack);
    }
}
