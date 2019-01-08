/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author Vinu
 */
public class Ticket {
    Passenger passenger;
    Flight flight;
    double price;
    int number;
    static int uniqueTicketNumber = 0;
    public Ticket(Passenger p, Flight flight, double price){
        passenger = p;
        this.flight = flight;
        this.price = price;
        number = uniqueTicketNumber + 1;
    }
    public int getNumber(){
        return number;
    }
    public double getPrice(){
        return price;
    }
    public Passenger getPassenger(){
        return passenger;
    } 
    public Flight getFlight(){
        return flight;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setPassenger(Passenger p){
        passenger = p;
    } 
    public void setFlight(Flight flight){
        this.flight = flight;
    }
    @Override
    public String toString(){
        return passenger.toString() + ", " + flight.toString() + ", " + "ticket price: $" + price;
    }
}
