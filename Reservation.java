/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V2;

/**
 *
 * @author B170108A
 */
public class Reservation {
    private String reservationId;
    private Flight flight;
    private Passenger passenger;
    private Seat seat;
    private String reservationDate;
    private String reservationTime;
 
    public Reservation(Flight flight, Passenger passenger, Seat seat, String reservationDate, String reservationTime) {
        this.flight = flight;
        this.passenger = passenger;
this.seat = seat;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.reservationId = passenger.generateRandomString(10);  // Generate a unique ID
this.seat.setAvailability(false);  // Mark the seat as occupied
    }
 
    public String getReservationId() {
        return reservationId;
    }
 
    public String getReservationDate() {
        return reservationDate;
    }
 
    public String getReservationTime() {
        return reservationTime;
    }
 
    @Override
    public String toString() {
        return "Reservation ID: " + reservationId + "\n" +
               flight + "\n" +
               passenger + "\n" +
               seat + "\n" +
               "Reservation Date: " + reservationDate + "\nReservation Time: " + reservationTime;
    }
}
