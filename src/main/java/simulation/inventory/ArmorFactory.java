package simulation.inventory;

import java.util.Random;
import java.util.Scanner;

public class ArmorFactory extends ItemFactory {


    public Item createArmor(){
        Item item = null;
        System.out.println("Choose your weapon : Light(1), Medium(2) ,Heavy(3), Magic(4)");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int armorType = Integer.parseInt(input);

        switch(armorType){
            case 1:
                item = new Armor(ArmorType.Light);
            case 2:
                item = new Armor(ArmorType.Medium);
            case 3:
                item = new Armor(ArmorType.Heavy);
            case 4:
                item = new Armor(ArmorType.Magic);
        }
        return item;
    }

    public Item createRandomArmor(){
        Random random = new Random();
        Item item = null;
        switch(random.nextInt(5)){
            case 1: item = new Armor(ArmorType.Light);
            case 2: item = new Armor(ArmorType.Medium);
            case 3: item = new Armor(ArmorType.Heavy);
            case 4: item = new Armor(ArmorType.Magic);
        }
        return item;
    }
}
