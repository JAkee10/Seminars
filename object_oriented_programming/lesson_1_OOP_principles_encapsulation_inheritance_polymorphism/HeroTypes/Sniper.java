package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism.HeroTypes;

public class Sniper extends Hero {
    
    protected int maxRangeAttack;
    protected int currentAmmo;
    protected int maxAmmo;
    
    public Sniper(String name) {
        super(name, 
        80, 
        15, 
        50, 
        new int[] {20, 40}, 
        new Point2D());

        maxRangeAttack = 5;
        currentAmmo = 5;
        maxAmmo = 15;
    }

    public Sniper() {
        this(String.format("Hero #%d", ++Hero.number));
    }

    @Override
    public String toString() {
        return String.format("%s name: %s, HP: %d/%d, AP: %d, DMG: %d-%d, accuracy: %d%%, POS: [%d;%d]", 
        getClass().getSimpleName(), name, currentHealth, maxHealth, armor, damage[0], damage[1], accuracy, pos.x, pos.y);
    }
}
