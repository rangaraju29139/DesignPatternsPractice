package DesignProblems.ParkingLot.dtos;

import DesignProblems.ParkingLot.Models.enums.VehicleType;

public class GenerateTicketRequestDto {
    private Long gateId;
    private  String VehicleType;
    private DesignProblems.ParkingLot.Models.enums.VehicleType vehicleType;

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(DesignProblems.ParkingLot.Models.enums.VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }
}
