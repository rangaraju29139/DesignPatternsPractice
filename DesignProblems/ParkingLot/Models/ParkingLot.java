package DesignProblems.ParkingLot.Models;

import DesignProblems.ParkingLot.Models.common.BaseModel;

import java.util.List;

public class ParkingLot extends BaseModel {

    private String name;
    private String address;
    private List<Gate> gates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    private List<ParkingSlot> parkingSlots;  //assuming only one floor for ease of desing
}
