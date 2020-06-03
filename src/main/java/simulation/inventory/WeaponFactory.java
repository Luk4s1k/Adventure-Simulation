package simulation.inventory;
import java.util.Random;
import java.util.Scanner;

public class WeaponFactory extends ItemFactory {
    public Item createWeapon(){
        Item item = null;
        System.out.println("Choose your weapon : Axe(1), Dagger(2), Spear(3), Sword(4)");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int weaponType = Integer.parseInt(input);
        switch(weaponType){
            case 1:
                item = new Weapon(WeaponType.Axe);
            case 2:
                item = new Weapon(WeaponType.Dagger);
            case 3:
                item = new Weapon(WeaponType.Spear);
            case 4:
                item = new Weapon(WeaponType.Sword);
        }
        return item;
    }

    public Item createRandomWeapon(){
        Random random = new Random();
        Item item = null;
        switch(random.nextInt(5)){
            case 1: item = new Weapon(WeaponType.Axe);
            case 2: item = new Weapon(WeaponType.Dagger);
            case 3: item = new Weapon(WeaponType.Spear);
            case 4: item = new Weapon(WeaponType.Sword);
        }
        return item;
    }

}
