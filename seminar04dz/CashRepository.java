package seminar04dz;

public class CashRepository implements CashRepo {
    private Bank bank;

    @Override
    public boolean transaction() {
        long card = bank.getCard();
        int balanse = bank.getBalnse();
        return true;
    }
}
