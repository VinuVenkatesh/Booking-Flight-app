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
public class Flight {
    int flightNumber, capacity, numberOfSeatsLeft;
    String origin, destination, depatureTime;
    double originalPrice;
    public Flight(int capacity, int flightNumber, String origin, String destination, String depatureTime, double originalPrice){
        if(origin.equals(destination))
            throw new IllegalArgumentException("Origin cannot equal Destination");
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
        this.flightNumber = flightNumber;
        this.depatureTime = depatureTime;
        this.originalPrice = originalPrice;
        numberOfSeatsLeft = capacity;
    }
    public boolean bookASeat(){
        if(numberOfSeatsLeft >0){
            numberOfSeatsLeft = numberOfSeatsLeft -1;
            return true;
        }
        else
            return false;
    }
    public int getFlightNumber(){
        return flightNumber;
    }
    public int getNumberOfSeatsLeft(){
        return numberOfSeatsLeft;
    }
    public int getCapacity(){
        return capacity;
    }
    public String getOrigin(){
        return origin;
    }
    public String getDestination(){
        return destination;
    }
    public String getDeaptureTime(){
        return depatureTime;
    }
    public double getOriginalPrice(){
        return originalPrice;
    }
     public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void setDepatureTime(String depatureTime){
        this.depatureTime = depatureTime;
    }
    public void setOriginalPrice(double originalPrice){
        this.originalPrice = originalPrice;
    }
    @Override
    public String toString(){
        return "Flight " + flightNumber + ", "+ origin + " to " + destination + ", " 
                + depatureTime + ", " + "original price: $" + originalPrice;
    }
}
