package model.parking;

import model.parking.ParkingTicketStatus;
import model.parking.SlotType;

import java.util.Date;

public class ParkingTicket {
    int ticketId;
    int floorId;
    int spaceId;
    Date vehicleEntryDateTime;
    Date vehicleExitDateTime;
    SlotType slotType;
    double cost;
    ParkingTicketStatus parkingTicketStatus;


    public void updateTotalCost(){
        return;
    }

    public void updateVehicleExitTime(Date vehicleExitDateTime){
        return;
    }



}
