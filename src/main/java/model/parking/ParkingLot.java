package model.parking;

import model.account.ParkingAttendant;
import model.parking.Entrance;
import model.parking.Exit;
import model.parking.ParkingFloor;
import model.vehicle.Vehicle;

import java.util.List;

public class ParkingLot {

    String parkingLotName;
    List<ParkingFloor> parkingFloorList;
    List<Entrance> entranceList;
    List<Exit> exitList;

    Address address;

    public boolean isParkingLotSpaceAvailable(Vehicle vehicle) {
        return true;
    }

    public boolean addAttendant(ParkingAttendant parkingAttendant, int gateId){
        return true;
    }
}
