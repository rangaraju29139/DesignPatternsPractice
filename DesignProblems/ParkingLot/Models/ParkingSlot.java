package DesignProblems.ParkingLot.Models;

import DesignProblems.ParkingLot.Models.common.BaseModel;
import DesignProblems.ParkingLot.Models.enums.ParkingSlotStatus;
import DesignProblems.ParkingLot.Models.enums.VehicleType;

import java.util.List;

public class ParkingSlot extends BaseModel {

    private String slotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private List<VehicleType> supportedVehicleTypes;

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }
}
