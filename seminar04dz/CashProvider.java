package seminar04dz;

public class CashProvider {
    private long card;
    private boolean isAuthorization;

    // билет после покупки
    public boolean buy(int price) {
        return false;
    }

    // билет после возврата
    public boolean repealTicket(int price) {
        return true;
    }

    public void authorization(Customer customer) {
        this.isAuthorization = true;
    }
}
