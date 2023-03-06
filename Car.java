import java.util.Arrays;

public class Car {
    private ArrayList<Passenger> passengersOnboard; //manually set limit on number aboard
    private int maxCapacity;

    //constructor
    public Car(int max){
        this.maxCapacity = max;
        //take in initial value for max capacity & make appropriately sized Array List
    }
    
    public int getCapacity(){ //check
        return this.maxCapacity;
    }

    public int seatsRemaining(){

    }

    // current passengers

    //addPassenger() - make sure enough seats; runtime exception
    private int addPassenger(){

    }

    //removePassenger() - make sure they're actually on board first, if problem, runtime exception
    private int removePassenger(){
        
    }


    //printManifest()
        // this car is empty if nothing in there
        // print list of all passengers currently aboard the car
}