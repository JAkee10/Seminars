package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism.HeroTypes;

import java.util.Random;

public class Wizard extends Hero {
    
    protected int abilityPower, abilityCost;
    protected int currentMana; // для увеличения брони самого слабого героя (по очкам здоровья) на 10. ЦЕНА: 15
    protected int maxMana;
    
    public Wizard(String name) {
        super(name, 
        60, 
        5, 
        100, 
        new int[] {-60, -40}, 
        new Point2D());
        
        abilityPower = 10;
        abilityCost = 15;
        currentMana = 30;
        maxMana = currentMana;
    }

    public Wizard() {
        this(String.format("Hero #%d", ++Hero.number));
    }

    @Override
    public String toString() {
        return String.format("%s name: %s, HP: %d/%d, AP: %d, DMG: %d-%d, accuracy: %d%%, POS: [%d;%d]", 
        getClass().getSimpleName(), name, currentHealth, maxHealth, currentArmor, damage[0], damage[1], accuracy, pos.x, pos.y);
    }


    public void healTeammate(Hero target) {
        if (isNeedHeal(target)) {
            int heal = new Random().nextInt(this.damage[1] - this.damage[0]) + this.damage[0];
            if ((target.currentHealth + heal) > target.maxHealth) {
                System.out.println("NEED HEALING for" + heal + "HP");
                target.currentHealth = target.maxHealth;
            } else {
                System.out.println("NEED HEALING for " + heal + " HP");
                target.currentHealth += heal;
            }
        }
    }

    public void castAbility(Hero target) {
        if (this.currentMana >= this.abilityCost) {
            target.setCurrentArmor(target.currentArmor + this.abilityPower);
            this.currentMana -= this.abilityCost;
        }
    }


}
