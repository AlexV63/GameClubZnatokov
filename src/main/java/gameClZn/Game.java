package gameClZn;

import java.util.*;

public class Game {
    public  void printPlayers(List<Player> players){
        for (Player player : players){
            System.out.println(String.format
                    ("Player name: %s, age: %d, score %d, %s", player.getName(), player.getAge(), player.getScore(), player.getLeague()));
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

        // НАДО ПОДУМАТЬ!!!!

//        List<Player> winners = new ArrayList<>();
//
//        public List<Player> getWinners( List<Player> players) {
//               for (int i = 0; i < 3; i++) {
//
//                winners.add(players.get(i));
//                changeLeaguePlus(players.get(i));
//            }
//
//        }

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

    public void changeLeaguePlus(Player player) {
        if (player.getLeague().equals(League.JUNIORS)) {
            player.setLeague(League.STUDENTS);
            player.setScore(0);
        } else if (player.getLeague().equals(League.STUDENTS)) {
            player.setLeague(League.ADULTS);
            player.setScore(0);
        } else if (player.getLeague().equals(League.ADULTS)) {
            player.setLeague(League.SENIORS);
            player.setScore(0);
        }
    }
}
