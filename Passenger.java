/**
 * The Passenger class represents an individual passenger with a name.
 * A passenger can board and get off a car.
 */
public class Passenger {

    /**
     * The name of the passenger.
     */
    private String name;

    /**
     * Constructor to initialize a passenger with a given name.
     *
     * @param name The name of the passenger.
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the passenger.
     *
     * @return The name of the passenger.
     */
    public String getName() {
        return name;
    }

    /**
     * Allows the passenger to board a given car.
     *
     * @param c The car to board.
     */
    public void boardCar(Car c) {
        c.addPassenger(this);
    }

    /**
     * Allows the passenger to get off a given car.
     *
     * @param c The car to get off from.
     */
    public void getOffCar(Car c) {
        c.removePassenger(this);
    }

    /**
     * Main method for demonstration or testing purposes.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        // Test functionality can be added here
    }
}
