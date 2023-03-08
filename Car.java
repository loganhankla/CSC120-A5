import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengersOnboard; 
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

    private boolean seatAvailable(){
        return this.maxCapacity > this.passengersOnboard.size();
    }

    //addPassenger - make sure enough seats
    public void addPassenger(Passenger p){
        if(seatAvailable()){
            this.passengersOnboard.add(p);
        } else{
            throw new RuntimeException("Not enough seats in car.");
        }
    }

    //removePassenger() - make sure they're actually on board first
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
        
   } 

public static void main(String[] args) {
    Car myCar = new Car(15);
    Passenger pass1 = new Passenger("Logan");
    Passenger pass2 = new Passenger("Madeleine");
    myCar.getCapacity();
    myCar.addPassenger(pass1); // what input should addPassenger() get? string?
   // myCar.removePassenger(pass2);
    myCar.printManifest();
}
// make a main function to test? make a car, make a passenger to board, manifest
}