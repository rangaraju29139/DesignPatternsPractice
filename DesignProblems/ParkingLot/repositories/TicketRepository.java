package DesignProblems.ParkingLot.repositories;

import DesignProblems.ParkingLot.Models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    // hashmap to mimic the functionality of the database.


    private Map<Long,Ticket> ticketMap = new HashMap<>();
    private Long autoSequenceNumber = 0L;


    public Ticket save(Ticket ticket){
        autoSequenceNumber++;
        ticket.setId(autoSequenceNumber);
        ticketMap.put(autoSequenceNumber, ticket);
        return ticket;

    }
}
