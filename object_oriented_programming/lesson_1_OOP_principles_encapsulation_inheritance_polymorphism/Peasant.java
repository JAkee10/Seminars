package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism;

public class Peasant extends Hero {
    
    public Peasant(String name) {
        super(name, 
        100, 
        0, 
        100, 
        new int[] {0, 0}, 
        new Point2D());
    }
    
    public Peasant() {
        this(String.format("Hero #%d", ++Hero.number));
    }

    @Override
    public String toString() {
        return String.format("%s name: %s, HP: %d/%d, AP: %d, DMG: %d-%d, accuracy: %d%%, POS: [%d;%d]", 
        getClass().getSimpleName(), name, health, healthMax, armor, damage[0], damage[1], accuracy, pos.x, pos.y);
    }
}
