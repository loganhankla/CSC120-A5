import java.util.ArrayList;

public class Train {
    private final Engine engine; 
    private ArrayList<Car> carsAttached;

    // constructor
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        engine = new Engine(fuelType, fuelCapacity);
        this.carsAttached = new ArrayList<Car>(nCars);
        for(int i = 0; i < nCars; i++){
            Car car = new Car(passengerCapacity);
        }

    }

    public Engine getEngine(){ //check
        return this.engine; 
    }

    public Car getCar(int i){ //check
        //return i'th car
        return carsAttached.get(i);
    }

    public int getMaxCapacity(){ //check???
        //return max total capacity across all Cars
        for(int i = 0; i < carsAttached.size(); i++){
            return car.getCapacity(); //add max of each?
        }
    }

    public int seatsRemaining(){ //check
        //return number of remaining open seats across all Cars 
    }

    public void printManifest(){
        // print onboard Passengers - can use Cars'?
        for(int i = 0; i < carsAttached.size(); i++){
            Car.printManifest();
        }
    }

    // composition with Engine; maybe won't run without?
    //aggregation with Cars
    // association with Passengers
}
