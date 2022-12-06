package gameClZn;

import java.util.*;

/** Создан класс Игра
 * используя метод печатьИгроков при помощи цикла форич распечатываем список игроков
 *  с указанием лиги и результата в очках
 */
public class Game {
    public  void printPlayers(List<Player> players){
        for (Player player : players){
            System.out.println(String.format
                    ("Player name: %s, age: %d, score %d, %s", player.getName(), player.getAge(), player.getScore(), player.getLeague()));
        }
    }

    /** Метод проведения игры - используя циклы фор и получаем двух игроков из списка игроков лиги
     *
     * @param players
     */
    public void makeGame(List<Player> players) {

        for (int i = 0; i<players.size()-1; i++){
            Player player1 = players.get(i);
            for (int j = i+1; j < players.size(); j++) {
                Player player2 = players.get(j);
                resultGame(player1, player2);
            }
        }
/** используя компаратор сравнием игроков по очкам и отсортировываем список игроков лиги
 *
 */
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.getScore()- o1.getScore();
            }
        });
        printPlayers(players);


    }

    /**
     * используя метод математического рандома (0 и 1) получаем результат игры и добавляем победителю 2 очка
     * @param player1
     * @param player2
     */

    public void resultGame(Player player1, Player player2){
       if (Math.random()>0.5)
           player2.addScore(2);
       else player1.addScore(2);
    }

    /**
     * Метод смены лиги - если у игрока лига соответствует меньшей лиге, то присваивается занчение следующей лиги
     * и обнуляется количество очков
     * @param player
     */
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
