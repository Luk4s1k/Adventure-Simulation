package simulation.stages;

import simulation.enemies.EnemyFactory;
import simulation.enemies.EnemyType;
import java.util.*;

public class SpiderNest extends Stage {

    public SpiderNest(){
        this.name = "Spider Nest";
        this.isActive = false;
        this.enemyCapacity = 6;
        this.enemyList = new ArrayList<>();
        System.out.println("Spider Nest created");
        for (int i = 0; i < this.enemyCapacity; i++){
            EnemyFactory enemyFactory = new EnemyFactory();
            this.enemyList.add(enemyFactory.createEnemy(EnemyType.Spider));}

    }
}
