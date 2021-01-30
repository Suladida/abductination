import java.util.ArrayList;

// Add in launch ID, etc.

public class Abduction {


    ArrayList<Abductee> abductees;
    Spacecraft spacecraft;
    int abductionID;
    String planet;
    String destination;
    int space;
    int capacity;

    public Abduction(Spacecraft spacecraft, int abdID, String planet, String destination){
        this.spacecraft = spacecraft;
        this.capacity = spacecraft.getCapacity();
        this.abductees = new ArrayList<Abductee>();
        this.space = capacity - abductees.size();
        this.abductionID = abdID;
        this.planet = planet;
        this.destination = destination;
    }

    public ArrayList<Abductee> getAbductees(){
        return abductees;
    }

    public int totalAbductees(){
        return abductees.size();
    }

    public int getID() {
        return abductionID;
    }

    public String getPlanet(){
        return planet;
    }

    public String getDestination(){
        return destination;
    }

    public int getSpace(){
        space = (capacity - totalAbductees());
        return space;
        }}

