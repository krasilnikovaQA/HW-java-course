package com.epam.homework2;

import java.util.Random;
import java.util.logging.Logger;

public class Game {
    private static final Logger logger = Logger.getLogger(Game.class.getName());
    public static final int BOUND = 51;
    public static final int MIDDLE_VALUE = 25;

    public static void main(String[] args) {

        Wolfrider wolfRider = new Wolfrider(7, 5, 4, 10, 6, null, 0, 3, "Wolf Rider");
        Thunderbird thunderBird = new Thunderbird(13, 11, 15, 60, 11, null, MIDDLE_VALUE, 4, "Thunder Bird");

        wolfRider.targetEnemy(thunderBird);
        thunderBird.targetEnemy(wolfRider);

        boolean isSomeoneDead = false;

        while (!isSomeoneDead) {
            Random random = new Random();
            int i = random.nextInt(BOUND);
            logger.info("Random number is " + i);
            if (i > MIDDLE_VALUE) {
                logger.info("Hero1 attack");
                wolfRider.action();
                isSomeoneDead = thunderBird.checkHeroDead();
            } else {
                logger.info("Hero2 attack");
                thunderBird.action();
                isSomeoneDead = wolfRider.checkHeroDead();
            }
        }
    }
}
