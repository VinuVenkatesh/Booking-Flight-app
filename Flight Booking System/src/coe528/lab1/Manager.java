/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;
import java.util.ArrayList;
/**
 *
 * @author Vinu
 */
public class Manager {
    Flight[] flights = new Flight[5];
    ArrayList<Ticket> tickets = new ArrayList<>();
    public void createFlights(){
        flights[0] = new Flight(30, 1,"Toronto","Monteral","03/05/15 6:30am",100.00);
        flights[1] = new Flight(15, 2,"Toronto","Korea","03/05/16 7:30am",200.00);
        flights[2] = new Flight(0, 3,"Toronto","Calgary","03/05/17 8:30am",300.00);
        flights[3] = new Flight(30, 4,"Toronto","India","03/05/18 9:30am",400.00);
        flights[4] = new Flight(15, 5,"Toronto","Japan","03/05/19 10:30am",500.00);
    }
    public void displayAvaliableFlights(String origin, String destination){
        for(int i =0; i < flights.length;i++){
            if(flights[i].origin.equals(origin) && flights[i].destination.equals(destination)){
                if(flights[i].bookASeat())
                    System.out.println(flights[i]);
                else
                    System.out.println("No seats available");
            }
        }
    }
    public Flight getFlight(int flightNumber){
        Flight correctFlight = null;
        for(int i =0; i<flights.length;i++){
            if(flights[i].getFlightNumber() == flightNumber)
                correctFlight = flights[i];
        }
        return correctFlight;
    }
    public void bookSeat(int flightNumber, Passenger p){
        Flight correctFlight = getFlight(flightNumber);
        if(correctFlight != null){
            if(correctFlight.bookASeat()){
                tickets.add(new Ticket(p,correctFlight,p.applyDiscount(correctFlight.getOriginalPrice())));
            }
            else
                tickets.add(null);
        }
    }
    public static void main (String args[]){
        Manager m = new Manager();
        m.createFlights();
        m.bookSeat(1,new NonMember("Steve", 66));
        m.bookSeat(2,new Member("Julie",25,6));
        m.bookSeat(3,new Member("Brandom",20,2));
        m.displayAvaliableFlights("Toronto", "Korea");
        m.displayAvaliableFlights("Toronto", "Calgary");
        System.out.println(m.tickets.get(0));
        System.out.println(m.tickets.get(1));
        System.out.println(m.tickets.get(2));
    }
}
