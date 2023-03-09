public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void boardCar(Car c){ //check
        try{c.addPassenger(this);
        // catch Runtime Exception from addPassenger
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void getOffCar(Car c){ //check
        try{c.removePassenger(this);
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
        // catch runtime exception
    }

    ///main not done
//public static void main(String[] args) {
  //  Passenger pass3 = new Passenger("Adrienne");
    //pass3.boardCar(myCar);
    
//}

}


