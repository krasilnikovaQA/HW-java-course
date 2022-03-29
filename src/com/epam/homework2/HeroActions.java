package com.epam.homework2;

public interface HeroActions {
    void attack();

    void defend(int damage, AbstractHero victim);

    void move(int speed);

    void targetEnemy(AbstractHero targetEnemy);

    boolean checkHeroDead();

    void useSuperpower();

    void action();
}
