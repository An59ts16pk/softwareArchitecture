package seminar03dz.DIP;

public class Shop {
    private Payment payment;

    public Shop(Payment payment) {
        this.payment = payment;
    }

    public void transact(double summ) {
        payment.transaction(summ);
    }
}
