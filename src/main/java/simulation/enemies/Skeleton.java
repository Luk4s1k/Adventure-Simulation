package simulation.enemies;

public class Skeleton extends Enemy {


    public Skeleton(){
        this.name = "Skeleton";
        System.out.println("Skeleton was spawned : hp(" + getHealth() + ") lvl(" + getLevel() + ")");
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