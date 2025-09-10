package ticket.booking.entities;

import java.util.List;

public class User {
    private String user;

    private String password;

    private String hashedPassword;

    private String userId;

    private List<Ticket> ticketsBooked;
}
