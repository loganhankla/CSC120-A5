import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengersOnboard; //manually set limit on number aboard
    private int maxCapacity;

    //constructor
    public Car(int max){
        //take in initial value for max capacity
        this.maxCapacity = max;
        //& make appropriately sized Array List
        this.passengersOnboard = new ArrayList<Passenger>();
    }
    
    public int getCapacity(){ 
        return this.maxCapacity;
    }

    public int seatsRemaining(){ 
        return this.maxCapacity - this.passengersOnboard.size(); 
    }

    private boolean seatsAvailable(){
        return this.maxCapacity > this.passengersOnboard.size();
    }

    //addPassenger() - make sure enough seats; runtime exception
    public void addPassenger(Passenger p){
        if(seatsAvailable()){
            this.passengersOnboard.add(p);
        } else{
            throw new RuntimeException("Not enough seats in car.");
        }
    }

    //removePassenger() - make sure they're actually on board first, if problem, runtime exception
    public void removePassenger(Passenger p){
        if(this.passengersOnboard.contains(p)){
            this.passengersOnboard.remove(p);
        } else{
            throw new RuntimeException("Passenger is not onboard.");
        }
    }


   public void printManifest(){
        if(this.passengersOnboard.size() > 0){
            for(Passenger p : passengersOnboard){
                System.out.println(p.getName());
            }
            
        } else{
            System.out.println("This car is empty.");
        }
        
   } //ArrayList?
        // this car is empty if nothing in there
        // print list of all passengers currently aboard the car


// make a main function to test? make a car, make a passenger to board, manifest
}