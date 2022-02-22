package com.epam;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {
    private static final Logger logger = Logger.getLogger("HelloWorld");

    public static void main(String[] args) {
        HomeWork1 homeWork1 = new HomeWork1();

        int fibResult = homeWork1.fibonachchi(10);
        logger.log(Level.INFO, "Number = {0}", fibResult);

        String s = homeWork1.divMod(65, 6);
        logger.info(s);

    }
}
