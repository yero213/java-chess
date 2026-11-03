import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VakjeTest {

    @org.junit.jupiter.api.Test
    void getBevatStuk() {
        Vakje vakje1 = new Vakje(0,0);
        assertEquals(vakje1.getBevatStuk(), false);
    }

    @org.junit.jupiter.api.Test
    void setBevatStuk() {
        Vakje vakje1 = new Vakje(0,0);
        vakje1.setBevatStuk(true);
        assertEquals(vakje1.getBevatStuk(), true);
    }
}