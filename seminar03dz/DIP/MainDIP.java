package seminar03dz.DIP;

public class MainDIP {
    public static void main(String[] args) {
        Shop shop = new Shop(new BuyCash());
        shop.transact(1200);

        shop = new Shop(new BuyCard());
        shop.transact(856.57);

        shop = new Shop(new BuyPhone());
        shop.transact(260);
    }
}
