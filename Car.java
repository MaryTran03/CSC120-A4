import java.util.ArrayList;

public class Car {
    ArrayList<Passenger> PassengerList;
    int max_capacity;

    public Car(int max_capacity){
        this.max_capacity = max_capacity;
        this.PassengerList = new ArrayList<>(max_capacity);
    }
    
    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public int seatsRemaining(){
        return this.max_capacity - PassengerList.size();
    }

    public boolean addPassenger(Passenger p){
        if (PassengerList.contains(p)) {
            System.out.println("Passenger already onboard");
            return false;
        // Check if there is enough seat
        } else {
            if (this.seatsRemaining() > 0){
                PassengerList.add(p);
                System.out.println("Passenger added");
                return true;
            } else {
            System.out.println("No seats available");
            return false;
        }
    }
}
    public boolean removePassenger(Passenger p){
        // Check if the passenger is already aboard
        if (!PassengerList.contains(p)) {
            System.out.println("Passenger not found");
            return false;
        } else {
            PassengerList.remove(p);
            System.out.println("Done! Passenger removed");
            return true;
        }
    }

    public void printManifest(){
        if (this.PassengerList.isEmpty()){
            System.out.println("No passengers onboard");
        } else {
        for (Passenger p : PassengerList) {
            System.out.println(p.getName());
        }}
    }
    
    public static void main(String[] args) {        
        Car car = new Car(2);

        // Initialize passengers
        Passenger p = new Passenger("Trang");
        Passenger p1 = new Passenger("Bruce");
        Passenger p2 = new Passenger("Tatua");
        Passenger p3 = new Passenger("Tatua Beo");

        // Add and remove passengers
        car.addPassenger(p1);
        car.addPassenger(p2);
        car.removePassenger(p3);
        car.removePassenger(p2);
        car.addPassenger(p);

        // Print passengers name
        car.printManifest();

    }

    /*
    Next, we'll set to work on the `Car` class. The `Car` class will need:

 - a constructor, which takes in an initial value for the `Car`'s maximum capacity and initializes an appropriately-sized `ArrayList`
 - accessor-like methods `public int getCapacity()` and `public int seatsRemaining()` that return the maximum capacity and remaining seats, respectively
 - `addPassenger(Passenger p)` and `removePassenger(Passenger p)` methods to add or remove a `Passenger` from the `Car` and return `True` if the operation was successful, and `False` otherwise. (_Hint: don't forget to check that there are seats available if someone wants to board, and to confirm that the `Passenger` is actually onboard before trying to remove them! If you encounter a problem, you should `return False`._)
 - and a final method `printManifest()` that prints out a list of all `Passenger`s aboard the car (or "This car is EMPTY." if there is no one on board).

As before, consider which of these should be `public` and which should be `private` (potentially with `accessor`s and/or `manipulator`s).

    */


    /*
    Next, we'll set to work on the `Car` class. The `Car` class will need:

 - a constructor, which takes in an initial value for the `Car`'s maximum capacity and initializes an appropriately-sized `ArrayList`
 - accessor-like methods `public int getCapacity()` and `public int seatsRemaining()` that return the maximum capacity and remaining seats, respectively
 - `addPassenger(Passenger p)` and `removePassenger(Passenger p)` methods to add or remove a `Passenger` from the `Car` and return `True` if the operation was successful, and `False` otherwise. (_Hint: don't forget to check that there are seats available if someone wants to board, and to confirm that the `Passenger` is actually onboard before trying to remove them! If you encounter a problem, you should `return False`._)
 - and a final method `printManifest()` that prints out a list of all `Passenger`s aboard the car (or "This car is EMPTY." if there is no one on board).

As before, consider which of these should be `public` and which should be `private` (potentially with `accessor`s and/or `manipulator`s).

    */
}