package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism;

public class Rogue extends Hero {
    
    public Rogue(String name) {
        super(name, 
        100, 
        30, 
        80, 
        new int[] {15, 25}, 
        new Point2D());
    }
    
    public Rogue() {
        this(String.format("Hero #%d", ++Hero.number));
    }

    @Override
    public String toString() {
        return String.format("%s name: %s, HP: %d/%d, AP: %d, DMG: %d-%d, accuracy: %d%%, POS: [%d;%d]", 
        getClass().getSimpleName(), name, health, healthMax, armor, damage[0], damage[1], accuracy, pos.x, pos.y);
    }
}
