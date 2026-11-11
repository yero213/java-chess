import java.util.ArrayList;

public class Koning extends SchaakStuk {
    public Koning(Kleur kleur, Vakje vakje){
        super(kleur,vakje);
    }

    @Override
    public ArrayList<Vakje> getMogelijkeZetten(Bord bord){
        ArrayList<Vakje> mogelijkeZetten = new ArrayList<>();
        Vakje huidigVakje = getPositie();
        int huidigeX = huidigVakje.getX();
        int huidigeY = huidigVakje.getY();
        int[][] richtingen = {{-1,0}, {+1,0}, {0,-1}, {0,+1}, {-1,-1}, {-1,+1}, {+1,+1}, {+1,-1}};

        for (int[] r : richtingen) {
            int x = huidigVakje.getX() + r[0];
            int y = huidigVakje.getY() + r[1];
            if(x >= 0 && x < 8 && y >= 0 && y < 8){
                mogelijkeZetten.add(bord.getBord()[x][y]);
            }


        }

        return mogelijkeZetten;
    }
}
