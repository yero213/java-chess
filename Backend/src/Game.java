public class Game {
    private Bord bord;
    private Timer timer;
    private Checker checker;
    private Player player1;
    private Player player2;

    public Game() {
        bord = new Bord();
        timer = new Timer();
        checker = new Checker();
        player1 = new Player();
        player2 = new Player();
    }

    public void run() {

        for(Vakje v: bord.getBord()[0]){
            v.setBevatStuk(true);
            int x = v.getX();
            int y = v.getY();
            if(x == 0 || x == 7){
                player2.addStuk(new Toren(Kleur.ZWART, bord.getBord()[x][y]));
            }
            else if(x == 1 || x == 6){
                player2.addStuk(new Paard(Kleur.ZWART, bord.getBord()[x][y]));
            }
            else if(x == 2 || x == 5){
                player2.addStuk(new Loper(Kleur.ZWART, bord.getBord()[x][y]));
            }
            else if(x == 3){
                player2.addStuk(new Dame(Kleur.ZWART, bord.getBord()[x][y]));
            }
            else if(x == 4){
                player2.addStuk(new Koning(Kleur.ZWART, bord.getBord()[x][y]));
            }
        }

        for(Vakje v: bord.getBord()[7]){
            v.setBevatStuk(true);
            int x = v.getX();
            int y = v.getY();
            if(x == 0 || x == 7){
                player1.addStuk(new Toren(Kleur.WIT, bord.getBord()[x][y]));
            }
            else if(x == 1 || x == 6){
                player1.addStuk(new Paard(Kleur.WIT, bord.getBord()[x][y]));
            }
            else if(x == 2 || x == 5){
                player1.addStuk(new Loper(Kleur.WIT, bord.getBord()[x][y]));
            }
            else if(x == 3){
                player1.addStuk(new Dame(Kleur.WIT, bord.getBord()[x][y]));
            }
            else if(x == 4){
                player1.addStuk(new Koning(Kleur.WIT, bord.getBord()[x][y]));
            }
        }

        for(Vakje v: bord.getBord()[1]){
            v.setBevatStuk(true);
            int x = v.getX();
            int y = v.getY();
            player2.addStuk(new Pion(Kleur.ZWART, bord.getBord()[x][y]));
        }

        for (Vakje v: bord.getBord()[6]){
            v.setBevatStuk(true);
            int x = v.getX();
            int y = v.getY();
            player1.addStuk(new Pion(Kleur.WIT, bord.getBord()[x][y]));
        }
    }
    /*
    public void doeZet(Zet zet){

    }
    */
}
