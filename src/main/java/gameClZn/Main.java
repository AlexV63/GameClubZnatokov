package gameClZn;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        Generator.makePlayers();
        game.makeGame(PlayerManager.getInstance().getPlayersByLeague(League.JUNIORS));
        game.makeGame(PlayerManager.getInstance().getPlayersByLeague(League.STUDENTS));
        game.makeGame(PlayerManager.getInstance().getPlayersByLeague(League.ADULTS));
        game.makeGame(PlayerManager.getInstance().getPlayersByLeague(League.SENIORS));

//        System.out.println("Index League " + League.JUNIORS.ordinal()); //output:
//        System.out.println("Index League " + League.STUDENTS.ordinal()); //output:

    }
}