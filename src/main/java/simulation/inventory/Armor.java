package simulation.inventory;
import java.util.Random;

public class Armor extends Item {
    protected String name;
    protected int level;
    protected double resistance;

    public Armor(ArmorType armorType){
        Random random = new Random();
        switch(armorType){
            case Light:
                this.name = "Ligh Armor";
                this.resistance = 0.2;
                this.level = random.nextInt(3) + 1;
                break;
            case Medium:
                this.name = "Medium Armor";
                this.resistance = 0.4;
                this.level = random.nextInt(4) + 1;
                break;
            case Heavy:
                this.name = "Heavy Armor";
                this.resistance = 0.7;
                this.level = random.nextInt(5) + 1;
                break;
            case Magic:
                this.name = "Magic Armor";
                this.resistance = 0.9;
                this.level = random.nextInt(8) + 1;
                break;
        }
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getResistance() {
        return this.resistance;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getDamage() {
        return 0;
    }


}
