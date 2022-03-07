package com.epam;


public class HomeWork1 {

    public static final String FUZZ = "fuzz";
    public static final String BUZZ = "buzz";

    public int fibonachchi(int numbOfRepeat) {
        int x = 0;
        int x1 = 1;
        int temp;
        if (numbOfRepeat > 1) {
            while (numbOfRepeat > 1) {
                temp = x;
                x = x1;
                x1 = temp + x1;
                numbOfRepeat--;
            }
            return x;

        } else
            return x;
    }

    public int fibonachchiRecursion(int num){
        if (num <= 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            return fibonachchiRecursion(num - 1) + fibonachchiRecursion(num - 2);
        }
    }

    public String divMod(int x, int y) {
        int modPartOfNumber = 0;
        String divModResult = " ";

        if (x > y && x != 0 && y != 0) {
            while (x >= y) {
                x = x - y;
                modPartOfNumber = modPartOfNumber + 1;
                divModResult = "Mod part is " + modPartOfNumber + " Div part is " + x;
            }
            return divModResult;
        } else if (x == y) {
            divModResult = "Mod part is 1";
            return divModResult;
        } else {
            divModResult = "Each numbers is 0";
            return divModResult;

        }
    }

    public String fuzzBuzz(int x) {

        if (x < 0) {
            return "Number should be more than 0";
        }
        if (x % 3 == 0 && x % 5 == 0) {
            return FUZZ + BUZZ;
        } else if (x % 3 == 0) {
            return FUZZ;
        } else if (x % 5 == 0) {
            return BUZZ;
        } else {
            return "Number is not divided on 3 or 5";
        }
    }

    public boolean isPalindrome(int x){
        StringBuilder stringBuilder;
        if(x>=0){
            stringBuilder = new StringBuilder(String.valueOf(x));
            String s = stringBuilder.toString();
            String s1 = stringBuilder.reverse().toString();
            return s.equals(s1);
        }
        return false;
    }

    public int[] twoSum(int[] nums, int target) {
        if(nums.length==0){
            return nums;
        }
        int[] targetArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int elFirst = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int elSec = nums[j];
                if(elFirst+elSec==target){
                    targetArray[0] = i;
                    targetArray[1] = j;
                    return targetArray;
                }
            }
        }
        return targetArray;
    }

    public int mySqrt(int x) {

        if(x <= 1){
            return x;
        }

        int start = 1;
        int end = x/2;

        while(start < end) {
            int mid = (start + (end-start)/2) + 1;
            int div = x/mid;
            if(div == mid) return mid;
            if(div > mid) start = mid;
            else end = mid-1;
        }
        return start;
    }

    public int lengthOfLastWord(String s) {
        String[] separatedWords = s.split(" ");
        return separatedWords[separatedWords.length-1].length();
    }










}
