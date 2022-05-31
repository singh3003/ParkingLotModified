package model.parking;

import model.parking.SlotType;
import model.vehicle.Vehicle;

public class Slot {
    int slotId;
    boolean isFree;
    double cost;
    SlotType slotType;
    //present inside the slot
    Vehicle vehicle;

    public Slot(SlotType slotType) {
        this.slotType = slotType;
    }
}
