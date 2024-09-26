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

    public String addPassenger(Passenger p, Car c){

        // Check if there is enought seat
        if (c.seatsRemaining() > 0){
            PassengerList.add(p);
        } else {
            return "No seats available";
        }
        return "Passenger Added";
    }

    public String removePassenger(Passenger p){

        // Check if the passenger is already aboard
        if (!PassengerList.contains(p)) {
            return "Passenger not found";
        } else 
            PassengerList.removeIf(p);
            return "Done! Passenger removed";
    }

    public void printManifest(){
        for (Passenger p : PassengerList) {
            System.out.println(p);
        }
    }
    
    public static void main(String[] args) {        
    }

    /*
    Next, we'll set to work on the `Car` class. The `Car` class will need:

 - a constructor, which takes in an initial value for the `Car`'s maximum capacity and initializes an appropriately-sized `ArrayList`
 - accessor-like methods `public int getCapacity()` and `public int seatsRemaining()` that return the maximum capacity and remaining seats, respectively
 - `addPassenger(Passenger p)` and `removePassenger(Passenger p)` methods to add or remove a `Passenger` from the `Car` and return `True` if the operation was successful, and `False` otherwise. (_Hint: don't forget to check that there are seats available if someone wants to board, and to confirm that the `Passenger` is actually onboard before trying to remove them! If you encounter a problem, you should `return False`._)
 - and a final method `printManifest()` that prints out a list of all `Passenger`s aboard the car (or "This car is EMPTY." if there is no one on board).

As before, consider which of these should be `public` and which should be `private` (potentially with `accessor`s and/or `manipulator`s).

    */
}