package gameClZn;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Generator {
    public static void makePlayers() {
        Random rnd = new Random();
        Faker faker = new Faker();

        for (int i = 1; i < 36; i++) {
            PlayerManager.getInstance().addPlayer(new Player(faker.name().lastName(), UUID.randomUUID(), rnd.nextInt(12, 16)));

        }
        for (int j = 1; j < 36; j++) {
            PlayerManager.getInstance().addPlayer(new Player(faker.name().lastName(), UUID.randomUUID(), rnd.nextInt(17, 22)));
        }



    }
}
