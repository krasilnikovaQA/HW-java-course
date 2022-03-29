package com.epam.homework2;

import java.util.Random;
import java.util.logging.Logger;

public abstract class AbstractHero implements HeroActions {
    public static final int BOUND = 51;
    public static final int MIDDLE_VALUE = 25;
    private final String heroName;
    private int attack;
    private int damage;
    private int defend;
    private int health;
    private int speed;
    private Superpower superpower;
    private int xCoordinate;
    private AbstractHero currentEnemy;
    private int attackRange;

    private static final Logger logger = Logger.getLogger(AbstractHero.class.getName());


    public AbstractHero(String heroName, int attack, int damage, int defend, int health, int speed, Superpower superpower, int xCoordinate, int attackRange) {
        this.heroName = heroName;
        this.attack = attack;
        this.damage = damage;
        this.defend = defend;
        this.health = health;
        this.speed = speed;
        this.superpower = superpower;
        this.xCoordinate = xCoordinate;
        this.attackRange = attackRange;
    }

    @Override
    public void attack() {
        if (getCurrentEnemy().getDefend() > 0) {
            defend(getDamage(), getCurrentEnemy());
        } else {
            getCurrentEnemy().setHealth(getCurrentEnemy().getHealth() - getDamage());
        }
    }

    @Override
    public void defend(int damage, AbstractHero victim) {

        if (victim.getDefend() >= getDamage()) {
            victim.setDefend(victim.getDefend() - getDamage());
        } else {
            victim.setHealth(victim.getDefend() + getCurrentEnemy().getHealth() - getDamage());
            victim.setDefend(0);
        }

        logger.info(victim.getHeroName() + " got damage " + victim.getDamage());
    }

    @Override
    public void move(int speed) {

        if (getCurrentEnemy().getxCoordinate() >= getxCoordinate()) {
            logger.info("I am moving to my enemy from left to right");
            if (getxCoordinate() + speed <= getCurrentEnemy().getxCoordinate()) {
                setxCoordinate(getxCoordinate() + speed);
                logger.info("I am far from enemy. Can move closer. My coordinate is " + getxCoordinate());
            } else {
                setxCoordinate(getCurrentEnemy().getxCoordinate());
                logger.info("I am too close to the enemy than I can move. Just stay on my enemy coordinate.");
            }
        } else {
            logger.info("I am moving to my enemy from right to left");

            if (getxCoordinate() - speed >= getCurrentEnemy().getxCoordinate()) {
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
    public boolean checkHeroDead() {

        boolean isDead = getHealth() <= 0;
        if (isDead) {
            logger.info(getHeroName() + " is dead");
            logger.info(getCurrentEnemy().getHeroName() + " win");
        }
        return isDead;
    }

    @Override
    public void useSuperpower() {
        logger.info(getHeroName() + " use superpower");
    }

    @Override
    public void action() {
        int i = new Random().nextInt(BOUND);
        logger.info("Random number is " + i);
        if (i > MIDDLE_VALUE) {
            useSuperpower();
            return;
        }

        if (getAttack() >= Math.abs(getxCoordinate() - currentEnemy.getxCoordinate())) {
            attack();
        } else {
            logger.info("Hero 1 is moving");
            move(getSpeed());
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Superpower getSuperpower() {
        return superpower;
    }

    public void setSuperpower(Superpower superpower) {
        this.superpower = superpower;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public AbstractHero getCurrentEnemy() {
        return currentEnemy;
    }

    public void setCurrentEnemy(AbstractHero currentEnemy) {
        this.currentEnemy = currentEnemy;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }


    public String getHeroName() {
        return heroName;
    }


}
