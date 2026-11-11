import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KoningTest {
    Bord bord;
    Koning koning;
    ArrayList<Vakje> mogelijkeLijst;
    ArrayList<Vakje> zetten;

    @BeforeEach
    void setUp() {
        bord = new Bord();
        bord.generate();
        mogelijkeLijst = new ArrayList<>();
        zetten = new ArrayList<>();
    }

    @Test
    void testGetZettenCenter() {
        koning = new Koning(Kleur.WIT, bord.getBord()[3][3]);
        zetten = koning.getMogelijkeZetten(bord);
        mogelijkeLijst.add(bord.getBord()[2][3]);
        mogelijkeLijst.add(bord.getBord()[2][4]);
        mogelijkeLijst.add(bord.getBord()[3][4]);
        mogelijkeLijst.add(bord.getBord()[4][4]);
        mogelijkeLijst.add(bord.getBord()[4][3]);
        mogelijkeLijst.add(bord.getBord()[4][2]);
        mogelijkeLijst.add(bord.getBord()[3][2]);
        mogelijkeLijst.add(bord.getBord()[2][2]);
        for(Vakje v : zetten) {
            assertTrue(mogelijkeLijst.contains(v));
        }
    }

    @Test
    void testGetZettenExtreem_0_0() {
        koning = new Koning(Kleur.WIT, bord.getBord()[0][0]);
        zetten = koning.getMogelijkeZetten(bord);
        mogelijkeLijst.add(bord.getBord()[1][0]);
        mogelijkeLijst.add(bord.getBord()[1][1]);
        mogelijkeLijst.add(bord.getBord()[0][1]);
        for(Vakje v : zetten) {
            assertTrue(mogelijkeLijst.contains(v));
        }
    }

    @Test
    void testGetZettenExtreem_0_7() {
        koning = new Koning(Kleur.WIT, bord.getBord()[0][7]);
        zetten = koning.getMogelijkeZetten(bord);
        mogelijkeLijst.add(bord.getBord()[0][6]);
        mogelijkeLijst.add(bord.getBord()[1][6]);
        mogelijkeLijst.add(bord.getBord()[1][7]);
        for(Vakje v : zetten) {
            assertTrue(mogelijkeLijst.contains(v));
        }
    }

    @Test
    void testGetZettenExtreem_7_7() {
        koning = new Koning(Kleur.WIT, bord.getBord()[7][7]);
        zetten = koning.getMogelijkeZetten(bord);
        mogelijkeLijst.add(bord.getBord()[7][6]);
        mogelijkeLijst.add(bord.getBord()[6][6]);
        mogelijkeLijst.add(bord.getBord()[6][7]);
        for(Vakje v : zetten) {
            assertTrue(mogelijkeLijst.contains(v));
        }
    }

    @Test
    void testGetZettenExtreem_7_0() {
        koning = new Koning(Kleur.WIT, bord.getBord()[7][0]);
        zetten = koning.getMogelijkeZetten(bord);
        mogelijkeLijst.add(bord.getBord()[6][0]);
        mogelijkeLijst.add(bord.getBord()[6][1]);
        mogelijkeLijst.add(bord.getBord()[7][1]);
        for(Vakje v : zetten) {
            assertTrue(mogelijkeLijst.contains(v));
        }
    }
}