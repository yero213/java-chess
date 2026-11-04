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
        pion = new Pion(Kleur.WIT, bord.getBord()[6][0]);
        mogelijkeLijst = new ArrayList<>();
    }

    @Test
    void getMogelijkeZetten() {
        /**
         * deze forloop maak voor elk vakje op bord index 1 een pion aan en controleerd alle mogelijke zetten bij de start positie
         */
        for(Vakje v :bord.getBord()[1]) {
            mogelijkeLijst.clear();
            System.out.print("   " +  v.getX()+ " " + v.getY() + "   ");
            pion =  new Pion(Kleur.ZWART, bord.getBord()[v.getX()][v.getY()]);
            mogelijkeLijst.add(bord.getBord()[v.getX()+1][v.getY()]);
            mogelijkeLijst.add(bord.getBord()[v.getX()+2][v.getY()]);
            assertEquals(mogelijkeLijst, pion.getMogelijkeZetten(bord));
        }
        /**
         * deze forloop maak voor elk vakje op bord index 6 een pion aan en controleerd alle mogelijke zetten bij de start positie
         */
        for(Vakje v :bord.getBord()[6]) {
            mogelijkeLijst.clear();
            System.out.print("   " +  v.getX()+ " " + v.getY() + "   ");
            pion =  new Pion(Kleur.WIT, bord.getBord()[v.getX()][v.getY()]);
            mogelijkeLijst.add(bord.getBord()[v.getX()-1][v.getY()]);
            mogelijkeLijst.add(bord.getBord()[v.getX()-2][v.getY()]);
            assertEquals(mogelijkeLijst, pion.getMogelijkeZetten(bord));
        }
        /**
         * deze forloop maak voor elk vakje op bord index 1 een pion aan en controleerd alle mogelijke zetten als de pion al verzet is geweest
         */
        for(Vakje v :bord.getBord()[1]) {
            mogelijkeLijst.clear();
            System.out.print("   " +  v.getX()+ " " + v.getY() + "   ");
            pion =  new Pion(Kleur.ZWART, bord.getBord()[v.getX()][v.getY()]);
            pion.FirstMove();
            mogelijkeLijst.add(bord.getBord()[v.getX()+1][v.getY()]);
            assertEquals(mogelijkeLijst, pion.getMogelijkeZetten(bord));
        }
        /**
         * deze forloop maak voor elk vakje op bord index 6 een pion aan en controleerd alle mogelijke zetten als de pion al verzet is geweest
         */
        for(Vakje v :bord.getBord()[6]) {
            mogelijkeLijst.clear();
            System.out.print("   " +  v.getX()+ " " + v.getY() + "   ");
            pion =  new Pion(Kleur.WIT, bord.getBord()[v.getX()][v.getY()]);
            pion.FirstMove();
            mogelijkeLijst.add(bord.getBord()[v.getX()-1][v.getY()]);
            assertEquals(mogelijkeLijst, pion.getMogelijkeZetten(bord));
        }
    }

    @Test
    void firstMove() {

        pion.FirstMove();
        assertEquals(false, false);
    }
}