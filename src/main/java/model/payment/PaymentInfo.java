package model.payment;

import model.parking.ParkingTicket;

public class PaymentInfo {
    double amount;
    ParkingTicket parkingTicket;
    PaymentStatus paymentStatus;
    int transactionId;
}
