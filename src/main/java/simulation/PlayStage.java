package simulation;

import simulation.inventory.ArmorFactory;
import simulation.inventory.WeaponFactory;
import simulation.inventory.ItemFactory;
import simulation.hero.Hero;
import simulation.stages.Progress;
import simulation.stages.StageFactory;
import simulation.stages.StageManager;
import simulation.stages.StageType;

public class PlayStage {
    public static void main(String[] args) {
        Progress progress = new Progress();
        progress.startSimulation();
    }
}
