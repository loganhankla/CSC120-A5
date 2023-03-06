public class Engine {

    private FuelType f;

    private double currentFuelLevel;

    private double maxFuelLevel;

//accessors
    public getFuelLevel(){ //check
        this.currentFuelLevel;
    }

    public getFuelType(){ //check
        this.f;
    }

//constructor
    public Engine(FuelType f, double fuel){
        this.f = f;
        this.currentFuelLevel = fuel;
        this.maxFuelLevel= fuel;
    }

//refuel //check
    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;
    }

//go() to modify fuel level //check
    public void go(){
        this.currentFuelLevel = this.currentFuelLevel * .9;
        System.out.print("Current Fuel Level is", this.currentFuelLevel, 
        ". Maximum Fuel Level is", this.maxFuelLevel);

        //if fuel level not above 0, throw runtime exception
    }


//main function just for testing
public static void main() {
    Engine myEngine = Engine(FuelType.ELECTRIC, 100.0);
    go();
    getFuelLevel();
}



}

/// Questions
// go() - how to do runtime exception
// check refuel and go() methods
// check accessors