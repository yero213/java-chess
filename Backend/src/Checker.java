import java.util.ArrayList;

public class Checker {
    private Player winner;


    public Player getWinner() {
        return winner;
    }

    public boolean isSchaak(Bord bord, Player player1, Player player2){
        ArrayList<ArrayList<Vakje>> zettenPlayer1 = new ArrayList<>();
        ArrayList<ArrayList<Vakje>> zettenPlayer2 = new ArrayList<>();
        ArrayList<Vakje> vakkenMetStuk = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            for(Vakje v: bord.getBord()[i]){
                if(v.getBevatStuk()){
                    vakkenMetStuk.add(v);
                }
            }
        }
        for(int i = 0; i < player1.getStukken().size(); i++){
            SchaakStuk stuk = player1.getStukken().get(i);
            zettenPlayer1.add(stuk.getMogelijkeZetten(bord));
        }
        for(int i = 0; i < player2.getStukken().size(); i++){
            SchaakStuk stuk = player2.getStukken().get(i);
            zettenPlayer2.add(stuk.getMogelijkeZetten(bord));
        }

        for(Vakje v: vakkenMetStuk){
            for(ArrayList<Vakje> i: zettenPlayer1){
                if(i.contains(v)){
                    for(int index = i.indexOf(v); index < i.size(); index ++){
                        i.remove(index);
                    }
                }
            }
            for(ArrayList<Vakje> i: zettenPlayer2){
                if(i.contains(v)){
                    for(int index = i.indexOf(v); index < i.size(); index ++){
                        i.remove(index);
                    }
                }
            }
        }
        if(zettenPlayer1.contains(zettenPlayer2.get(Koning))){}
    }
/*
    public boolean isSchaakmat(Bord bord){

    }

    public boolean isGeldigeZet(Zet zet){

    }

 */
}
