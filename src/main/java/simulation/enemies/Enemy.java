package simulation.enemies;

import java.util.Random;

public abstract class Enemy {
    protected int level;
    protected int health;

    public Enemy(){
        Random rand = new Random();
        this.level = rand.nextInt(11);
        this.health = this.level * 2;
    }

    public abstract int getLevel();
    public abstract int getHealth();
}