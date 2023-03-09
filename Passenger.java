/**
 * Filename: Passenger.java
 * Description: The Passenger class creates new passengers, stores information about passengers, and has methods for them to get on or off cars, using its association with the car class.
 * @author Logan Hankla
 * Date: 8 March 2023
 */

public class Passenger {
    
    private String name;

    /** This constructor creates a new passenger.
     * @param name Passenger's name.
     */
    public Passenger(String name) { 
        this.name = name;
    }

    /** This getter returns a passenger's name. */
    public String getName(){
        return this.name;
    }

    /** This function moves a passenger onto a car if there is space on it.
     * @param c The car the passenger will board.
     * @throws e The RuntimeException from the Car class's addPassenger() function.
     */
    public void boardCar(Car c){ 
        try{c.addPassenger(this);
        // catch Runtime Exception from addPassenger
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    /** This function removes passengers from cars if they were on it.
     * @param c The car to be removed from.
     * @throws e RuntimeException from Car class's removePassenger() function.
     */
    public void getOffCar(Car c){ 
        try{c.removePassenger(this);
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    /** Main function to test. */
    public static void main(String[] args) {
        Passenger pass3 = new Passenger("Adrienne");
        Passenger pass4 = new Passenger("Amelia");
        Car c = new Car(20);
        pass3.boardCar(c);
        //pass4.boardCar(c);
        System.out.println(pass3.getName());
        c.printManifest();
        pass3.getOffCar(c);
        c.printManifest();
    
    }

}



