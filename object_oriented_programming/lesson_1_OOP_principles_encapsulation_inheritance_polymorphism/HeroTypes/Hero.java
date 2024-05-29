package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism.HeroTypes;

import java.util.Random;

/**
 * Абстрактный класс
 */

public abstract class Hero extends Point2D{
    protected static int number;

    protected String name;
    protected int currentHealth, maxHealth, armor, accuracy;
    protected int[] damage;
    protected Point2D pos;


    static {
        Hero.number = 0;
    }

    public Hero(String name, int currentHealth, int armor, int accuracy, int[] damage, Point2D pos) {
        this.name = name;
        this.currentHealth = currentHealth;
        this.maxHealth = currentHealth;
        this.armor = armor;
        this.accuracy = accuracy;
        this.damage = damage;
        this.pos = pos;
    }

    public boolean needsHeal(Hero target) {
        if (target.currentHealth < maxHealth) 
        {
            return true;
        }
        return false;
    }
    
}
