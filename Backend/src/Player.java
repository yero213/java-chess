import java.util.ArrayList;

public class Player {
    private String naam;
    private ArrayList<SchaakStuk> stukken;
    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public ArrayList<SchaakStuk> getStukken() {
        return stukken;
    }
    public void setStukken(ArrayList<SchaakStuk> stukken) {
        this.stukken = stukken;
    }
    public void addStuk(SchaakStuk stuk){
        stukken.add(stuk);
    }
}
