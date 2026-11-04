import java.util.ArrayList;

public class Loper extends SchaakStuk {
    public Loper(Kleur kleur, Vakje vakje) {
        super(kleur, vakje);
    }

    @Override
    public ArrayList<Vakje> getMogelijkeZetten(Bord bord) {
        ArrayList<Vakje> mogelijkeZetten = new ArrayList<>();
        Vakje huidigVakje = getPositie();
        int[][] richtingen = {{-1, -1}, {-1, 1}, {1, 1}, {1, -1}};

        for (int[] r : richtingen) {
            int x = huidigVakje.getX() + r[0];
            int y = huidigVakje.getY() + r[1];
            while (x >= 0 && x < 8 && y >= 0 && y < 8) {
                mogelijkeZetten.add(bord.getBord()[x][y]);
                x += r[0];
                y += r[1];
            }
        }
        return mogelijkeZetten;
    }
}