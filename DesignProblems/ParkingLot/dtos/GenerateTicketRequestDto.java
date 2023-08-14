package DesignProblems.ParkingLot.dtos;

import DesignProblems.ParkingLot.Models.enums.VehicleType;
import DesignProblems.ParkingLot.Services.VehicleService;

public class GenerateTicketRequestDto {
    private Long gateId;

    private String vehicleRegistrationNumber;
    private VehicleType vehicleType;
//    private DesignProblems.ParkingLot.Models.enums.VehicleType vehicleType;

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }




    public void setVehicleType(VehicleType  vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }
}
