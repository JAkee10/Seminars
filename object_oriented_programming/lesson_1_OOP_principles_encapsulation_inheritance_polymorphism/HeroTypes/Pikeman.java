package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism.HeroTypes;

import java.util.Random;

public class Pikeman extends Hero {

    protected boolean isRage; // Когда окружен входит в состояние Rage. Увеличение урона в 2 раза (длительность 2 хода)
    protected boolean enemyIsNear;
    
    public Pikeman(String name) {
        super(name, 
        100, 
        20, 
        80, 
        new int[] {15, 25}, 
        new Point2D());
        
        isRage = isSurrounded(this.pos);
        
    }
    
    public Pikeman() {
        this(String.format("Hero #%d", ++Hero.number));
    }

    @Override
    public String toString() {
        return String.format("%s name: %s, HP: %d/%d, AP: %d, DMG: %d-%d, accuracy: %d%%, POS: [%d;%d]", 
        getClass().getSimpleName(), name, currentHealth, maxHealth, currentArmor, damage[0], damage[1], accuracy, pos.x, pos.y);
    }

    protected boolean enemyIsNear(Point2D pos) {
        int enemyCount = getEnemyCountIsNear(pos);
        if (enemyCount > 0 ) return true;
        return false;
    }

    protected boolean isSurrounded(Point2D pos) {
        int enemyCount = getEnemyCountIsNear(pos);
        if (enemyCount >= 2) return true;            
        return false;
    }

    private int getEnemyCountIsNear(Point2D pos) {
        int enemyCount = 0;
        if (closedPos.contains(new Integer[] {pos.x + 1, pos.y})) enemyCount++; 
        if (closedPos.contains(new Integer[] {pos.x - 1, pos.y})) enemyCount++;
        if (closedPos.contains(new Integer[] {pos.x, pos.y + 1})) enemyCount++;
        if (closedPos.contains(new Integer[] {pos.x, pos.y - 1})) enemyCount++;
        return enemyCount;
    }


    public void getAttack(Hero target) {
        if (enemyIsNear && new Random().nextInt(101) < this.accuracy) {         // enemyIsNear (НЕ ОПРЕДЕЛЕН!)
            int damage = new Random().nextInt(this.damage[0] + this.damage[1] - this.damage[0]);
            if (target.currentHealth - damage > 0) {
                target.currentHealth -= damage;
            } else {
                target.currentHealth = 0;
            }
        }
    }
    
}
