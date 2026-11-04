import java.util.ArrayList;

public class Paard extends SchaakStuk {
    public Paard(Kleur kleur, Vakje vakje) {
        super(kleur, vakje);
    }

    @Override
    public ArrayList<Vakje> getMogelijkeZetten(Bord bord) {
        ArrayList<Vakje> mogelijkeZetten = new ArrayList<>();
        Vakje huidigVakje = getPositie();
        int huidigeX = huidigVakje.getX();
        int huidigeY = huidigVakje.getY();
        if(huidigeX-2 >= 0 && huidigeX-2 < 8) {
            if(huidigeY-1 >= 0 && huidigeY-1 < 8) {
                mogelijkeZetten.add(bord.getBord()[huidigeX-2][huidigeY-1]);
            }
            if(huidigeY+1 >= 0 && huidigeY+1 < 8) {
                mogelijkeZetten.add(bord.getBord()[huidigeX-2][huidigeY+1]);
            }
        }
        if(huidigeX+2 >= 0 && huidigeX+2 < 8) {
            if(huidigeY-1 >= 0 && huidigeY-1 < 8) {
                mogelijkeZetten.add(bord.getBord()[huidigeX+2][huidigeY-1]);
            }
            if(huidigeY+1 >= 0 && huidigeY+1 < 8) {
                mogelijkeZetten.add(bord.getBord()[huidigeX+2][huidigeY+1]);
            }
        }
        if(huidigeY-2 >= 0 && huidigeY-2 < 8) {
            if(huidigeX-1 >= 0 && huidigeX-1 < 8) {
                mogelijkeZetten.add(bord.getBord()[huidigeX-1][huidigeY-2]);
            }
            if(huidigeX+1 >= 0 && huidigeX+1 < 8) {
                mogelijkeZetten.add(bord.getBord()[huidigeX+1][huidigeY-2]);
            }
        }
        if(huidigeY+2 >= 0 && huidigeY+2 < 8) {
            if(huidigeX-1 >= 0 && huidigeX-1 < 8) {
                mogelijkeZetten.add(bord.getBord()[huidigeX-1][huidigeY+2]);
            }
            if(huidigeX+1 >= 0 && huidigeX+1 < 8) {
                mogelijkeZetten.add(bord.getBord()[huidigeX+1][huidigeY+2]);
            }
        }
        return mogelijkeZetten;
    }

}