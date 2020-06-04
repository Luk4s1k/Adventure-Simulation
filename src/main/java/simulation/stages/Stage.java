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


}
