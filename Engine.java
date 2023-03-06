public class Engine {

    private FuelType f;

    private double currentFuelLevel;

    private double maxFuelLevel;
// fuel type
// capcity
// current level

//accessors
//getFuelLevel()? others? getFuelType

//constructor
    public Engine(FuelType f, double fuel){
        this.f = f;
        this.currentFuelLevel = fuel;
        this.maxFuelLevel= fuel;
    }

//refuel
    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;
    }

//go() to modify fuel level
    public void go(){

    }



//main function just for testing
public static void main() {
    Engine myEngine = Engine(FuelType.ELECTRIC, 100.0);


}

}