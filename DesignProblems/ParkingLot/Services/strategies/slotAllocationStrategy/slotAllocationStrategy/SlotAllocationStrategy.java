package DesignProblems.ParkingLot.Services.strategies.slotAllocationStrategy.slotAllocationStrategy;

import DesignProblems.ParkingLot.Models.Gate;
import DesignProblems.ParkingLot.Models.ParkingSlot;
import DesignProblems.ParkingLot.Models.enums.VehicleType;

public interface SlotAllocationStrategy {
    ParkingSlot assignSlot(Gate gate , VehicleType vehicleType);
}
