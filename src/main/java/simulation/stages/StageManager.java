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

    public void enterStage(Stage stage){
        System.out.println("You entered " + stage.name);
    }

    public void exitStage(Stage stage){
        System.out.println("You are leaving " + stage.name);
    }


}
