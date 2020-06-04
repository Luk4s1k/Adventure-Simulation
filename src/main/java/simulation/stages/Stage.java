package simulation.stages;

import java.util.*;
import simulation.enemies.*;

public class Stage {
    protected String name;
    protected int enemyCapacity;
    protected List<Enemy> enemyList;
    protected boolean isActive;


    public String getName(){
        return this.name;
    };

    public boolean isActive(){
        return this.isActive;
    };

    public void setisActive(boolean state){
        this.isActive = state;
        if (state) {
            System.out.println("You entered" + this.name);
        }
        else {
            System.out.println("You are leaving" + this.name);
        }
    }
}
