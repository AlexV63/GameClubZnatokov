package gameClZn;

/**основной класс
 * место точки входа в программу
 * создается игра
 * запускается в классе Генератор метод создания игроков
 *
 * запускаются игры, по каждой лиге отдельно, методом из класса Игра,
 * при этом вызывается метод получения экземпляра из класса МенеджерИгроков
 * с использованием метода получения списка игроков распределенных по лигам
 * выводится на печать в консоль итоговый список игроков отсортированный по результатам и лигам
 * и дополнительно для теста индекс лиг с использованием метода ординал у энам
 * Последнее на всякий случай - "вдруг пригадица" :)
 */
public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        Generator.makePlayers();
        game.makeGame(PlayerManager.getInstance().getPlayersByLeague(League.JUNIORS));
        game.makeGame(PlayerManager.getInstance().getPlayersByLeague(League.STUDENTS));
        game.makeGame(PlayerManager.getInstance().getPlayersByLeague(League.ADULTS));
        game.makeGame(PlayerManager.getInstance().getPlayersByLeague(League.SENIORS));

        System.out.println("Index League " + League.JUNIORS.ordinal()); //output league index:
        System.out.println("Index League " + League.STUDENTS.ordinal()); //output:

    }
}