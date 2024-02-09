package seminar04dz;

public class Customer {
    private int id;
    private Ticket[] tickets;
    private CashProvider cashProvider;
    private UserProvider userProvider;
    private User user;

    public Customer(int id, Ticket[] tickets, CashProvider cashProvider, UserProvider userProvider, User user) {
        this.id = id;
        this.tickets = tickets;
        this.cashProvider = cashProvider;
        this.userProvider = userProvider;
        this.user = user;
    }

    // покупка билета
    public boolean buy(Ticket ticket) {
        return false;
    }

    // возврат билета
    public boolean repealTicket(Ticket ticket) {
        return true;
    }

    public Ticket[] searchTicket(int rootNumber) {
        return new Ticket[0];
    }
}
