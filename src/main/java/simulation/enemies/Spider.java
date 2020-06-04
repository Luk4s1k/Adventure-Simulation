package simulation.enemies;

public class Spider extends Enemy{


    public Spider(){
        System.out.println("Spider was spawned hp(" + getHealth() + ") lvl(" + getLevel() + ")");
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
