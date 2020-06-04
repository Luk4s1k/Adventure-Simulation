package simulation.inventory;
import java.util.Random;
import java.util.Scanner;

public class WeaponFactory{

    public Weapon createWeapon(){
        Weapon weapon = null;
        System.out.println("Choose your weapon : Axe(1), Dagger(2), Spear(3), Sword(4)");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int weaponType = Integer.parseInt(input);
        switch(weaponType){
            case 1:
                weapon = new Weapon(WeaponType.Axe);
                break;
            case 2:
                weapon = new Weapon(WeaponType.Dagger);
                break;
            case 3:
                weapon = new Weapon(WeaponType.Spear);
                break;
            case 4:
                weapon = new Weapon(WeaponType.Sword);
                break;
        }
        return weapon;
    }

    public Weapon createRandomWeapon(){
        Weapon weapon = null;
        Random random = new Random();
        int rand = random.nextInt(5);
        switch(rand){
            case 1: weapon = new Weapon(WeaponType.Axe);
                break;
            case 2: weapon = new Weapon(WeaponType.Dagger);
                break;
            case 3: weapon = new Weapon(WeaponType.Spear);
                break;
            case 4: weapon = new Weapon(WeaponType.Sword);
                break;
        }
        return weapon;
    }

}
