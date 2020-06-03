package simulation.hero;
import java.util.Random;

import simulation.inventory.*;
import java.util.Scanner;

import java.util.*;



public class Hero {
    private int health;
    private Item weapon;
    private Item armor;
    private int level;
    private int experiance;

    public Hero(){
        Random random = new Random();
        this.health = random.nextInt(200) + 50;
        System.out.println("Health : " + this.health);


        System.out.println("Do you want custom weapon(press 1) or random (press 2)? ");
        Scanner in_w = new Scanner(System.in);
        String input_w = in_w.nextLine();
        int choise_w = Integer.parseInt(input_w);
        switch(choise_w){
            case 1: this.weapon = new WeaponFactory().createWeapon(); break;
            case 2: this.weapon = new WeaponFactory().createRandomWeapon(); break;
        }
        System.out.println("Weapon : " + this.weapon);



        System.out.println("Do you want custom armor(press 1) or random(press 2)? ");
        Scanner in_a = new Scanner(System.in);
        String input_a = in_a.nextLine();
        int choise_a = Integer.parseInt(input_a);
        switch(choise_a){
            case 1: this.armor = new ArmorFactory().createArmor(); break;
            case 2: this.armor = new ArmorFactory().createRandomArmor(); break;
        }
        System.out.println("Armor : " + this.armor);


        this.level = random.nextInt(20);
        System.out.println("Level : " + this.level);


        this.experiance = 0;
    }

}
