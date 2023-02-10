public class Player {
    private String name;
    private Dice dado;
    public static int totalPlayers = 0;


    public Player(String x, Dice y) {
        this.name = x;
        this.dado = y;
        totalPlayers++;
    }

    public void tryy() {
        this.dado.play();
    }

    public int getDiceValue() {
        return this.dado.getNumber();
    }

    public void show() {
        System.out.println("[Name of the player: " + this.name);
        this.dado.show();
        this.showTotalPlayers();
    }

    public void showTotalPlayers() {
        System.out.println("[Total players: " + totalPlayers + "]");
    }

    public String getName(){
        return this.name;
    }



}
