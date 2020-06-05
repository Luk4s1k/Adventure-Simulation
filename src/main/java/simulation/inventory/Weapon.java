package simulation.inventory;
import java.util.Random;

/**
 * creates an entity based of inserted weaponType
 *   varies between Axe , Dagger , Spear and Sword
 *   overrides getters from the super class Item
 */
public class Weapon extends Item {
    protected String name;
    protected int level;
    protected int damage;

    public Weapon(WeaponType weaponType){
        Random random = new Random();
        switch (weaponType){
            case Dagger:
                this.name = "Dagger";
                this.damage = random.nextInt(10);
                this.level = random.nextInt(3) + 1;
                break;
            case Axe:
                this.name = "Axe";
                this.damage = random.nextInt(15);
                this.level = random.nextInt(5) + 1;
                break;
            case Spear:
                this.name = "Spear";
                this.damage = random.nextInt(20);
                this.level = random.nextInt(7) + 1;
                break;
            case Sword:
                this.name = "Sword";
                this.damage = random.nextInt(30);
                this.level = random.nextInt(9) + 1;
                break;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getResistance() {
        return 0;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }
}
