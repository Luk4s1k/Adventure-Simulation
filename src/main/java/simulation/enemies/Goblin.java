package simulation.enemies;
import java.util.Random;

/**
 * When entity is created put info to the console to inform the user
 * Info provided : name, health and level of the created entity
 */
public class Goblin extends Enemy{


    public Goblin(){
        this.name = "Goblin";
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

    @Override
    public String getName() {
        return this.name;
    }
}
