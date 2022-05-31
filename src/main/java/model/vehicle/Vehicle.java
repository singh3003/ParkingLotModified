package model.vehicle;

import model.parking.ParkingTicket;
import model.payment.PaymentInfo;

public class Vehicle {
    String licenseNumber;
    VehicleType vehicleType;
    ParkingTicket parkingTicket;
    PaymentInfo paymentInfo;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
