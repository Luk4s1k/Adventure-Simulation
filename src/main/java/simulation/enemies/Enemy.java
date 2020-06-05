package simulation.enemies;

import java.util.Random;

/**
 * This class creates an enemy entity
 * level is generated randomly from 1-11
 * health parameter is based on the level
 * reduce health method used is derived classes as well as
 * other getters
 */
public abstract class Enemy {

    protected int level;
    protected int health;
    protected boolean isDead;
    protected String name;

    public Enemy(){
        Random rand = new Random();
        this.level = rand.nextInt(11) + 1;
        this.health = this.level * 3;
    }

    public abstract int getLevel();
    public abstract int getHealth();
    public abstract String getName();
    public abstract boolean isDead();
    public abstract void reduceHealth(int damage);


}