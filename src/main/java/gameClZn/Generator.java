package gameClZn;

import com.github.javafaker.Faker;
//импорт библиотки ФАкер для создания псевдонатуральных данных

import java.util.List;
import java.util.Random;
import java.util.UUID;
// импорт библиотек для рандома/ случайного значения/ и уникального идентификатора

/**В классе Генератор используется метод для создания игрока
 *  создаем экземпляр класса рандом и класса Факер
 */
public class Generator {
    public static void makePlayers() {
        Random random = new Random();
        Faker faker = new Faker();
/** Используя цикл фори
 * добавлются новые игроки в экземпляр класса МенеджерИгроков с использованием метода добавить игрока
 * в параметрах задается диапазон возраста создаваемых игроков
 */
        for (int i = 1; i < 200; i++) {
            PlayerManager.getInstance().addPlayer(new Player(faker.name().lastName(), UUID.randomUUID(), random.nextInt(12, 100)));

        }

//        for (int j = 1; j < 36; j++) {
//            PlayerManager.getInstance().addPlayer(new Player(faker.name().lastName(), UUID.randomUUID(), rnd.nextInt(17, 22)));
//        }



    }
}
