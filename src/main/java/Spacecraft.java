import static java.lang.System.*;

public enum Spacecraft {

    MOTHERSHIP(1, 1000, 10000),
    VOYAGER(2,100,2000),
    NIMBUS(3, 50,1000),
    FIREFLY(4,25,150),
    PLANETEXPRESS( 5,10,50),
    SCOOTY_PUFF_JR(1000, 1, 0);

    private final int level;
    private final int maxCapacity;
    private final int pantrySize;

    Spacecraft(int level, int maxCapacity, int pantrySize){
        this.level = level;
        this.maxCapacity = maxCapacity;
        this.pantrySize = pantrySize;
    }

    public int getLevel(){
        return level;
    }

    public int getPantrySize(){
        return pantrySize;
    }

    public int getCapacity() {
        return maxCapacity;
    }
}
