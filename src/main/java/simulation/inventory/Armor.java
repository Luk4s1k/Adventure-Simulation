package simulation.inventory;
import java.util.Random;

public class Armor extends Item {
    private double resistance;
    private int level;



    public Armor(ArmorType armorType){
        Random random = new Random();
        switch(armorType){
            case Light:
                this.resistance = 0.2;
                this.level = random.nextInt(3);
            case Medium:
                this.resistance = 0.4;
                this.level = random.nextInt(4);
            case Heavy:
                this.resistance = 0.7;
                this.level = random.nextInt(5);
            case Magic:
                this.resistance = 0.9;
                this.level = random.nextInt(8);
        }
    }


}
