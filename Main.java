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
public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("AA123", "JFK", "LHR", 
                                    "2024-08-15", "09:00", 
                                    "2024-08-15", "21:00",
                                    "Boeing 777", 420);
        
        // Adding seats to the flight with seat classes
        for (char row = 'A'; row <= 'C'; row++) {
            for (int num = 1; num <= 4; num++) {
                Seat.SeatClass seatClass = (row <= 'B') ? Seat.SeatClass.BUSINESS : Seat.SeatClass.ECONOMY;
                flight.addSeat(new Seat("" + row + num, seatClass, "" + row, num, flight));
            }
        }
 
        // Create Passenger
        Passenger passenger = new Passenger("Elvis Khoh", "A135675", "Malaysian", "elvis.khoh@gmail.com", "016-1234567");
 
        // Display available seats before reservation
//        System.out.println("Available seats before reservation:");
//        for (Seat availableSeat : flight.findAvailableSeats()) {
//            System.out.println(availableSeat);
//        }
 
        // Create a reservation
        try {
            Seat seatB2 = flight.getSeatByNumber("B2");
            Reservation reservation = passenger.createReservation(flight, seatB2, "2024-07-29", "12:00");
            System.out.println("Reservation created: " + reservation);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
 
        // Display available seats after reservation
//        System.out.println("\nAvailable seats after reservation:");
//        for (Seat availableSeat : flight.findAvailableSeats()) {
//            System.out.println(availableSeat);
//        }
 
        // Display passenger reservations
        System.out.println("\nPassenger Reservations:");
        for (Reservation res : passenger.getReservations()) {
            System.out.println(res);
        }
    }
}

