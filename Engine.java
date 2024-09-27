public class Engine {
    double current_fuel;
    double max_fuel;
    FuelType f = FuelType.ELECTRIC;

    public Engine(FuelType f, double current_fuel){
        this.f = f; 
        this.current_fuel = current_fuel;
    }
    public double getCurrent_fuel() {
        return current_fuel;
    }

    public double getMax_fuel() {
        return max_fuel;
    }

    public FuelType getF() {
        return f;
    }

    public void setCurrent_fuel(double current_fuel) {
        this.current_fuel = current_fuel;
    }

    public void setMax_fuel(double max_fuel) {
        this.max_fuel = max_fuel;
    }

    public void refuel(){
        this.current_fuel = this.max_fuel;
    }

    public Boolean go(){
        // Assuming for each go, current fuel goes down by 50
        this.current_fuel = this.current_fuel - 50;
        // Return the TRUE if there is remaining fuels, otherwise print FALSE
        if (this.current_fuel>0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        // Initialize the new engine and their max fuel
        Engine myEngine = new Engine(FuelType.ELECTRIC, 200.0);
        myEngine.setMax_fuel(1000);

        // Run the engine for every round
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");

        // Test the refuel
        myEngine.refuel();
        System.out.println(myEngine.getCurrent_fuel());
    }
    
}