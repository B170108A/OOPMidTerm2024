/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author B170108A
 */
public class Passenger {
    private String name;
    private String passportNumber;
    private String nationality;
    private String email;
    private String phoneNumber;
    private List<Reservation> reservations;  // List to keep track of reservations
 
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();
 
    public Passenger(String name, String passportNumber, String nationality, String email, String phoneNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.reservations = new ArrayList<>();  // Initialize the reservations list
    }
 
    public String getName() {
        return name;
    }
 
    public String getPassportNumber() {
        return passportNumber;
    }
 
    public String getNationality() {
        return nationality;
    }
 
    public String getEmail() {
        return email;
    }
 
    public String getPhoneNumber() {
        return phoneNumber;
    }
 
    public List<Reservation> getReservations() {
        return reservations;
    }
 
    // Method to create a reservation and add it to the list
    public Reservation createReservation(Flight flight, Seat seat, String reservationDate, String reservationTime) {
        if (seat != null && seat.isAvailable()) {
            Reservation reservation = new Reservation(flight, this, seat, reservationDate, reservationTime);
            reservations.add(reservation);
            return reservation;
        } else {
            throw new RuntimeException("Seat not available or does not exist");
        }
    }
 
    // Private method to generate a random string for reservation IDs
    String generateRandomString(int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
 
    @Override
    public String toString() {
        return "Passenger : " + name + "\n" + "Passport: " + passportNumber +
               ", Nationality: " + nationality + ", Email: " + email +
               ", Phone: " + phoneNumber;
    }
}
