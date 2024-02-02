package seminar03dz.DIP;

public class BuyCash implements Payment {
    @Override
    public void transaction(double summ) {
        System.out.println("Оплатили покупку наличными: " + summ + " руб");
    }
}
