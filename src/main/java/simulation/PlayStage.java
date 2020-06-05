package simulation;

import simulation.stages.Progress;

public class PlayStage {
    public static void main(String[] args) {
        Progress progress = new Progress();
        progress.startSimulation();
    }
}
