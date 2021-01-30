import java.util.ArrayList;

// Add in launch ID, etc.

public class Abduction {


    ArrayList<Abductee> abductees;
    Spacecraft spacecraft;
    int abductionID;
    String planet;

    public Abduction(Spacecraft spacecraft, int abdID, String planet){
        this.spacecraft = spacecraft;
        this.abductees = new ArrayList<Abductee>();
        this.abductionID = abdID;
        this.planet = planet;
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
}

