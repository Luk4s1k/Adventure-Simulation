package simulation.enemies;

import java.util.Random;

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
    public abstract void reduceHealth(int damage);
    public abstract boolean isDead();
    public abstract String getName();
}