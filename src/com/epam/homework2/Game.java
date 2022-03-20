package com.epam.homework2;

import com.epam.homework1.Main;

import java.util.Random;
import java.util.logging.Logger;

public class Game {
    private static final Logger logger = Logger.getLogger(Game.class.getName());

    public static void main(String[] args) {


        CitadelHero citadelHero1 = new CitadelHero(7,5,4, 10,6, null, 0, 3,"Wolf Rider");
        CitadelHero citadelHero2 = new CitadelHero(13,11,15, 60,11, null, 25, 4, "Thander Bird");

        citadelHero1.targetEnemy(citadelHero2);
        citadelHero2.targetEnemy(citadelHero1);

        boolean isSomeoneDead=false;



        while (!isSomeoneDead){
            Random random = new Random();
            int i = random.nextInt(51);
            logger.info("Random number is " + i);
            if(i>25){
                logger.info("Hero1 attack");
                if(citadelHero1.getAttack()>= Math.abs(citadelHero2.getxCoordinate()- citadelHero1.getxCoordinate())){
                    citadelHero1.attack();
                    isSomeoneDead = citadelHero2.die();
                } else {
                    logger.info("Hero 1 is moving");
                    citadelHero1.move(citadelHero1.getSpeed());
                }
            }else {
                logger.info("Hero2 attack");
                if(citadelHero2.getAttack()>=Math.abs(citadelHero1.getxCoordinate()-citadelHero2.getxCoordinate())) {
                    citadelHero2.attack();
                    isSomeoneDead = citadelHero1.die();
                } else {
                    logger.info("Hero 2 is moving");

                    citadelHero2.move(citadelHero2.getSpeed());
                }

            }

        }

    }
}
