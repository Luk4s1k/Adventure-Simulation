package simulation.hero;
import java.util.Random;

import simulation.enemies.Enemy;
import simulation.inventory.*;
import java.util.Scanner;


public class Hero {

    private float health;
    private Weapon weapon;
    private Armor armor;
    private int level;
    private float experiance;
    private boolean isDead;

    public Hero(){
        Random random = new Random();
        this.isDead = false;
        this.health = random.nextInt(100) + 50;
        weaponChoice();
        armorChoice();
        this.level = random.nextInt(20);
        this.experiance = 0;
        printInfo();
    }

    public void weaponChoice() {
        System.out.println("Do you want custom weapon(press 1) or random (press 2)? ");
        Scanner in_w = new Scanner(System.in);
        String input_w = in_w.nextLine();
        int choice_w = Integer.parseInt(input_w);
        switch (choice_w) {
            case 1:
                this.weapon = new WeaponFactory().createWeapon();
                break;
            case 2:
                this.weapon = new WeaponFactory().createRandomWeapon();
                break;
        }
    }


        public void armorChoice(){
            System.out.println("Do you want custom armor(press 1) or random(press 2)? ");
            Scanner in_a = new Scanner(System.in);
            String input_a = in_a.nextLine();
            int choice_a = Integer.parseInt(input_a);
            switch(choice_a){
                case 1: this.armor = new ArmorFactory().createArmor();
                    break;
                case 2: this.armor = new ArmorFactory().createRandomArmor();
                    break;
            }

        }
        public void printInfo(){
            System.out.println("Health : " + this.health);
            System.out.println("Level : " + this.level);
            System.out.println("Weapon : " + this.weapon.getName());
            System.out.println("damage \t" + this.weapon.getDamage());
            System.out.println("level \t" + this.weapon.getLevel());
            System.out.println("Armor : " + this.armor.getName());
            System.out.println("damage \t" + this.armor.getResistance());
            System.out.println("level \t" + this.armor.getLevel());
        }

        public void attacks(Enemy enemy){
        System.out.println("Hero attacks " + enemy.getName() + " lvl(" + enemy.getLevel() + ")");
        enemy.reduceHealth(this.weapon.getDamage() + this.getLevel());
        System.out.println("Hero dealt " + (this.weapon.getDamage() + this.getLevel()) + " damage");

        }

        public void attackedBy(Enemy enemy){
            System.out.println(enemy.getName() + " attacks hero");
            this.health = (float) (this.health - ((enemy.getLevel() * 2) * this.armor.getResistance()));
            System.out.println("Hero got " + (int)((enemy.getLevel() * 2) * this.armor.getResistance()) + " damage");
        }



        public void addExperience(int amount){
            this.experiance += amount;
        }

        public void levelUp(){
            if(this.experiance >= 10){
                int levelUp = (int)experiance/10;
                this.level += levelUp;
                this.experiance = experiance%10;}
        }

    public float getExperiance(){return this.experiance;}
    public int getLevel(){ return this.level; }
    public float getHealth(){ return this.health; }

    public boolean isDead(){
        return this.isDead;
    }

    public void killed(){
        this.isDead = true;
    }
    }

