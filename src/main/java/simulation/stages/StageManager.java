package simulation.stages;

import simulation.stages.*;
import java.util.*;

public class StageManager {
    public Stage goblinCave;
    public Stage graveyard;
    public Stage spiderNest;

    public  StageManager(){
        StageFactory stageFactory = new StageFactory();
        goblinCave = stageFactory.createStage(StageType.GoblinCave);
        graveyard = stageFactory.createStage(StageType.Graveyard);
        spiderNest = stageFactory.createStage(StageType.SpiderNest);


    }

    public void activateStage(Stage stage){
        stage.setisActive(true);
    }

    public void deactivateStage(Stage stage){
        stage.setisActive(false);
    }
}
