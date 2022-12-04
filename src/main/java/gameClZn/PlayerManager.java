package gameClZn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlayerManager {
    private List<Player> allPlayers;
    static PlayerManager pm = null;

    public static PlayerManager getInstance(){
        if(pm == null)
    pm = new PlayerManager();
            return pm;
    }

    private PlayerManager() {
        allPlayers = new ArrayList<Player>();
    }

    public boolean addPlayer(Player player) {
        for (Player player1 : allPlayers) {
            if (player.getPlayerId().equals(player1.getPlayerId()))
                return false;
        }
        if (assignLeague(player))
            allPlayers.add(player);
        return true;
    }

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

    public List<Player> getPlayersByLeague (League league){
        List<Player> playerList = new LinkedList<>();
        for (Player player : allPlayers) {
            if (player.getLeague().equals(league))
                playerList.add(player);
        }
        return playerList;
    }
}


