package DesignProblems.ParkingLot.Models;

import DesignProblems.ParkingLot.Models.common.BaseModel;
import DesignProblems.ParkingLot.Models.enums.GateType;

public class Gate extends BaseModel {


    private Operator operator;
    private GateType gateType;

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
