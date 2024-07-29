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
import java.util.ArrayList;
import java.util.List;
 
public class Flight {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private String aircraftType;
    private int flightDuration;
    private List<Seat> seats;
 
    public Flight(String flightNumber, String departureAirport, String arrivalAirport, 
                   String departureDate, String departureTime, 
                   String arrivalDate, String arrivalTime, 
                   String aircraftType, int flightDuration) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.aircraftType = aircraftType;
        this.flightDuration = flightDuration;
        this.seats = new ArrayList<>();
    }
 
    public void addSeat(Seat seat) {
        seats.add(seat);
    }
 
    public List<Seat> findAvailableSeats() {
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (seat.isAvailable()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }
 
    public Seat getSeatByNumber(String seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                return seat;
            }
        }
        return null;
    }
 
    @Override
    public String toString() {
        return "Flight " + flightNumber + ", Departure: " + departureAirport + " at " + departureDate + " " + departureTime +
               ", Arrival: " + arrivalAirport + " at " + arrivalDate + " " + arrivalTime + ", Aircraft: " + aircraftType +
               ", Duration: " + flightDuration + " minutes" + "\n";
    }
}
