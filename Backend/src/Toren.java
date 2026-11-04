import java.util.ArrayList;

public class Toren extends SchaakStuk {
    public Toren(Kleur kleur, Vakje vakje){
        super(kleur,vakje);
    }

    @Override
    public ArrayList<Vakje> getMogelijkeZetten(Bord bord) {
        ArrayList<Vakje> mogelijkeZetten = new ArrayList<>();
        Vakje huidigeVakje = getPositie();
        int huidigeX = huidigeVakje.getX();
        int huidigeY = huidigeVakje.getY();
        for(Vakje v: bord.getBord()[huidigeX]){
            if(v != huidigeVakje) {
                mogelijkeZetten.add(v);
            }
        }
        for(int i = 0; i<8; i++){
            Vakje vakje = bord.getBord()[i][huidigeY];
            if (vakje != huidigeVakje && !mogelijkeZetten.contains(vakje)) {
                mogelijkeZetten.add(vakje);
            }
        }
        return mogelijkeZetten;
    }
}