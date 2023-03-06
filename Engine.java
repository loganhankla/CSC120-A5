public class Engine {

    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    //accessors
    public double getFuelLevel(){ 
        return this.currentFuelLevel;
    }

    public FuelType getFuelType(){
        return this.f;
    }

//constructor
    public Engine(FuelType f, double fuel){
        this.f = f;
        this.currentFuelLevel = fuel;
        this.maxFuelLevel= fuel;
    }

    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;
    }

//go() to modify fuel level
    public void go(){
        //if fuel level not above 0, throw runtime exception
        if(this.currentFuelLevel > 0){
            this.currentFuelLevel -= 10;
            System.out.print("Current Fuel Level is" + this.currentFuelLevel + 
            ". Maximum Fuel Level is" + this.maxFuelLevel);
        } else{
            throw new RuntimeException("Fuel Tank Empty.");
        }

    }


//main function just for testing
public static void main() {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    while(true){
        try{myEngine.go();}
        catch(Exception e){myEngine.refuel();}
    }
    myEngine.getFuelLevel();
}

}


///Questions
// how to use/test out the main() function
// line 48