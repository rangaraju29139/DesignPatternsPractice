package DesignProblems.ParkingLot;

import DesignProblems.ParkingLot.Models.enums.VehicleType;
import DesignProblems.ParkingLot.Services.GateService;
import DesignProblems.ParkingLot.Services.TicketService;
import DesignProblems.ParkingLot.Services.VehicleService;
import DesignProblems.ParkingLot.Services.strategies.slotAllocationStrategy.slotAllocationStrategy.FirstSlotAllocationStrategy;
import DesignProblems.ParkingLot.Services.strategies.slotAllocationStrategy.slotAllocationStrategy.SlotAllocationStrategy;
import DesignProblems.ParkingLot.controllers.TicketController;
import DesignProblems.ParkingLot.dtos.GenerateTicketRequestDto;
import DesignProblems.ParkingLot.dtos.GenerateTicketResponseDto;
import DesignProblems.ParkingLot.exceptions.NoParkingSlotAvailableException;
import DesignProblems.ParkingLot.repositories.ParkingLotRepository;
import DesignProblems.ParkingLot.repositories.ParkingSlotRepository;
import DesignProblems.ParkingLot.repositories.TicketRepository;

public class Client {
    public static void main(String[] args) throws NoParkingSlotAvailableException {

        GateService gateService = new GateService();
        VehicleService vehicleService = new VehicleService();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSlotRepository parkingSlotRepository = new parkingSlotRepository();
        SlotAllocationStrategy slotAllocationStrategy = new FirstSlotAllocationStrategy();
        TicketRepository ticketRepository = new TicketRepository();
        TicketService ticketService = new TicketService(gateService,vehicleService,slotAllocationStrategy,ticketRepository);
        TicketController ticketController = new TicketController(ticketService);


        GenerateTicketRequestDto requestDto = new GenerateTicketRequestDto();
        requestDto.setGateId(11L);
        requestDto.setVehicleRegistrationNumber("AP 39 Ql 2224");
        requestDto.setVehicleType(VehicleType.MEDIUM);

        GenerateTicketResponseDto responseDto = ticketController.generateTicket(requestDto);






    }
}


/* Requirements:
1. Generate the Ticket workflow

// way to think
1. which model is it about? Ticket
2. TicketController, TicketService,TicketRepository.

//should ticket controller methods take models as parameters or should there be any problem?
1. Db model should not be exposed.
2. try to take a single parameter in controller , so that for the new parameters the code doesnot break in future.


 */