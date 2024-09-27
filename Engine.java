/**
 * The Engine class represents an engine with a specific fuel type and fuel levels.
 * It allows for tracking of current fuel, refueling, and consumption of fuel as the engine runs.
 */
public class Engine {
    /**
     * The current amount of fuel in the engine.
     */
    double current_fuel;

    /**
     * The maximum fuel capacity of the engine.
     */
    double max_fuel;

    /**
     * The fuel type of the engine (e.g., ELECTRIC, DIESEL).
     */
    FuelType f = FuelType.ELECTRIC;

    /**
     * Constructor to initialize an engine with a given fuel type and current fuel amount.
     *
     * @param f The fuel type of the engine.
     * @param current_fuel The current amount of fuel in the engine.
     */
    public Engine(FuelType f, double current_fuel) {
        this.f = f;
        this.current_fuel = current_fuel;
    }

    /**
     * Gets the current fuel level of the engine.
     *
     * @return The current fuel level.
     */
    public double getCurrent_fuel() {
        return current_fuel;
    }

    /**
     * Gets the maximum fuel capacity of the engine.
     *
     * @return The maximum fuel capacity.
     */
    public double getMax_fuel() {
        return max_fuel;
    }

    /**
     * Gets the fuel type of the engine.
     *
     * @return The fuel type of the engine.
     */
    public FuelType getF() {
        return f;
    }

    /**
     * Sets the current fuel level of the engine.
     *
     * @param current_fuel The new current fuel level to set.
     */
    public void setCurrent_fuel(double current_fuel) {
        this.current_fuel = current_fuel;
    }

    /**
     * Sets the maximum fuel capacity of the engine.
     *
     * @param max_fuel The new maximum fuel capacity to set.
     */
    public void setMax_fuel(double max_fuel) {
        this.max_fuel = max_fuel;
    }

    /**
     * Refuels the engine, setting the current fuel level to the maximum fuel capacity.
     */
    public void refuel() {
        this.current_fuel = this.max_fuel;
    }

    /**
     * Simulates running the engine, reducing the fuel by 50 units on each call.
     *
     * @return TRUE if there is remaining fuel, FALSE if the fuel is depleted.
     */
    public Boolean go() {
        // Assuming for each go, current fuel goes down by 50 units
        this.current_fuel = this.current_fuel - 50;
        // Return TRUE if there is remaining fuel, otherwise return FALSE
        return this.current_fuel > 0;
    }

    /**
     * The main method to demonstrate the functionality of the Engine class.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        // Initialize a new engine with a fuel type and current fuel level
        Engine myEngine = new Engine(FuelType.ELECTRIC, 200.0);
        myEngine.setMax_fuel(1000);

        // Simulate running the engine until the fuel runs out
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");

        // Test refueling the engine
        myEngine.refuel();
        System.out.println(myEngine.getCurrent_fuel());
    }
}
