package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism.HeroTypes;

public class Wizard extends Hero {
    
    protected int stockOfAmmo; // Запас снарядов
    protected int ammoDeliverySpeed;
    
    public Wizard(String name) {
        super(name, 
        60, 
        5, 
        100, 
        new int[] {-60, -40}, 
        new Point2D());
        
        stockOfAmmo = 10;
        ammoDeliverySpeed = 2;
    }

    public Wizard() {
        this(String.format("Hero #%d", ++Hero.number));
    }

    @Override
    public String toString() {
        return String.format("%s name: %s, HP: %d/%d, AP: %d, DMG: %d-%d, accuracy: %d%%, POS: [%d;%d]", 
        getClass().getSimpleName(), name, currentHealth, maxHealth, armor, damage[0], damage[1], accuracy, pos.x, pos.y);
    }
}
