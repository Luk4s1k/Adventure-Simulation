package simulation.inventory;

import java.util.Random;
import java.util.Scanner;

/**
 * provides user with message to choose the armor if his previous choice
 * was to create a custom armor and creates a random entity if user had chosen
 * a random entity creation before
 */
public class ArmorFactory{


    public Armor createArmor(){
        Armor armor = null;
        System.out.println("Choose your weapon : Light(1), Medium(2) ,Heavy(3), Magic(4)");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int armorType = Integer.parseInt(input);

        switch(armorType){
            case 1:
                armor = new Armor(ArmorType.Light);
                break;
            case 2:
                armor = new Armor(ArmorType.Medium);
                break;
            case 3:
                armor = new Armor(ArmorType.Heavy);
                break;
            case 4:
                armor = new Armor(ArmorType.Magic);
                break;
        }
        return armor;
    }

    public Armor createRandomArmor(){
        Random random = new Random();
        Armor armor = null;
        switch(random.nextInt(5)){
            case 1: armor = new Armor(ArmorType.Light);
                break;
            case 2: armor = new Armor(ArmorType.Medium);
                break;
            case 3: armor = new Armor(ArmorType.Heavy);
                break;
            case 4: armor = new Armor(ArmorType.Magic);
                break;
        }
        return armor;
    }
}
