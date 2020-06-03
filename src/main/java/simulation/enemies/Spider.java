package simulation.enemies;

public class Spider extends Enemy{


    public Spider(){
        System.out.println("Spider was spawned");
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
