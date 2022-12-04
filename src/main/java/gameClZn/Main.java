package gameClZn;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        Generator.makePlayers();
        game.makeGame(PlayerManager.getInstance().getPlayersByLeague(League.JUNIORS));

        System.out.println("Index League " + League.JUNIORS.ordinal()); //output:

    }
}