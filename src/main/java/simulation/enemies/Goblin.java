package simulation.enemies;
import java.util.Random;

public class Goblin extends Enemy{


    public Goblin(){
        System.out.println("Goblin was spawned");
    }


    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getHealth() {
        return this.health;
    }
}
