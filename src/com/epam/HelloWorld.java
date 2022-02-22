package com.epam;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {
    private static final Logger logger = Logger.getLogger("HelloWorld");

    public static void main(String[] args) {

        String message = "Hello, World! " + args[0];
        String message1 = "Hello, World! " + args[1];
        logger.info(message);
        logger.info(message1);

        int fibResult = new Fibonachchi().fib(10);
        logger.log(Level.INFO, "Number = {0}", fibResult);



/*        A name = new A();
        String str1 = A.str1;
        A.print();*/
    }
}
/*
class A {
    public static String str1 = "str1";
    public static void print() {
        System.out.printf("");
    }

    public void print1() {
        System.out.printf("");
    }
}*/
