import java.util.ArrayList;

public class Train {
    private final Engine engine; 
    private ArrayList<Car> carsAttached;

    // constructor
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.carsAttached = new ArrayList<Car>(nCars);
        for(int i = 0; i < nCars; i++){
            Car car = new Car(passengerCapacity);
            this.carsAttached.add(car);
        }
    }

    public Engine getEngine(){ 
        return this.engine; 
    }

    public Car getCar(int i){ 
        //return i'th car
        return this.carsAttached.get(i);
    }

    public int getMaxCapacity(){ 
        //return max total capacity across all Cars
        int totalCap = 0;
        for(int i = 0; i < carsAttached.size(); i++){
            totalCap += carsAttached.get(i).getCapacity(); 
        }
        return totalCap;
    }

    public int seatsRemaining(){ 
        int totalRemaining = 0;
        for(int i = 0; i < carsAttached.size(); i++){
            totalRemaining += carsAttached.get(i).seatsRemaining();
        }
        return totalRemaining;
        
        //return number of remaining open seats across all Cars 
    }

    public void printManifest(){ //check
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
