import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbductionManagerTest {

    private Abduction abduction;

    @Before
    public void before(){
        abduction = new Abduction(Spacecraft.NIMBUS, 003, "Zapp Brannigan", "Mars", "Venus" );
    }

    @Test
    public void abductionHasSpacecraft(){
        assertEquals(Spacecraft.NIMBUS, abduction.getSpacecraft());
    }

}
