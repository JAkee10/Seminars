package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism.HeroTypes;

public class Peasant extends Hero {
    
    private int counter = 1;

    protected int maxStockOfAmmo; // Максимальный запас снарядов
    protected int currentStockOfAmmo; // Текущий запас снарядов
    protected int reloadStoakSpeed; // Скорость пополнения запаса (колличество ходов требуемых для перезарядки)
    protected int ammoDeliveryCount; // Количество переданных снарядов

    
    public Peasant(String name) {
        super(name, 
        100, 
        0, 
        100, 
        new int[] {0, 0}, 
        new Point2D());

        reloadStoakSpeed = 1;
        maxStockOfAmmo = 10;
        currentStockOfAmmo = maxStockOfAmmo;
        ammoDeliveryCount = 2;
    }
    
    public Peasant() {
        this(String.format("Hero #%d", ++Hero.number));
    }

    @Override
    public String toString() {
        return String.format("%s name: %s, HP: %d/%d, AP: %d, DMG: %d-%d, accuracy: %d%%, POS: [%d;%d]", 
        getClass().getSimpleName(), name, currentHealth, maxHealth, currentArmor, damage[0], damage[1], accuracy, pos.x, pos.y);
    }


    public void getAmmo(Crossbower crossbower) {
        System.out.println("AmmoCount: " + this.currentStockOfAmmo);
        if (this.currentStockOfAmmo > 0 && crossbower.currentAmmo < crossbower.maxAmmo) {
            if (crossbower.currentAmmo + this.ammoDeliveryCount > crossbower.maxAmmo) {
                this.currentStockOfAmmo -= crossbower.maxAmmo - crossbower.currentAmmo;
                crossbower.currentAmmo = crossbower.maxAmmo;
            } else {
                crossbower.currentAmmo += this.ammoDeliveryCount;
                this.currentStockOfAmmo -= this.ammoDeliveryCount;
            }
        } else {
            stockReload();
        }
        System.out.println("AmmoCount now: " + this.currentStockOfAmmo);
    }

    public void stockReload() {
        System.out.println("Процесс перезараядки: " + counter + "/" + reloadStoakSpeed);
        if (this.counter == reloadStoakSpeed) {
            this.currentStockOfAmmo = this.maxStockOfAmmo;
            counter = 1;
        } else {
            counter++;
        }
    }

}
