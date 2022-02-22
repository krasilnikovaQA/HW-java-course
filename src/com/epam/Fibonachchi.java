package com.epam;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fibonachchi {
    private static final Logger logger = Logger.getLogger("Fibonachchi");

    public int fib(int numbOfRepeat){
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

}
