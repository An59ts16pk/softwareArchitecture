package seminar02dz;

public class GenGemReward implements GenItem {
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
