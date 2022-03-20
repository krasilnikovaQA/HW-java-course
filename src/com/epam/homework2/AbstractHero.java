package com.epam.homework2;

public abstract class AbstractHero {
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
