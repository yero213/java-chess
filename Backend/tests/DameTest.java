import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DameTest {
    Bord bord;
    Dame dame;
    ArrayList<Vakje> mogelijkeLijst;

    @BeforeEach
    void setUp() {
        bord = new Bord();
        bord.generate();
        dame = new Dame(Kleur.WIT, bord.getBord()[7][1]);
        mogelijkeLijst = new ArrayList<>();
    }

    @Test
    void dameOpLegeBordVanuitElkVakje() {
        for (int px = 0; px < 8; px++) {
            for (int py = 0; py < 8; py++) {
                Dame d = new Dame(Kleur.WIT, bord.getBord()[px][py]);
                ArrayList<Vakje> zetten = d.getMogelijkeZetten(bord);
                String pos = "dame op [" + px + "][" + py + "]";

                int verwachtAantal = 0;
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        int dx = Math.abs(x - px);
                        int dy = Math.abs(y - py);
                        boolean verwacht = !(dx == 0 && dy == 0)
                                && (dx == 0 || dy == 0 || dx == dy);
                        if (verwacht) verwachtAantal++;
                        assertEquals(verwacht, zetten.contains(bord.getBord()[x][y]),
                                pos + ", vakje [" + x + "][" + y + "]");
                    }
                }
                assertEquals(verwachtAantal, zetten.size(), pos);
            }
        }
    }

}