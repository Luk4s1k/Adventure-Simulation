package simulation.stages;

import simulation.hero.*;
import simulation.enemies.*;

/**
 * includes hero entity and stageManager to interact with one another
 * initiates fight process which shows message to the user who has attacked whom on the
 * certain stage which hero has entered
 * Hero attacks first and if it kill the enemy he adds up his experience
 * enemy attacks next and if it kill the hero informs user that game is over
 * in case hero kill all the enemies from the stage stage state is changed to inactive
 * an hero enters another stage
 * in case all stages are are passed users receives message in console about his result
 */
public class Progress {
    Hero hero;
    StageManager stageManager;

    public Progress() {
        this.hero = new Hero();
        this.stageManager = new StageManager();
    }

    public void startSimulation() {

        if (passGoblinCave() && passSpiderNest() && passGraveyard()) {
            System.out.println("You passes all stages, Congratulations!");
        } else {
            System.out.println("Game Over");

        }


    }


    public boolean passGoblinCave() {
        this.stageManager.enterStage(stageManager.goblinCave);
        if (fightProcess(StageType.GoblinCave)) {
            this.stageManager.exitStage(stageManager.goblinCave);
        } else {
            return false;
        }
        return true;
    }

    public boolean passSpiderNest() {
        this.stageManager.enterStage(stageManager.spiderNest);
        if (fightProcess(StageType.SpiderNest)) {
            this.stageManager.exitStage(stageManager.spiderNest);
        } else {
            return false;
        }
        return true;
    }

    public boolean passGraveyard() {
        this.stageManager.enterStage(stageManager.graveyard);
        if (fightProcess(StageType.Graveyard)) {
            this.stageManager.exitStage(stageManager.graveyard);
        } else {
            return false;
        }
        return true;
    }

    public boolean fightProcess(StageType stageType) {

        switch (stageType) {
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
                            System.out.println("Hero hp(" + (int) this.hero.getHealth() + ")" +
                                    " lvl(" + this.hero.getLevel() + ")" +
                                    " exp(" + this.hero.getExperiance() + ")");
                            i++;
                        } else {
                            this.hero.attackedBy(enemy);
                            if (this.hero.getHealth() <= 0) {
                                this.hero.killed();
                                if (this.hero.isDead()) {
                                    System.out.println("Hero is dead");
                                }
                                return false;

                            }
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
                            System.out.println("Hero hp(" + (int) this.hero.getHealth() + ")" +
                                    " lvl(" + this.hero.getLevel() + ")" +
                                    " exp(" + this.hero.getExperiance() + ")");
                            k++;
                        } else {
                            this.hero.attackedBy(enemy);
                            if (this.hero.getHealth() <= 0) {
                                this.hero.killed();
                                if (this.hero.isDead()) {
                                    System.out.println("Hero is dead");
                                }
                                return false;

                            }
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
                            System.out.println("Hero hp(" + (int) this.hero.getHealth() + ")" +
                                    " lvl(" + this.hero.getLevel() + ")" +
                                    " exp(" + this.hero.getExperiance() + ")");
                            j++;
                        } else {
                            this.hero.attackedBy(enemy);
                            if (this.hero.getHealth() <= 0) {
                                this.hero.killed();
                                if (this.hero.isDead()) {
                                    System.out.println("Hero is dead");
                                }
                                return false;
                            }
                        }


                    }

                }

                break;
        }
        return true;
    }
}
