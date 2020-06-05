package simulation.stages;

import simulation.enemies.EnemyFactory;
import simulation.enemies.EnemyType;
import java.util.*;

/**
 * creates an entity of the Spider Nest
 * and fills up the enemy list via cycle calling the enemyFactory to
 * create enemy entities based on the Stage
 * and informs the user that the entity was created
 */
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
