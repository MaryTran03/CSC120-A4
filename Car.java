import java.util.ArrayList;

/**
 * The Car class represents a passenger car with a limited seating capacity.
 * It manages the list of passengers onboard and provides methods to add or remove passengers,
 * check the remaining seats, and print a list of passengers.
 */
public class Car {
    /**
     * List of passengers currently onboard the car.
     */
    private ArrayList<Passenger> PassengerList;

    /**
     * The maximum seating capacity of the car.
     */
    private int capacity;

    /**
     * Constructor to initialize a car with the given seating capacity.
     *
     * @param capacity The maximum seating capacity of the car.
     */
    public Car(int capacity){
        this.capacity = capacity;
        this.PassengerList = new ArrayList<>(capacity);
    }

    /**
     * Sets the maximum seating capacity of the car.
     *
     * @param capacity The new seating capacity of the car.
     */
    public void setMax_capacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the maximum seating capacity of the car.
     *
     * @return The maximum seating capacity.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Returns the number of seats remaining in the car.
     *
     * @return The number of available seats.
     */
    public int seatsRemaining(){
        return this.capacity - PassengerList.size();
    }

    /**
     * Adds a passenger to the car if there are remaining seats and the passenger is not already onboard.
     *
     * @param p The passenger to add.
     * @return true if the passenger was successfully added, false if the car is full or the passenger is already onboard.
     */
    public boolean addPassenger(Passenger p){
        if (PassengerList.contains(p)) {
            System.out.println("Passenger already onboard");
            return false;
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

    /**
     * Removes a passenger from the car if they are onboard.
     *
     * @param p The passenger to remove.
     * @return true if the passenger was successfully removed, false if the passenger was not found.
     */
    public boolean removePassenger(Passenger p){
        if (!PassengerList.contains(p)) {
            System.out.println("Passenger not found");
            return false;
        } else {
            PassengerList.remove(p);
            System.out.println("Done! Passenger removed");
            return true;
        }
    }

    /**
     * Prints the manifest of passengers onboard the car.
     * If there are no passengers, it prints "No passengers onboard".
     */
    public void printManifest(){
        if (this.PassengerList.isEmpty()){
            System.out.println("No passengers onboard");
        } else {
            for (Passenger p : PassengerList) {
                System.out.print(p.getName() + ", ");
            }
        }
    }

    /**
     * Main method to demonstrate adding, removing, and printing the passenger manifest for the car.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        Car car = new Car(2);

        // Initialize passengers and perform operations
        car.printManifest();  // Print passengers' names
    }
}
