import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AbductionTest {

    Abductee abductee;
    Abductee abductee2;
    Spacecraft spacecraft;
    Spacecraft spacecraft2;
    Abduction abduction;
    Abduction abduction2;
    ArrayList<Abductee> abductees;

    @Before
    public void before(){
        abductee = new Abductee("Human", 10);
        abductee2 = new Abductee("Omecronian", 100);
        spacecraft = Spacecraft.NIMBUS;
        spacecraft2 = Spacecraft.SCOOTY_PUFF_JR;
        abduction = new Abduction(spacecraft, 001, "Earth", "Planet Slurm");
        abduction2 = new Abduction(spacecraft2, 002, "Omecron Percei 8", "Ukknown");
        abductees = new ArrayList<Abductee>();
    }

    @Test
    public void spacecraftHasCaptain(){
        assertEquals("Zapp Brannigan", spacecraft.getCaptain());
    }

    @Test
    public void spacecraftHasLevel(){
        assertEquals(3, spacecraft.getLevel());
    }

    @Test
    public void spacecraftHasMaxCells(){
        assertEquals(50, spacecraft.getCapacity());
    }

    @Test
    public void spacecraftHasMaxMeals(){
        assertEquals(1000, spacecraft.getMaxMeals());
    }

    @Test
    public void abductionHasID(){
        assertEquals(001, abduction.getID());
    }

    @Test
    public void abductionHasPlanet(){
        assertEquals("Earth", abduction.getPlanet());
    }

    @Test
    public void abductionHasDestination(){
        assertEquals("Planet Slurm", abduction.getDestination());
    }

    @Test
    public void abductionStartsEmpty(){
        assertEquals(0, abduction.totalAbductees());
    }

    @Test
    public void canGetRemainingSpace(){
        abduction.abductees.add(abductee);
        abduction.abductees.add(abductee2);
        assertEquals(48, abduction.getSpace());
    }

    @Test
    public void canCountAbductees(){
        abductees.add(abductee);
        Assert.assertEquals(1, abductees.size());
    }

    @Test
    public void canAbduct(){
        ArrayList<Abductee> newAbductees = new ArrayList<Abductee>();
        newAbductees.add(abductee);
        newAbductees.add(abductee2);
        abduction.abduct(newAbductees);
        assertEquals(2, abduction.totalAbductees());
    }

    @Test
    public void cannotAbduct(){
        ArrayList<Abductee> newAbductees = new ArrayList<Abductee>();
        newAbductees.add(abductee);
        newAbductees.add(abductee2);
        abduction2.abduct(newAbductees);
        assertEquals(0, abduction.totalAbductees());
    }

    @Test
    public void canAbductOne(){
        abduction2.abduct(abductee);
        assertEquals(1, abduction2.totalAbductees());
    }

    @Test
    public void cannotAbductOne(){
    abduction2.abduct(abductee2);
    abduction2.abduct(abductee);
    assertEquals(1, abduction2.totalAbductees());
}

}
