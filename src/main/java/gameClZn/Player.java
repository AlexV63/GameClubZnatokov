package gameClZn;

import java.util.UUID;

public class Player {
    private String name;
    private int age;
    League league;
    private UUID playerId;
    private int score = 0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int d) {
        score = score + d;
    }

    public Player(String name, UUID playerId, int age, League league) {
        this.name = name;
        this.playerId = playerId;
        this.age = age;
        this.league = league;
    }

    public Player(String name, UUID playerId, int age){
            this.name = name;
            this.playerId = playerId;
            this.age = age;
        }
}

