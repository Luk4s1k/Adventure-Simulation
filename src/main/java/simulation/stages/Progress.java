package simulation.stages;
import simulation.hero.*;
import simulation.enemies.*;

public class Progress {
    Hero hero;
    StageManager stageManager;

    public Progress(){
        this.hero = new Hero();
        this.stageManager = new StageManager();
    }

    public void startSimulation(){
        passGoblinCave();
        passSpiderNest();
        passGraveyard();
        if(this.hero.isDead()){
            System.out.println("Hero is dead , GAME OVER");
        }
        else{
            System.out.println("You passed all stages, Congratulations!");
        }
    }


    public void passGoblinCave(){
        this.stageManager.enterStage(stageManager.goblinCave);
        fightProcess(StageType.GoblinCave);
        this.stageManager.exitStage(stageManager.goblinCave);
    }

    public void passSpiderNest(){
        this.stageManager.enterStage(stageManager.spiderNest);
        fightProcess(StageType.SpiderNest);
        this.stageManager.exitStage(stageManager.spiderNest);
    }

    public void passGraveyard(){
        this.stageManager.enterStage(stageManager.graveyard);
        fightProcess(StageType.Graveyard);
        this.stageManager.exitStage(stageManager.graveyard);
    }

    public void fightProcess(StageType stageType){

        switch(stageType) {
            case SpiderNest:
                int i = 0;
                while (i < this.stageManager.spiderNest.enemyCapacity) {
                    Enemy enemy = this.stageManager.spiderNest.enemyList.get(i);
                    while (this.hero.getHealth() > 0 && enemy.getHealth() > 0) {
                        this.hero.attacks(enemy);
                        if (enemy.getHealth() <= 0) {
                            System.out.println("Enemy dead");
                            this.hero.addExperience(enemy.getLevel());
                            this.hero.levelUp();
                            System.out.println("Hero hp(" + (int)this.hero.getHealth() + ")" +
                                                    " lvl(" + this.hero.getLevel() + ")" +
                                                    " exp(" + this.hero.getExperiance() + ")");
                            i++;
                        }
                        else{
                            this.hero.attackedBy(enemy);
                        }

                        if (this.hero.getHealth() <= 0) {
                            this.hero.setIsDead(true);
                            break;
                        }

                    }


            }
                break;

            case GoblinCave:
                int k = 0;
                while (k < this.stageManager.goblinCave.enemyCapacity) {
                    Enemy enemy = this.stageManager.goblinCave.enemyList.get(k);
                    while (this.hero.getHealth() > 0 && enemy.getHealth() > 0) {
                        this.hero.attacks(enemy);
                        if (enemy.getHealth() <= 0) {
                            System.out.println("Enemy dead");
                            this.hero.addExperience(enemy.getLevel());
                            this.hero.levelUp();
                            System.out.println("Hero hp("+ (int)this.hero.getHealth() + ")" +
                                                     " lvl(" + this.hero.getLevel() + ")" +
                                                      " exp(" + this.hero.getExperiance() + ")");
                            k++;
                        }
                        else {
                            this.hero.attackedBy(enemy);
                        }
                        if (this.hero.getHealth() <= 0) {
                            this.hero.setIsDead(true);
                            break;
                        }

                    }

                }
                break;
            case Graveyard:
                int j = 0;
                while (j < this.stageManager.graveyard.enemyCapacity) {
                    Enemy enemy = this.stageManager.graveyard.enemyList.get(j);
                    while (this.hero.getHealth() > 0 && enemy.getHealth() > 0) {
                        this.hero.attacks(enemy);
                        if (enemy.getHealth() <= 0) {
                            System.out.println("Enemy dead");
                            this.hero.addExperience(enemy.getLevel());
                            this.hero.levelUp();
                            System.out.println("Hero hp(" + (int)this.hero.getHealth() + ")" +
                                                    " lvl(" + this.hero.getLevel() + ")"+
                                                    " exp(" + this.hero.getExperiance() + ")");
                            j++;
                        }
                        else {
                            this.hero.attackedBy(enemy);
                        }
                        if (this.hero.getHealth() <= 0) {
                            this.hero.setIsDead(true);
                            break;
                        }

                    }

                }
        }
    }
}
