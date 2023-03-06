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

    //addPassenger() - make sure enough seats; runtime exception
    public void addPassenger(Passenger p){
        this.passengersOnboard.add(p);
    }

    //removePassenger() - make sure they're actually on board first, if problem, runtime exception
    public void removePassenger(Passenger p){
        if(this.passengersOnboard.contains(p)){
            this.passengersOnboard.remove(p);
        } else{
            throw new RuntimeException("Passenger is not onboard.");
        }
    
    }


   public ArrayList printManifest(){} //ArrayList?
        // this car is empty if nothing in there
        // print list of all passengers currently aboard the car

    public static void main(String[] args) {
        Car myCar = new Car(25);
        try {
            addPassenger(p);
            }
        } catch (Exception e) {
                System.err.println(e.getMessage()); // Out of fuel
        }
        }
}