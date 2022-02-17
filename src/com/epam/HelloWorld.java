package com.epam;

import java.util.logging.Logger;

public class HelloWorld {
    private static final Logger logger = Logger.getLogger("HelloWorld");

    public static void main(String[] args) {

        String message = "Hello, World! " + args[0];
        String message1 = "Hello, World! " + args[1];
        logger.info(message);
        logger.info(message1);
    }
}
