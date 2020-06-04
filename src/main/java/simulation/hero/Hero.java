package simulation.hero;
import java.util.Random;

import simulation.enemies.Enemy;
import simulation.inventory.*;
import java.util.Scanner;

import java.util.*;



public class Hero {

    private double health;
    private Weapon weapon;
    private Item armor;
    private int level;
    private int experiance;
    private boolean isDead;

    public Hero(){
        Random random = new Random();
        this.health = random.nextInt(200) + 50;
        weaponChoise();
        armorChoise();
        this.level = random.nextInt(20);
        this.experiance = 0;
        printInfo();
    }

    public void weaponChoise() {
        System.out.println("Do you want custom weapon(press 1) or random (press 2)? ");
        Scanner in_w = new Scanner(System.in);
        String input_w = in_w.nextLine();
        int choise_w = Integer.parseInt(input_w);
        switch (choise_w) {
            case 1:
                this.weapon = new WeaponFactory().createWeapon();
                break;
            case 2:
                this.weapon = new WeaponFactory().createRandomWeapon();
                break;
        }
    }


        public void armorChoise(){
            System.out.println("Do you want custom armor(press 1) or random(press 2)? ");
            Scanner in_a = new Scanner(System.in);
            String input_a = in_a.nextLine();
            int choise_a = Integer.parseInt(input_a);
            switch(choise_a){
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
            enemy.reduceHealth(this.weapon.getDamage());
        }

        public void attackedBy(Enemy enemy){
            this.health = this.health - ((enemy.getLevel() * 2) * this.armor.getResistance());
        }

        public double getHealth(){
            return this.health;
        }

        public boolean isDead(){
            return this.isDead;
        }

        public void setIsDead(boolean state){
            this.isDead = state;
        }
    }

