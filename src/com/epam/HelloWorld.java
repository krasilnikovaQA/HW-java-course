package com.epam;

import java.util.logging.Logger;

public class HelloWorld {
    private static final Logger logger = Logger.getLogger("HelloWorld");

    public static void main(String[] args) {

        String message = "Hello, World! " + args[0];
        logger.info(message);
    }
}
