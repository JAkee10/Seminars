package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism;

import java.util.Random;

/**
 * Абстрактный класс
 */

public abstract class Hero {
    protected static int number;
    protected static Random rand;

    protected String name;
    protected int health, healthMax, armor, accuracy;
    protected int[] damage;
    protected Point2D pos;


    static {
        Hero.number = 0;
        Hero.rand = new Random();
    }

    public Hero(String name, int health, int armor, int accuracy, int[] damage, Point2D pos) {
        this.name = name;
        this.health = health;
        this.healthMax = health;
        this.armor = armor;
        this.accuracy = accuracy;
        this.damage = damage;
        this.pos = pos;
    }
    
}
