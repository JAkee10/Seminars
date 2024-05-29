package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism.HeroTypes;

public class Rogue extends Hero {
    
    protected boolean isRage; // Когда окружен входит в состояние Rage. Увеличение урона в 2 раза (длительность 2 хода)

    public Rogue(String name) {
        super(name, 
        100, 
        30, 
        80, 
        new int[] {15, 25}, 
        new Point2D());

        isRage = isSurrounded(this.pos);

    }
    
    public Rogue() {
        this(String.format("Hero #%d", ++Hero.number));
    }


    @Override
    public String toString() {
        return String.format("%s name: %s, HP: %d/%d, AP: %d, DMG: %d-%d, accuracy: %d%%, POS: [%d;%d]", 
        getClass().getSimpleName(), name, currentHealth, maxHealth, armor, damage[0], damage[1], accuracy, pos.x, pos.y);
    }

    protected boolean isSurrounded(Point2D pos) {
        int enemyCount = 0;
        if (closedPos.contains(new Integer[] {pos.x + 1, pos.y})) enemyCount++; 
        if (closedPos.contains(new Integer[] {pos.x - 1, pos.y})) enemyCount++;
        if (closedPos.contains(new Integer[] {pos.x, pos.y + 1})) enemyCount++;
        if (closedPos.contains(new Integer[] {pos.x, pos.y - 1})) enemyCount++;
        if (enemyCount >= 2) return true;            
        return false;
    }

}

