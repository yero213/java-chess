import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
class TorenTest {
    Bord bord;
    Toren toren;
    ArrayList<Vakje> mogelijkeLijst;

    @BeforeEach
    void setUp() {
        bord = new Bord();
        bord.generate();
        toren = new Toren(Kleur.WIT, bord.getBord()[2][5]);
        mogelijkeLijst = new ArrayList<>();
    }
    @Test
    void testGetZetten()
    {
        for(int tx = 0; tx < 8; tx++){
            for(int ty = 0; ty < 8; ty++){
                Toren t = new Toren(Kleur.WIT, bord.getBord()[tx][ty]);
                ArrayList<Vakje> zetten = t.getMogelijkeZetten(bord);
                String pos = "toren op [" + tx + "][" + ty + "]";

                assertEquals(14, zetten.size(), pos);
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        boolean verwacht = (x == tx) != (y == ty); // zelfde rij XOR zelfde kolom
                        assertEquals(verwacht, zetten.contains(bord.getBord()[x][y]),
                                    pos + ", vakje [" + x + "][" + y + "]");
                    }
                }

            }
        }
    }

}