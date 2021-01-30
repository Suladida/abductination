import sun.jvm.hotspot.memory.Space;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Abduction {

    ArrayList<Abductee> abductees;
    Abductee abductee;
    Spacecraft spacecraft;
    Abduction abduction;

    public Abduction(Spacecraft spacecraft, Abductee abductee){
        this.abductee = abductee;
        this.spacecraft = spacecraft;
    }

    public ArrayList<Abductee> getAbductees(){
        return abductees;
    }


}

