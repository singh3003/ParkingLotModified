package model.account;

import model.account.Account;
import model.parking.ParkingTicket;
import model.payment.PaymentInfo;
import model.payment.PaymentType;
import model.vehicle.Vehicle;

public class ParkingAttendant extends Account {

    public boolean processVehicleEntry(Vehicle vehicle){
        return true;
    }
    public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType){
        return null;
    }

}
