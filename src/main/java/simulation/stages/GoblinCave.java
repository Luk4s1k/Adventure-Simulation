package simulation.stages;
import simulation.enemies.*;



import java.util.*;

/**
 * creates an entity of the Goblin cave
 * and fills up the enemy list via cycle calling the enemyFactory to
 * create enemy entities based on the Stage
 * and informs the user that the entity was created
 */
public class GoblinCave extends Stage{


    public GoblinCave(){
        this.name = "Goblin Cave";
        this.isActive = false;
        this.enemyCapacity = 3;
        this.enemyList = new ArrayList<>();
        System.out.println("Goblin Cave created");
        for (int i = 0; i < this.enemyCapacity; i++){
            EnemyFactory enemyFactory = new EnemyFactory();
            this.enemyList.add(enemyFactory.createEnemy(EnemyType.Goblin));}


    }
}
