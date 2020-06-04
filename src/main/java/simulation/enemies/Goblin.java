package simulation.enemies;
import java.util.Random;

public class Goblin extends Enemy{


    public Goblin(){
        System.out.println("Goblin was spawned : hp(" + getHealth() + ") lvl(" + getLevel() + ")");
    }


    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void reduceHealth(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isDead() {
        return false;
    }
}
