public class Bord {
    private Vakje[][] bord;

    public Bord(){
        this.bord = new Vakje[8][8];
    }

    public void reset(){

    }

        public void generate(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                bord[i][j] = new Vakje(i,j);
            }
        }

        for(Vakje v: bord[1]){
            for(int i = 0; i < 8; i++){
                SchaakStuk pion = new Pion(Kleur.ZWART, getBord()[1][i]);
            }
            v.setBevatStuk(true);
        }

        for(Vakje v: bord[6]) {
            for(int i = 0; i < 8; i++){
                SchaakStuk pion = new Pion(Kleur.ZWART, getBord()[6][i]);
            }
            v.setBevatStuk(true);
        }
    }

    public Vakje[][] getBord(){
        return bord;
    }

}
