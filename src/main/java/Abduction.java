import sun.jvm.hotspot.memory.Space;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Abduction {

    ArrayList<Abductee> abductees;
    Abductee abductee;
    Spacecraft spacecraft;

    public Abduction(Spacecraft spacecraft, Abductee abductee){
        this.abductee = abductee;
        this.spacecraft = spacecraft;
        this.abductees = new ArrayList<Abductee>();
    }

    public ArrayList<Abductee> getAbductees(){
        return abductees;
    }


}

