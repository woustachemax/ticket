package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {

    private String trainId;

    private String trainNumber;

    private List<List<Integer>> seats;


    private Map<String, Time> stationTimes;

    private String station;
}
