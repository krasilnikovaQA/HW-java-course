package com.epam;

import java.util.logging.Logger;

public class HomeWork1 {

    public static final String FUZZ = "fuzz";
    public static final String BUZZ = "buzz";

    public int fibonachchi(int numbOfRepeat){
        int x = 0;
        int x1 = 1;
        int temp;
        if(numbOfRepeat>0){
            while (numbOfRepeat>0){
                temp = x;
                x=x1;
                x1=temp+x1;
                numbOfRepeat--;
            }
            return x;

        }
        else
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

    public String fuzzBuzz(int x){

        if (x<0){
            return "Number should be more than 0";
        }
        if(x%3==0&&x%5==0){
            return FUZZ + BUZZ;
        }
        else if (x%3==0){
            return FUZZ;
        }
        else if (x%5==0){
            return BUZZ;
        }
        else {
            return "Number is not divided on 3 or 5";
        }
    }
}
