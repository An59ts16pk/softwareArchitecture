package seminar02dz;

import java.util.concurrent.ThreadLocalRandom;

public class SilverReward implements IGameItem {
    @Override
    public void open(int x) {
        int idx = ThreadLocalRandom.current().nextInt(2, 7);
        if (x % idx == 0) {
            System.out.println("Открыли сундук с серебром - сундук оказался на половину пуст");
        } else {
            System.out.println("Открыли сундук с серебром");
        }
    }
}
