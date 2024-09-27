import java.util.ArrayList;

/**
 * The Train class represents a train composed of multiple cars and an engine.
 * It manages the seating capacity of the train, tracks remaining seats, and handles passenger boarding and manifest printing.
 */
public class Train {

    /**
     * The engine of the train, responsible for fuel type and fuel capacity.
     */
    private Engine engine;

    /**
     * The list of cars attached to the train.
     */
    private ArrayList<Car> CarList;

    /**
     * The type of fuel used by the train.
     */
    private FuelType fuelType;

    /**
     * The total seating capacity of the train across all cars.
     */
    private int Total_capacity;

    /**
     * The total number of seats remaining in the train across all cars.
     */
    private int totalSeatsRemaining;

    /**
     * Constructor to initialize the train with a specified fuel type, fuel capacity, number of cars, and passenger capacity per car.
     *
     * @param fuelType The type of fuel used by the train.
     * @param fuelCapacity The total fuel capacity of the train's engine.
     * @param nCars The number of cars attached to the train.
     * @param passCapacity The seating capacity of each car.
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passCapacity) {
        this.CarList = new ArrayList<>(nCars);
        for (int i = 0; i < nCars; i++) {
            CarList.add(new Car(passCapacity));
        }
    }

    /**
     * Retrieves the engine of the train.
     *
     * @return The train's engine.
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Retrieves the car at the specified index in the car list.
     *
     * @param i The index of the car to retrieve.
     * @return The Car object at the specified index, or null if the index is invalid.
     */
    public Car getCar(int i) {
        if (i >= CarList.size() || i < 0) {
            System.out.println("Car not found. Try again");
            return null;
        } else {
            return CarList.get(i);
        }
    }

    /**
     * Calculates and returns the total seating capacity of the train by summing up the capacity of each car.
     *
     * @return The total seating capacity of the train.
     */
    public int getMaxCapacity() {
        this.Total_capacity = 0;
        for (int i = 0; i < this.CarList.size(); i++) {
            this.Total_capacity = this.Total_capacity + getCar(i).getCapacity();
        }
        return this.Total_capacity;
    }

    /**
     * Calculates and returns the total number of seats remaining in the train by summing up the remaining seats in each car.
     *
     * @return The total number of seats remaining in the train.
     */
    public int totalSeatsRemaining() {
        this.totalSeatsRemaining = 0;  // Reset to 0 before calculating
        for (int i = 0; i < this.CarList.size(); i++) {
            this.totalSeatsRemaining = this.totalSeatsRemaining + getCar(i).seatsRemaining();
        }
        return this.totalSeatsRemaining;
    }

    /**
     * Prints the manifest of all passengers onboard each car in the train.
     */
    public void printAllManifest() {
        for (int i = 0; i < this.CarList.size(); i++) {
            System.out.print("\nCar Number " + i + ": ");
            getCar(i).printManifest();
        }
    }

    /**
     * The main method to demonstrate adding and removing passengers, and printing manifests.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        // Initialize the train with 10 cars, each with a capacity of 5 passengers
        Train train = new Train(FuelType.ELECTRIC, 1000, 10, 5);
        Car car = train.getCar(2);  // Get the third car
        Car luxury = train.getCar(4);  // Get the fifth car

        // Print total capacity of the train
        System.out.println(train.getMaxCapacity());

        // Initialize passengers
        Passenger Alex = new Passenger("Alex");
        Passenger Jordan = new Passenger("Jordan");
        Passenger p = new Passenger("Trang");
        Passenger p1 = new Passenger("Bruce");
        Passenger p2 = new Passenger("Tatua");
        Passenger p3 = new Passenger("Cube");

        // Add and remove passengers from the cars
        car.addPassenger(p1);
        car.addPassenger(p2);
        car.removePassenger(p3);
        car.removePassenger(p2);
        luxury.addPassenger(p);

        // Jordan and Alex board different cars
        Jordan.boardCar(luxury);
        Alex.boardCar(car);

        // Print the manifest of all cars in the train
        train.printAllManifest();
        System.out.println(train.getMaxCapacity());
        System.out.println(train.totalSeatsRemaining());
    }
}
