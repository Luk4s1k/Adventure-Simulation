package simulation.stages;

import simulation.stages.*;

/**
 * factory pattern used to create stage entity based on the
 * inserted parameter of the StageType
 */
public class StageFactory {

    public static Stage createStage(StageType stageType){
        Stage stage = null;
        switch(stageType){
            case GoblinCave:
                stage = new GoblinCave();
                break;
            case Graveyard:
                stage = new Graveyard();
                break;
            case SpiderNest:
                stage = new SpiderNest();
                break;
        }
        return stage;
    }
}
