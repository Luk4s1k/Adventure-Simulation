package simulation.enemies;
import simulation.enemies.Goblin;


/**
 * Factory pattern used to create specified
 * Enemy entities such as Goblin Skeleton and Spider
 * createEnemy function should get the enum of enemyType
 */
public class EnemyFactory {


    public static Enemy createEnemy(EnemyType enemyType){
        Enemy enemy = null;
        switch(enemyType){
            case Goblin:
                enemy = new Goblin();
                break;
            case Spider:
                enemy = new Spider();
                break;
            case Skeleton:
                enemy = new Skeleton();
                break;
        }
        return enemy;
    }
}
