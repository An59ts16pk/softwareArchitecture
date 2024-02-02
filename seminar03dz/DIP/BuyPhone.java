package seminar03dz.DIP;

public class BuyPhone implements Payment {
    @Override
    public void transaction(double summ) {
        System.out.println("Оплатили покупку телефоном: " + summ + " руб");
    }
}
