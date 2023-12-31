package DesignProblems.ParkingLot.controllers;

import DesignProblems.ParkingLot.Models.Gate;
import DesignProblems.ParkingLot.Models.Ticket;
import DesignProblems.ParkingLot.Models.Vehicle;
import DesignProblems.ParkingLot.dtos.GenerateTicketRequestDto;
import DesignProblems.ParkingLot.dtos.GenerateTicketResponseDto;
import DesignProblems.ParkingLot.Services.TicketService;
import DesignProblems.ParkingLot.dtos.ResponseStatus;
import DesignProblems.ParkingLot.exceptions.NoParkingSlotAvailableException;

public class TicketController {
     private  TicketService ticketService;

     // questions to think of while desinging
    // what should be the return type?
    // what parameters are requested for me to generate the ticket.
    // what all work need to do to generate the ticket?
//        1. get gate, either vehicle from db or register
//        2. assigning the parking slot

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;

    }

   public  GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto) {
        GenerateTicketResponseDto responseDto = null;
        try {
            Ticket ticket = ticketService.generateTicket(
                    requestDto.getGateId(),requestDto.getVehicleRegistrationNumber(),requestDto.getVehicleType() );
            responseDto = new GenerateTicketResponseDto();
            responseDto.setTicket(ticket);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);

        } catch (NoParkingSlotAvailableException e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            responseDto.setMessage(e.getMessage());

        }
        return responseDto;
    }
}

/*
* two ways of calling the services
* 1. call the ticket service , gate service and vehicle service form the ticket controller itself
* 2. call the ticket service and let the ticket Service call the gate service and vehicle service if required
* */
