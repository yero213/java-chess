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

    }
    /*
    public void doeZet(Zet zet){

    }
    */
}
