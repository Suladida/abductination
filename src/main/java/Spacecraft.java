import static java.lang.System.*;

public enum Spacecraft {

    MOTHERSHIP("Robyn", 1, 1000, 10000),
    VOYAGER("Kathryn Janeway", 2,100,2000),
    NIMBUS("Zapp Brannigan",3, 50,1000),
    FIREFLY("Malcolm Reynolds",4,25,150),
    PLANETEXPRESS("Turanga Leela", 5,10,50);

    private final String captain;
    private final int level;
    private final int maxCells;
    private final int maxMeals;

    Spacecraft(String captain, int level, int maxCells, int maxMeals){
        this.captain = captain;
        this.level = level;
        this.maxCells = maxCells;
        this.maxMeals = maxMeals;
    }

    public int getLevel(){
        return level;
    }

    public int getMaxMeals(){
        return maxMeals;
    }

    public int getCells() {
        return maxCells;
    }
}
