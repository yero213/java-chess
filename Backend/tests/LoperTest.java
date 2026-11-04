import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LoperTest {
    Bord bord;
    Loper loper;
    ArrayList<Vakje> mogelijkeLijst;

    @BeforeEach
    void setUp() {
        bord = new Bord();
        bord.generate();
        loper = new Loper(Kleur.WIT, bord.getBord()[7][0]);
        mogelijkeLijst = new ArrayList<>();
    }

    @Test
    void testGetZetten() {
        for (int px = 0; px < 8; px++) {
            for (int py = 0; py < 8; py++) {
                Loper l = new Loper(Kleur.WIT, bord.getBord()[px][py]);
                ArrayList<Vakje> zetten = l.getMogelijkeZetten(bord);
                String pos = "loper op [" + px + "][" + py + "]";

                int verwachtAantal = 0;
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        boolean verwacht = Math.abs(x - px) == Math.abs(y - py)
                                && !(x == px && y == py);
                        if (verwacht) verwachtAantal++;
                        assertEquals(verwacht, zetten.contains(bord.getBord()[x][y]),
                                pos + ", vakje [" + x + "][" + y + "]");
                    }
                }
                assertEquals(verwachtAantal, zetten.size(), pos); // geen dubbelen of extra's
            }
        }
    }


}