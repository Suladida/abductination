import static java.lang.System.*;

public enum Spacecraft {

    MOTHERSHIP(1, 1000, 10000),
    VOYAGER(2,100,2000),
    NIMBUS(3, 50,1000),
    FIREFLY(4,25,150),
    PLANETEXPRESS(5,10,50);

    private final int level;
    private final int maxCells;
    private final int maxMeals;

    Spacecraft(int level, int maxCells, int maxMeals){
        this.level = level;
        this.maxCells = maxCells;
        this.maxMeals = maxMeals;
    }

    public int getLevel(){
        return level;
    }

    public int getMaxCells(){
        return maxCells;
    }

    public int getMaxMeals(){
        return maxMeals;
    }

    public int getCells() {
        return maxCells;
    }
}
