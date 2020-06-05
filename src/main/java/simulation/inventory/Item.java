package simulation.inventory;


public abstract class Item {

    public void createItem(){};
    public void createRandomItem(){};


    public abstract String getName();
    public abstract  double getResistance();
    public abstract int getLevel();
    public abstract int getDamage();

}
