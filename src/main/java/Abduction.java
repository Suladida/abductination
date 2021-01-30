import java.util.ArrayList;

// Add in launch ID, etc.

public class Abduction {


    ArrayList<Abductee> abductees;
    Spacecraft spacecraft;
    int abductionID;

    public Abduction(Spacecraft spacecraft, int abdID){
        this.spacecraft = spacecraft;
        this.abductees = new ArrayList<Abductee>();
        this.abductionID = abdID;
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
}

