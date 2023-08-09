package DesignProblems.ParkingLot.Models;

import DesignProblems.ParkingLot.Models.common.BaseModel;
import DesignProblems.ParkingLot.Models.enums.VehicleType;

public class Vehicle extends BaseModel {


    private String vehicleRegistrationNumber;
    private VehicleType vehicleType;

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
