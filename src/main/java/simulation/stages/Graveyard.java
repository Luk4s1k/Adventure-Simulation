package simulation.stages;

import java.util.*;
import simulation.enemies.EnemyFactory;
import simulation.enemies.EnemyType;

public class Graveyard extends Stage{

    public Graveyard(){
        this.name = "Graveyard";
        this.isActive = false;
        this.enemyCapacity = 5;
        this.enemyList = new ArrayList<>();
        System.out.println("Graveyard created");
        for (int i = 0; i < this.enemyCapacity; i++){
            EnemyFactory enemyFactory = new EnemyFactory();
            this.enemyList.add(enemyFactory.createEnemy(EnemyType.Skeleton));}

    }

}
