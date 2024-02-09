package seminar04dz;

public class TicketRepository implements TicketRepo {
    private Ticket[] baseTickets;

    @Override
    public Ticket readTicket(int n) {
        Ticket ticket = baseTickets[n];
        return ticket;
    }

    @Override
    public Ticket[] readAllTickets() {
        return baseTickets;
    }
}
