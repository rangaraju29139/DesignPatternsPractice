package DesignProblems.ParkingLot.repositories;

import DesignProblems.ParkingLot.Models.Gate;
import DesignProblems.ParkingLot.Models.ParkingLot;
import DesignProblems.ParkingLot.Models.ParkingSlot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotRepository {

    private Map<Long,ParkingLot> parkingLotMap = new HashMap<>();
    public ParkingLot getParkingLotByGateId(Gate gate) {

               return parkingLotMap.get(gate.getId());
    }

    public List<ParkingSlot> getAllParkingSlotsByParkingLot(ParkingLot parkingLot) {
     return null;
    }
}
