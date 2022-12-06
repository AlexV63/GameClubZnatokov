package gameClZn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//импорт библиотек списков, вкл связанные списки

public class PlayerManager {
    // в классе МенеджерИгроков для создания экземпляра игрока с полями включая лигу объявлен список всех игроков
    private List<Player> allPlayers;

    //для проверки наличия списка создана переменная пм со значением нуль
    static PlayerManager pm = null;

    // метод создания экземпляра класса МенеджерИгроков с проверкой наличия экземпляра данного класса
    public static PlayerManager getInstance(){
        if(pm == null)
    pm = new PlayerManager();
            return pm;
    }
// создаем новый список всех игроков
    private PlayerManager() {
        allPlayers = new ArrayList<Player>();
    }


    // проверяем наличие данного инрока в списке, если его там нет, то добавляем игроув в список
    public boolean addPlayer(Player player) {
        for (Player player1 : allPlayers) {
            if (player.getPlayerId().equals(player1.getPlayerId()))
                return false;
        }
        if (assignLeague(player))
            allPlayers.add(player);
        return true;
    }
    // распределение игроков по лигам через цикл в зависимости от возраста
    // проверяется возраст и устанавливается значение лиги
    public boolean assignLeague(Player player) {
        boolean result = true;
        if (player.getAge() > 13 && player.getAge() < 17) {
            player.setLeague(League.JUNIORS);
        } else if (player.getAge() > 16 && player.getAge() < 29) {
            player.setLeague(League.STUDENTS);
        } else if (player.getAge() > 28 && player.getAge() < 50) {
            player.setLeague(League.ADULTS);
        } else if (player.getAge() > 49 && player.getAge() < 80) {
            player.setLeague(League.SENIORS);
        } else result = false;
        return result;
    }
    // создание списка игроков лиги и добавление игроков в список лиги
    public List<Player> getPlayersByLeague (League league){
        List<Player> playerList = new LinkedList<>();
        for (Player player : allPlayers) {
            if (player.getLeague().equals(league))
                playerList.add(player);
        }
        return playerList;
    }
}


