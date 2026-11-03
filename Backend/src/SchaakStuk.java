import java.util.ArrayList;

public abstract class SchaakStuk {
    private Kleur kleur = Kleur.ZWART;
    private Vakje positie;

    public SchaakStuk(Kleur kleur, Vakje positie){
        this.kleur = kleur;
        this.positie = positie;
    }

    public Kleur getKleur() {return kleur;}

    public void setKleur(Kleur kleur) {this.kleur = kleur;}

    public Vakje getPositie() {return positie;}
    public void setPositie(Vakje positie) {this.positie = positie;}

    public abstract ArrayList<Vakje> getMogelijkeZetten(Bord bord);
}
