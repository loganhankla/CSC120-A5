public class Passenger {
    
    private String name;

    public Passenger(String name) { 
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void boardCar(Car c){ 
        try{c.addPassenger(this);
        // catch Runtime Exception from addPassenger
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void getOffCar(Car c){ 
        try{c.removePassenger(this);
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
        // catch runtime exception
    }

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



