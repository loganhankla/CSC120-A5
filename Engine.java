/**
 * Filename: Engine.java
 * Description: The Engine class creates an engine, stores information about fuel level and has methods to alter fuel level.
 * @author Logan Hankla
 * Date: 8 March 2023
 */

public class Engine {

    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /** This accessor gets the current fuel level for the train engine. */
    public double getFuelLevel(){ 
        return this.currentFuelLevel;
    }

    /** This accessor gets the maximum fuel level for the train engine. */
    public double getMaxFuelLevel(){
        return this.maxFuelLevel;
    }

    /** This accessor gets the fuel type used for the engine. */
    public FuelType getFuelType(){
        return this.f;
    }

    /** This constructor helps to create a new Engine.
     * @param f The fuel type for the engine.
     * @param fuel Sets both the fuel capacity and fuel level at engine creation.
     */
    public Engine(FuelType f, double fuel){
        this.f = f;
        this.currentFuelLevel = fuel;
        this.maxFuelLevel= fuel;
    }

    /** Refills fuel up to maximum fuel level. */
    public void refuel(){
        this.currentFuelLevel = this.maxFuelLevel;
    }

    /** Modifies the fuel level by decreasing.
     * @throws RuntimeException
     */
    public void go(){
        //if fuel level not above 0, throw runtime exception
        if(this.currentFuelLevel > 0){
            this.currentFuelLevel -= 5;
            System.out.println("Current Fuel Level is " + this.currentFuelLevel + 
            ". Maximum Fuel Level is " + this.maxFuelLevel);
        } else{
            throw new RuntimeException("Fuel Tank Empty.");
        }

    }

    /** Main function to test Engine. */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }

}
