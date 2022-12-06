package gameClZn;

import java.util.UUID;
//импорт библиотеки для создания уникальных идентификаторов

/** Класс игрок
 * поля имя/фамилия
 * возраст
 * лига
 * уникальный идентификатор
 * очки в играх
 */
public class Player {
    private String name;
    private int age;
    League league;
    private UUID playerId;
    private int score = 0;

// Метод для получения имени игрока
    public String getName() {
        return name;
    }
// Метод для установки имени игрока
    public void setName(String name) {
        this.name = name;
    }
// Метод для получения уникального идентификатора
    public UUID getPlayerId() {
        return playerId;
    }
    // Метод для получения возраста
    public int getAge() {
        return age;
    }
    // Метод для установки возраста
        public void setAge(int age) {
        this.age = age;
    }
    // Метод для получения лиги
    public League getLeague() {
        return league;
    }
    // Метод для установки лиги
    public void setLeague(League league) {
        this.league = league;
    }
    // Метод для получения счета
    public int getScore() {
        return score;
    }
    // Метод для установки счета очков
    public void setScore(int score) {
        this.score = score;
    }
    // Метод для добавления очков
    public void addScore(int d) {
        score = score + d;
    }

    /** Конструктор для создания экземпляра игрока с полями включая лигу
     *
     * @param name
     * @param playerId
     * @param age
     * @param league
     */
    public Player(String name, UUID playerId, int age, League league) {
        this.name = name;
        this.playerId = playerId;
        this.age = age;
        this.league = league;
    }

    /** Конструктор для создания экземпляра игрока с полями без лиги
     *
     * @param name
     * @param playerId
     * @param age
     */
    public Player(String name, UUID playerId, int age){
            this.name = name;
            this.playerId = playerId;
            this.age = age;
        }
}

