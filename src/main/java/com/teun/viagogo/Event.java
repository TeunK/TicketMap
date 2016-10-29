package com.teun.viagogo;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Teun on 10/29/2016.
 */
public class Event {
    private static AtomicInteger ID_COUNTER = new AtomicInteger(0);
    private final int id;
    private final List<Ticket> tickets;
    private Location location;

    public Event(Location location, List<Ticket> tickets) {
        this.id = ID_COUNTER.getAndAdd(1);
        this.tickets = tickets;
        setLocation(location);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}