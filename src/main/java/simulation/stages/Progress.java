package simulation.stages;
import simulation.hero.*;
import simulation.enemies.*;

public class Progress {
    Hero hero;
    StageManager stageManager;

    public Progress(){
        Hero hero = new Hero();
        StageManager stageManager = new StageManager();
    }

    public void startSimulation(){
        passGoblinCave();
        passSpiderNest();
        passGraveyard();
        if(this.hero.isDead()){
            System.out.println("Hero is dead , GAME OVER");
        }
    }


    public void passGoblinCave(){
        this.stageManager.goblinCave.setisActive(true);
        for (int i = 0; i < this.stageManager.goblinCave.enemyCapacity;i++) {
            Enemy enemy = this.stageManager.goblinCave.enemyList.get(i);
            this.hero.attacks(enemy);
            this.hero.attackedBy(enemy);
            if( this.hero.getHealth() <= 0){
                this.hero.setIsDead(true);
            }
        }
        this.stageManager.goblinCave.setisActive(false);
    }

    public void passSpiderNest(){
        this.stageManager.spiderNest.setisActive(true);
        for (int i = 0; i < this.stageManager.spiderNest.enemyCapacity;i++) {
            Enemy enemy = this.stageManager.spiderNest.enemyList.get(i);
            this.hero.attacks(enemy);
            this.hero.attackedBy(enemy);
            if( this.hero.getHealth() <= 0){
                this.hero.setIsDead(true);
            }
        }
        this.stageManager.spiderNest.setisActive(false);
    }

    public void passGraveyard(){
        this.stageManager.graveyard.setisActive(true);
        for (int i = 0; i < this.stageManager.graveyard.enemyCapacity;i++) {
            Enemy enemy = this.stageManager.graveyard.enemyList.get(i);
            this.hero.attacks(enemy);
            this.hero.attackedBy(enemy);
            if( this.hero.getHealth() <= 0){
                this.hero.setIsDead(true);
            }
        }
        this.stageManager.graveyard.setisActive(false);
    }
}
