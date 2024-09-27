public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
        //this.id = id;  
    }

    public String getName() {
        return name;
    }

    public void boardCar(Car c){
        c.addPassenger(this);
    }

    public void getOffCar(Car c){
        c.removePassenger(this);
    }

    public static void main(String[] args) {
        Passenger Jordan = new Passenger("Jordan");
        Car luxury = new Car(5);
        Jordan.boardCar(luxury);

    }
}
