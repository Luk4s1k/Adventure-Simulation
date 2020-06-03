package simulation.inventory;
import java.util.Random;

public class Weapon extends Item {
    private int damage;
    private int level;

    public Weapon(WeaponType weaponType){
        Random random = new Random();
        switch (weaponType){
            case Dagger:
                this.damage = random.nextInt(10);
                this.level = random.nextInt(3);
            case Axe:
                this.damage = random.nextInt(15);
                this.level = random.nextInt(5);
            case Spear:
                this.damage = random.nextInt(20);
                this.level = random.nextInt(7);
            case Sword:
                this.damage = random.nextInt(30);
                this.level = random.nextInt(9);
        }
    }
}
