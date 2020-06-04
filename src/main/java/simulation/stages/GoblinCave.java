package simulation.stages;
import simulation.enemies.*;



import java.util.*;

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
