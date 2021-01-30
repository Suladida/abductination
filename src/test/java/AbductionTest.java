import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbductionTest {

    Abductee abductee;
    Spacecraft spacecraft;
    Abduction abduction;

    @Before
    public void before(){
        abductee = new Abductee("Human", 10);
        abduction = new Abduction(Spacecraft.NIMBUS, abductee);
        spacecraft = Spacecraft.NIMBUS;
    }

    @Test
    public void spacecraftHasMaxCells(){
        assertEquals(50, spacecraft.getCells());
    }

}
