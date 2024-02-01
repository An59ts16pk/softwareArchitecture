package seminar02dz;

import java.util.concurrent.ThreadLocalRandom;

public class GoldReward implements IGameItem {
    @Override
    public void open(int x) {
        int idx = ThreadLocalRandom.current().nextInt(2, 5);
        if (x % idx == 0) {
            System.out.println("Открыли сундук с золотом - сундук оказался пуст");
        } else {
            System.out.println("Открыли сундук с золотом");
        }
    }
}
