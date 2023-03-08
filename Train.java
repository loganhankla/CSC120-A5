import java.util.ArrayList;

public class Train {
    private final Engine engine; 
    private ArrayList<Car> carsAttached;

    // constructor
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        Engine engine = new Engine(FuelType.ELECTRIC, 100.0);
        Car car1 = new Car(20);
        Car car2 = new Car(20);
    }

    public Engine getEngine(){
        return this.engine; 
    }

    public Car getCar(int i){
        //return i'th car
    }

    public int getMaxCapacity(){
        //return max total capacity across all Cars
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
