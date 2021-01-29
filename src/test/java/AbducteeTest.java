import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbducteeTest {

    private Abductee abductee;

    @Before
    public void before(){
        abductee = new Abductee("Human", 10);
    }

    @Test
    public void abducteeHasSpecies(){
        assertEquals("Human", abductee.getSpecies());
    }

    @Test
    public void abducteeHasmealMass(){
        assertEquals(10, abductee.getmealMass());
    }

}
