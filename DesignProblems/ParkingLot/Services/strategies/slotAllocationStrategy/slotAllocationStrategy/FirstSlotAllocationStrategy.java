package DesignProblems.ParkingLot.Services.strategies.slotAllocationStrategy.slotAllocationStrategy;

import DesignProblems.ParkingLot.Models.Gate;
import DesignProblems.ParkingLot.Models.ParkingLot;
import DesignProblems.ParkingLot.Models.ParkingSlot;
import DesignProblems.ParkingLot.Models.enums.ParkingSlotStatus;
import DesignProblems.ParkingLot.Models.enums.VehicleType;
import DesignProblems.ParkingLot.repositories.ParkingLotRepository;
import DesignProblems.ParkingLot.repositories.ParkingSlotRepository;

import java.util.List;

public class FirstSlotAllocationStrategy implements SlotAllocationStrategy {


    private ParkingSlotRepository parkingSlotRepository;
    private ParkingLotRepository parkingLotRepository;


    public FirstSlotAllocationStrategy(ParkingLotRepository parkingLotRepository, ParkingSlotRepository parkingSlotRepository){
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSlotRepository = parkingSlotRepository;
    }
    @Override
    public ParkingSlot assignSlot(Gate gate, VehicleType vehicleType) {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotByGateId(gate);
        List<ParkingSlot> allParkingSlots = parkingLotRepository.getAllParkingSlotsByParkingLot(parkingLot);

        for(ParkingSlot slot : allParkingSlots){
            if(slot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE) && slot.getSupportedVehicleTypes().contains(vehicleType)){
                return slot;
            }
        }

        return null;
    }
}
