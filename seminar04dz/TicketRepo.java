package seminar04dz;

public interface TicketRepo {
    Ticket readTicket(int n);

    Ticket[] readAllTickets();
}
