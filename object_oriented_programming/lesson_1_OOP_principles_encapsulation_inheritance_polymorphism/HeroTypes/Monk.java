package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism.HeroTypes;

import java.util.Random;

public class Monk extends Hero {

    protected int currentMana; // для увеличения брони самого слабого героя (по очкам здоровья) на 10. ЦЕНА: 15
    protected int maxMana;
    
    public Monk(String name) {
        super(name, 
        60, 
        5, 
        100, 
        new int[] {30, 60}, 
        new Point2D());
        
        currentMana = 30;
        maxMana = currentMana;
    }

    public Monk() {
        this(String.format("Hero #%d", ++Hero.number));
    }

    @Override
    public String toString() {
        return String.format("%s name: %s, HP: %d/%d, AP: %d, DMG: %d-%d, accuracy: %d%%, POS: [%d;%d]", 
        getClass().getSimpleName(), name, currentHealth, maxHealth, armor, damage[0], damage[1], accuracy, pos.x, pos.y);
    }


    public void toHealTeammate(Hero target) {
        if (needsHeal(target)) {
            target.currentHealth += new Random().nextInt(this.damage[1]) - this.damage[0];
        }
    }

}
