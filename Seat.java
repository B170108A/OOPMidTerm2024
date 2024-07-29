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
public class Seat {
    public enum SeatClass {
        ECONOMY,
        BUSINESS
    }
 
    private String seatNumber;
    private boolean isAvailable;
    private SeatClass seatClass;
    private String row;
    private int column;
    private Flight flight;  // Each seat belongs to a single flight
 
    public Seat(String seatNumber, SeatClass seatClass, String row, int column, Flight flight) {
        this.seatNumber = seatNumber;
        this.isAvailable = true;
        this.seatClass = seatClass;
        this.row = row;
        this.column = column;
        this.flight = flight;
    }
 
    public String getSeatNumber() {
        return seatNumber;
    }
 
    public boolean isAvailable() {
        return isAvailable;
    }
 
    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }
 
    public SeatClass getSeatClass() {
        return seatClass;
    }
 
    public String getRow() {
        return row;
    }
 
    public int getColumn() {
        return column;
    }
 
    public Flight getFlight() {
        return flight;
    }
 
    @Override
    public String toString() {
        return "Seat " + seatNumber + " (" + seatClass + "): " + (isAvailable ? "Available" : "Occupied") 
                + "\n" +
               "Row: " + row + ", Column: " + column + "\n";
    }
}
