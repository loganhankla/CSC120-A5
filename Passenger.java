public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void boardCar(Car c){
        c.addPassenger(this);
        // catch Runtime Exception from addPassenger
    }

    public void getOffCar(Car c){
        c.removePassenger(this);
        // catch runtime exception
    
    }
}
