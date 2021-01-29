public enum Spacecraft {

    MOTHERSHIP(1000, 10000),
    VOYAGER(100,2000),
    NIMBUS(50,1000),
    FIREFLY(20,100),
    PLANETEXPRESS(10,50);

    private final int maxCells;
    private final int maxMeals;

    Spacecraft(int maxCells, int maxMeals){
        this.maxCells = maxCells;
        this.maxMeals = maxMeals;
    }

    public int getMaxCells(){
        return maxCells;
    }

    public int getMaxMeals(){
        return maxMeals;
    }

}
