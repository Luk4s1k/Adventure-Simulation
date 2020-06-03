package simulation.enemies;

public class Skeleton extends Enemy {


    public Skeleton(){
        System.out.println("Skeleton was spawned");
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