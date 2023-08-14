package DesignProblems.ParkingLot.Services;

import DesignProblems.ParkingLot.Models.Gate;
import DesignProblems.ParkingLot.Models.ParkingSlot;
import DesignProblems.ParkingLot.Models.Ticket;
import DesignProblems.ParkingLot.Models.Vehicle;
import DesignProblems.ParkingLot.Models.enums.VehicleType;
import DesignProblems.ParkingLot.Services.strategies.slotAllocationStrategy.slotAllocationStrategy.SlotAllocationStrategy;
import DesignProblems.ParkingLot.exceptions.NoParkingSlotAvailableException;
import DesignProblems.ParkingLot.repositories.TicketRepository;

import java.util.Date;

public class TicketService {

    //cannot pass the controller's dto -> because it might be used by either controllersusing other dot's also but
    // it is better if it takes one parameter( an options object ), here we are breaking this rule
    // assuming time in interview is short

    private GateService gateService;
    private VehicleService vehicleService;
    private SlotAllocationStrategy slotAllocationStrategy;
    private TicketRepository ticketRepository;

    public TicketService(GateService gateService,VehicleService vehicleService,SlotAllocationStrategy slotAllocationStrategy,TicketRepository ticketRepository){
        this.gateService = gateService;
        this.vehicleService = vehicleService;
        this.slotAllocationStrategy = slotAllocationStrategy;
        this.ticketRepository = ticketRepository;
    }

    public Ticket generateTicket(Long gateId, String vehicleResigistrationNumber, VehicleType vehicleType) throws NoParkingSlotAvailableException {
        // get the gate

        Gate gate = gateService.getGateById(gateId);

        Vehicle vehicle = vehicleService.getVehicleByVehicleNumber(vehicleResigistrationNumber);

        if(vehicle == null){
            //  register the vehicle
            vehicle = vehicleService.registerVehicle(vehicleResigistrationNumber,vehicleType);
        }else{

        }

        // get the vehicle or register the vehicle


        // assign the parking slot
        ParkingSlot assignedSlot = slotAllocationStrategy.assignSlot(gate, vehicleType);
        if(assignedSlot == null ){
            throw new NoParkingSlotAvailableException("No vehicle slot available");
        }

        // return the ticket

        Ticket ticket = new Ticket();
        ticket.setEntryDate(new Date());
        ticket.setGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setParkingSlot(assignedSlot);


        Ticket savedTicket = ticketRepository.save(ticket);


        return ticket;

    }
}
