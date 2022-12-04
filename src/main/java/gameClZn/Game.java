package gameClZn;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Game {
    public  void printPlayers(List<Player> players){
        for (Player player : players){
            System.out.println(String.format
                    ("Player name: %s, age: %d, score %d", player.getName(), player.getAge(), player.getScore()));
        }
    }

    public void makeGame(List<Player> players) {

        for (int i = 0; i<players.size()-1; i++){
            Player player1 = players.get(i);
            for (int j = i+1; j < players.size(); j++) {
                Player player2 = players.get(j);
                resultGame(player1, player2);
            }
        }

        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.getScore()- o1.getScore();
            }
        });
        printPlayers(players);

//        LinkedList<Player> winners = new LinkedList<Player>();
//
//        public  void printWinners(List<Player> players){
//
//        for (int i = 0; i < 3; i++) {
//            winners.add(i);
//        }
//        printPlayers(winners);
    }


    public void resultGame(Player player1, Player player2){
       if (Math.random()>0.5)
           player2.addScore(2);
       else player1.addScore(2);
    }
}
