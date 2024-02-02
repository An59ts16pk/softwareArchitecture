package seminar03dz.DIP;

public class BuyCard implements Payment {
    @Override
    public void transaction(double summ) {
        System.out.println("Оплатили покупку картой банка: " + summ + " руб");
    }
}
