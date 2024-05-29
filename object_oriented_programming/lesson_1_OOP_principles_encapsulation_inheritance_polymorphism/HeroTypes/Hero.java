package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism.HeroTypes;

import java.util.List;

/**
 * Абстрактный класс
 */

public abstract class Hero extends Point2D{
    protected static int number;

    protected String name;
    protected int currentHealth, maxHealth, currentArmor, basicArmor, accuracy;
    protected int[] damage, distance; // distance - НЕ ОБЪЯВЛЕН!
    protected Point2D pos;


    static {
        Hero.number = 0;
    }

    public Hero(String name, int currentHealth, int basicArmor, int accuracy, int[] damage, Point2D pos) {
        this.name = name;
        this.currentHealth = currentHealth;
        this.maxHealth = currentHealth;
        this.basicArmor = basicArmor;
        this.currentArmor = basicArmor;
        this.accuracy = accuracy;
        this.damage = damage;
        this.pos = pos;
    }


    public int getCurrentHealth() {
        return currentHealth;
    }
    
    public int getCurrentArmor() {
        return currentArmor;
    }

    public void setCurrentArmor(int armor) {
        this.currentArmor = armor;
    }

    public void setCurrentHealth(int health) {
        this.currentHealth = health;
    }
    


    protected boolean isNeedHeal(Hero target) {
        if (target.currentHealth < target.maxHealth && target.currentHealth > 0) 
        {
            return true;
        }
        return false;
    }


    public static int getIndexOfWeakHero(List<Hero> heroes) {
        int index = 0;
        for (int i = 1; i < heroes.size(); i++) {
            if (heroes.get(i).currentHealth < heroes.get(index).currentHealth) {
                index = i;
            }
        }
        return index;
    }



}
