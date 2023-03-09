/**
 * @author Logan Hankla
 * The Car class creates cars, stores information about capacity and passengers.
 */

import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengersOnboard; 
    private int maxCapacity;

    /** Car constructor helps create cars
     * @param max The initial value for the maximum capacity of a car.
     */
    public Car(int max){
        //take in initial value for max capacity
        this.maxCapacity = max;
        //& make appropriately sized Array List
        this.passengersOnboard = new ArrayList<Passenger>();
    }
    
    /**Getter for max capacity of a car. */
    public int getCapacity(){ 
        return this.maxCapacity;
    }

    /** Calculates the seats remaining in a car. */
    public int seatsRemaining(){ 
        return this.maxCapacity - this.passengersOnboard.size(); 
    }

    /** Checks whether there is a seat available on a car or not. */
    private boolean seatAvailable(){
        return this.maxCapacity > this.passengersOnboard.size();
    }

    /**Adds a passenger to a car.
     * @param p The passenger
     */
    //addPassenger - make sure enough seats
    public void addPassenger(Passenger p){
        if(seatAvailable()){
            this.passengersOnboard.add(p);
        } else{
            throw new RuntimeException("Not enough seats in car.");
        }
    }


    /** Removes a passenger from a car if they are onboard.
     * @param p The passenger
     */
    public void removePassenger(Passenger p){
        if(this.passengersOnboard.contains(p)){
            this.passengersOnboard.remove(p);
        } else{
            throw new RuntimeException("Passenger is not onboard.");
        }
    }

/** Prints the roster of passengers on a given car. */
   public void printManifest(){
        if(this.passengersOnboard.size() > 0){
            for(Passenger p : passengersOnboard){
                System.out.println(p.getName());
            }
            
        } else{
            System.out.println("This car is empty.");
        }
        
   } 

   /** Main function to test functions in class. */
    public static void main(String[] args) {
        Car myCar = new Car(15);
        Passenger pass1 = new Passenger("Logan");
        Passenger pass2 = new Passenger("Madeleine");
        //System.out.println(pass1);
        myCar.getCapacity();
        myCar.addPassenger(pass1); 
        // myCar.removePassenger(pass2);
        myCar.printManifest();
    }
}