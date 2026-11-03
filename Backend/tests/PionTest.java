import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class PionTest {
    Bord bord;
    Pion pion;
    ArrayList<Vakje> mogelijkeLijst;

    @BeforeEach
    void setUp() {
        bord = new Bord();
        bord.generate();
        pion = new Pion(Kleur.ZWART, bord.getBord()[6][0]);
        mogelijkeLijst = new ArrayList<>();
    }

    @Test
    void getMogelijkeZetten() {
        Pion pion = new Pion(Kleur.WIT, bord.getBord()[6][0]);
        mogelijkeLijst.add(bord.getBord()[5][0]);
        mogelijkeLijst.add(bord.getBord()[4][0]);
        assertEquals(mogelijkeLijst, pion.getMogelijkeZetten(bord));
        for(Vakje v :pion.getMogelijkeZetten(bord)) {
            System.out.print("   " +  v.getX()+ " " + v.getY() + "   ");
        }
        pion.FirstMove();
        mogelijkeLijst.clear();
        mogelijkeLijst.add(bord.getBord()[5][0]);
        assertEquals(mogelijkeLijst, pion.getMogelijkeZetten(bord));
        for(Vakje v :pion.getMogelijkeZetten(bord)) {
            System.out.print("   " +  v.getX()+ " " + v.getY() + "   ");
        }
    }

    @Test
    void firstMove() {

        pion.FirstMove();
        assertEquals(false, false);
    }
}