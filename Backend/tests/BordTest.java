import static org.junit.jupiter.api.Assertions.*;

class BordTest {

    @org.junit.jupiter.api.Test
    void reset() {
    }


    @org.junit.jupiter.api.Test
    void generate() {
        Bord bord = new Bord();
        bord.generate();
        for(int i = 0; i < 8; i++) {
            assertEquals(8, bord.getBord()[i].length);
        }
    }

    @org.junit.jupiter.api.Test
    void getBord() {
    }
}