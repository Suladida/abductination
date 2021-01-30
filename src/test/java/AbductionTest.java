import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AbductionTest {

    Abductee abductee;
    Spacecraft spacecraft;
    Abduction abduction;
    ArrayList<Abductee> abductees;

    @Before
    public void before(){
        abductee = new Abductee("Human", 10);
        abduction = new Abduction(Spacecraft.NIMBUS, 001, "Earth");
        spacecraft = Spacecraft.NIMBUS;
        abductees = new ArrayList<Abductee>();
    }

    @Test
    public void spacecraftHasMaxCells(){
        assertEquals(50, spacecraft.getCells());
    }

    @Test
    public void spacecraftHasMaxMeals(){
        assertEquals(1000, spacecraft.getMaxMeals());
    }

    @Test
    public void spacecraftHasLevel(){
        assertEquals(3, spacecraft.getLevel());
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
    public void abductionStartsEmpty(){
        assertEquals(0, abduction.totalAbductees());
    }

    @Test
    public void canCountAbductees(){
        abductees.add(abductee);
        Assert.assertEquals(1, abductees.size());
    }

    @Test
    public void canAddAbducteeToAbductees(){
        abductees.add(abductee);
        assertEquals(1, abductees.size());
    }

}
