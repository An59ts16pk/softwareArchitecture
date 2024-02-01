package seminar02dz;

public class GenSilverReward implements GenItem {
    @Override
    public IGameItem createItem() {
        return new SilverReward();
    }
}
