package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism;

public class Crossbower extends Hero {

    protected int maxRangeDamage;
    
    public Crossbower(String name) {
        super(name, 
        80, 
        15, 
        50, 
        new int[] {20, 40}, 
        new Point2D());
        maxRangeDamage = 5;
    }

    public Crossbower() {
        this(String.format("Hero #%d", ++Hero.number));
    }

    @Override
    public String toString() {
        return String.format("%s name: %s, HP: %d/%d, AP: %d, DMG: %d-%d, accuracy: %d%%, POS: [%d;%d]", 
        getClass().getSimpleName(), name, health, healthMax, armor, damage[0], damage[1], accuracy, pos.x, pos.y);
    }
}
