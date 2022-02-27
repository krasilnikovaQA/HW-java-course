package com.epam;

import java.util.logging.Logger;

public class HomeWork1 {

    public static final String FUZZ = "fuzz";
    public static final String BUZZ = "buzz";

    public int fibonachchi(int numbOfRepeat) {
        int x = 0;
        int x1 = 1;
        int temp;
        if (numbOfRepeat > 0) {
            while (numbOfRepeat > 0) {
                temp = x;
                x = x1;
                x1 = temp + x1;
                numbOfRepeat--;
            }
            return x;

        } else
            return x;
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
            if(s.equals(s1)){
                return true;
            }
            else {
                return false;
            }
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

}
