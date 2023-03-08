import java.util.ArrayList;

public class Train {
    private final Engine engine; 
    private ArrayList<Car> carsAttached;

    // constructor
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        Engine engine = new Engine(fuelType, fuelCapacity);
        this.carsAttached = new ArrayList<Car>(nCars);

        Car car1 = new Car(20);
        Car car2 = new Car(20);
    }

    public Engine getEngine(){
        return this.engine; 
    }

    public Car getCar(int i){ //check
        //return i'th car
        return carsAttached[i];
    }

    public int getMaxCapacity(){
        //return max total capacity across all Cars
        //for(i in carsAttached){

       // }
    }

    public int seatsRemaining(){
        //return number of remaining open seats across all Cars
    }

    public void printManifest(){
        // print onboard Passengers - can use Cars'?
    }

    // composition with Engine; maybe won't run without?
    //aggregation with Cars
    // association with Passengers
}
