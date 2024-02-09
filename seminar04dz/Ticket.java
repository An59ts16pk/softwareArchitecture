package seminar04dz;

import java.util.Date;

public class Ticket {
    private int rootNumber;
    private int price;
    private Date dateStart;
    private Date dateEnd;
    private int place;
    private boolean isValid;

    public Ticket(int rootNumber, int price, Date dateStart, Date dateEnd, int place, boolean isValid) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.place = place;
        this.isValid = isValid;
    }
}