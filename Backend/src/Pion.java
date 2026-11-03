import java.util.ArrayList;
public class Pion extends SchaakStuk {
    private boolean firstMove = true;

    public Pion(Kleur kleur, Vakje vakje){
        super(kleur, vakje);
    }

    @Override
    public ArrayList<Vakje> getMogelijkeZetten(Bord bord) {
        ArrayList<Vakje> mogelijkeZetten = new ArrayList<>();
        System.out.print(getPositie());
        Vakje huidig_vakje = getPositie();
        System.out.print(huidig_vakje);
        int huidige_x = huidig_vakje.getX();
        int huidige_y = huidig_vakje.getY();
        if(getKleur() == Kleur.WIT){
            if(firstMove){
                mogelijkeZetten.add(bord.getBord()[huidige_x-1][huidige_y]);
                mogelijkeZetten.add(bord.getBord()[huidige_x-2][huidige_y]);
            }

            else{
                mogelijkeZetten.add(bord.getBord()[huidige_x-1][huidige_y]);
            }
            for(Vakje v: bord.getBord()[huidige_x+1]){
                if(v.getBevatStuk()){
                    if (v.getX() == huidige_x - 1 && (v.getY() == huidige_y +1 || v.getY() == huidige_y - 1 )) {
                        mogelijkeZetten.add(v);
                    }
                }
            }
        }
        else{
            if(firstMove){
                mogelijkeZetten.add(bord.getBord()[huidige_x+1][huidige_y]);
                mogelijkeZetten.add(bord.getBord()[huidige_x+2][huidige_y]);
            }

            else{
                mogelijkeZetten.add(bord.getBord()[huidige_x+1][huidige_y]);
            }
            for(Vakje v: bord.getBord()[huidige_x+1]){
                if(v.getBevatStuk()){
                    if (v.getX() == huidige_x + 1 && (v.getY() == huidige_y +1 || v.getY() == huidige_y - 1 )) {
                        mogelijkeZetten.add(v);
                    }
                }
            }
        }

        return mogelijkeZetten;
    }

    public void FirstMove(){
        this.firstMove = false;
    }
}
