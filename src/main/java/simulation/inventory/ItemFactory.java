package simulation.inventory;
import simulation.inventory.ItemType;

import java.util.Scanner;
import java.util.Random;


public class ItemFactory {

    public Item createItem(ItemType itemType){
        ArmorFactory armorFactory = null;
        WeaponFactory weaponFactory = null;
        Item item = null;
        switch(itemType){
            case Armor:
                item = armorFactory.createArmor();
                break;
            case Weapon:
                item = weaponFactory.createWeapon();
                break;

        }
        return item;
    }


    public Item createRandomItem(){
        Item item = null;
        Random random = new Random();
        ArmorFactory armorFactory = null;
        WeaponFactory weaponFactory = null;
        switch(random.nextInt(3)){
            case 1:
                item = armorFactory.createRandomArmor();
                break;
            case 2:
                item = weaponFactory.createRandomWeapon();
                break;
            default:
                System.out.println("Failed to create random item");
        }
        return item;
    }
}
