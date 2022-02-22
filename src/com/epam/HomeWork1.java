package com.epam;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeWork1 {
    private static final Logger logger = Logger.getLogger("HomeWork1");

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

}
