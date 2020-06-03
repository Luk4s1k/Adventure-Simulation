package simulation.enemies;
import simulation.enemies.Goblin;



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
            default:
                System.out.println("Failed to create an Enemy, unknown Enemy Type");
        }
        return enemy;
    }
}
