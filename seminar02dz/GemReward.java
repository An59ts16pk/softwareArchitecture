package seminar02dz;

public class GemReward implements IGameItem {
    @Override
    public void open(int x) {
        if (x % 4 == 0) {
            System.out.println("Открыли сундук с изумрудами - и получили ещё сундук алмазов");
        } else {
            System.out.println("Открыли сундук с изумрудами");
        }
    }
}
