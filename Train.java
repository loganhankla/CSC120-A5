/**
 * Filename: Train.java
 * Description: The Train class creates trains, stores information about fuel type, engines, cars, and passengersas the aggregate.
 * @author Logan Hankla
 * Date: 8 March 2023
 */

 import java.util.ArrayList;

public class Train {
    private final Engine engine; 
    private ArrayList<Car> carsAttached;

    /** The train constructor creates a new train allowing user to set parameters.
     * @param fuelType Type of fuel for engine.
     * @param fuelCapacity The maximum capacity for fuel.
     * @param nCars The number of cars.
     * @param passengerCapacity The capacity for each car.
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.carsAttached = new ArrayList<Car>(nCars);
        for(int i = 0; i < nCars; i++){
            Car car = new Car(passengerCapacity);
            this.carsAttached.add(car);
        }
    }

    /** This getter returns the engine. */
    public Engine getEngine(){ 
        return this.engine; 
    }

    /** This getter returns the specified car.
     * @param i The particular car in the Array List of attached cars.
     * @return The i'th car.
     */
    public Car getCar(int i){ 
        return this.carsAttached.get(i);
    }

    /** This getter returns the maximum total capacity across all cars.
     * @return The total capacity.
     */
    public int getMaxCapacity(){ 
        int totalCap = 0;
        for(int i = 0; i < carsAttached.size(); i++){
            totalCap += carsAttached.get(i).getCapacity(); 
        }
        return totalCap;
    }

    /** This function calculates how many seats are remaining on the train.
     * @return Number of empty seats.
     */
    public int seatsRemaining(){ 
        int totalRemaining = 0;
        for(int i = 0; i < carsAttached.size(); i++){
            totalRemaining += carsAttached.get(i).seatsRemaining();
        }
        return totalRemaining;
    }

    /** This prints the roster of all passengers onboard the train.
     */
    public void printManifest(){
        for(int i = 0; i < carsAttached.size(); i++){
           // if() could do if else to not print if empty
            
            carsAttached.get(i).printManifest();
        }
    }

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 50, 5, 20);
        Passenger pass = new Passenger("Lee");
        pass.boardCar(myTrain.getCar(2));
        myTrain.getCar(2);
        myTrain.getEngine();
        System.out.println(myTrain.getMaxCapacity());
        System.out.println(myTrain.seatsRemaining());
        myTrain.printManifest();
    }

}
