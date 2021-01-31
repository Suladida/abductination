import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbductionManagerTest {

    private Abduction abduction;
    private Abduction abduction2;
    private Abduction abduction3;
    private Abductee abductee;
    private Abductee abductee2;

    @Before
    public void before(){
        abduction = new Abduction(Spacecraft.NIMBUS, 003, "Zapp Brannigan", "Mars", "Venus" );
        abduction2 = new Abduction(Spacecraft.SCOOTY_PUFF_JR, 002, "Phillip J Fry", "Omecron Percei 8", "Ukknown");
        abduction3 = new Abduction(Spacecraft.PLANETEXPRESS, 003,"Terunga Leela", "Everything On A Cob", "Pluto");
        abductee = new Abductee("Human", 10);
        abductee2 = new Abductee("Omecronian", 100);
    }

    @Test
    public void abductionHasSpacecraft(){
        assertEquals(Spacecraft.NIMBUS, abduction.getSpacecraft());
    }

    @Test
    public void canChumAll(){
        abduction2.abduct(abductee);
        abduction2.chumAll();
        assertEquals(0, abduction2.totalAbductees());
        assertEquals(1, abduction2.pantryStock());
    }

    @Test
    public void cannotChumAll(){
        abduction3.abduct(abductee);
        abduction3.abduct(abductee2);
        assertEquals(2, abduction3.totalAbductees());
        abduction3.chumAll();
        assertEquals(0, abduction3.pantryStock());
    }



}
