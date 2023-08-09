package DesignProblems.ParkingLot.dtos;

import DesignProblems.ParkingLot.Models.Ticket;

public class GenerateTicketResponseDto {
    private ResponseStatus responseStatus;
    private String message;
    private Ticket ticket;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
