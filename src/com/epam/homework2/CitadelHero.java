package com.epam.homework2;

import com.epam.homework1.Main;

import java.util.logging.Logger;

public class CitadelHero extends AbstractHero implements HeroActions{

    private static final Logger logger = Logger.getLogger(CitadelHero.class.getName());


    public CitadelHero(int attack, int damage, int defend, int health, int speed, Superpower superpower, int xCoordinate, int attackRange, String heroName) {
        super(heroName, attack, damage, defend, health, speed, superpower, xCoordinate, attackRange);
    }



    @Override
    public void attack() {

        if(getCurrentEnemy().getDefend()>0){
            defend(getDamage(), getCurrentEnemy());
        } else {
            getCurrentEnemy().setHealth(getCurrentEnemy().getHealth()-getDamage());
        }
    }

    @Override
    public void defend(int damage, AbstractHero victim) {

        if(victim.getDefend()>=getDamage()){
            victim.setDefend(victim.getDefend()-getDamage());
        }else {
            victim.setHealth(victim.getDefend()+getCurrentEnemy().getHealth()-getDamage());
            victim.setDefend(0);
        }

        logger.info(victim.getHeroName() + " got damage " + victim.getDamage());
    }

    @Override
    public void move(int speed) {
        if(getCurrentEnemy().getxCoordinate()>=getxCoordinate()){
            logger.info("I am moving to my enemy from left to right");
            if(getxCoordinate()+speed<=getCurrentEnemy().getxCoordinate()) {
                setxCoordinate(getxCoordinate() + speed);
                logger.info("I am far from enemy. Can move closer. My coordinate is " + getxCoordinate());
            } else {
                setxCoordinate(getCurrentEnemy().getxCoordinate());
                logger.info("I am too close to the enemy than I can move. Just stay on my enemy coordinate.");
            }
        } else {
            logger.info("I am moving to my enemy from right to left");

            if(getxCoordinate()-speed>=getCurrentEnemy().getxCoordinate()) {
                setxCoordinate(getxCoordinate() - speed);
                logger.info("I am far from enemy. Can move closer. My coordinate is " + getxCoordinate());
            } else {
                setxCoordinate(getCurrentEnemy().getxCoordinate());
                logger.info("I am too close to the enemy than I can move. Just stay on my enemy coordinate.");
            }
        }

    }

    @Override
    public void targetEnemy(AbstractHero targetEnemy) {

        setCurrentEnemy(targetEnemy);
        logger.info(getHeroName() + "'s enemy is " + getCurrentEnemy().getHeroName());
    }

    @Override
    public boolean die() {
        boolean isDead = getHealth()<=0;
        if(isDead){
            logger.info(getHeroName() + " is dead");
            logger.info(getCurrentEnemy().getHeroName() + " win");
        }
        return isDead;
    }

    @Override
    public void useSuperpower() {

    }
}
