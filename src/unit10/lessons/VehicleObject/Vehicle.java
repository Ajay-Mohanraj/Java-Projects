package unit10.lessons.VehicleObject;

public class Vehicle {
    private String make;
    private String model;
    private double fuelCapacity;
    private double fuelLevel;
    private double mpg;
    private double totalMiles = 0;

    public Vehicle(String make, String model, double fuelCapacity, double fuelLevel, double mpg) {
        this.make = make;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
        this.mpg = mpg;
    }

    public Vehicle(String make, String model, double fuelCapacity, double mpg) {
        this.make = make;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelCapacity;
        this.mpg = mpg;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getTotalMiles() {
        return totalMiles;
    }

    public double getRange(){
        return getMpg() * getFuelLevel();
    }

    public boolean drive (double miles) {
        if (miles > getRange()){
            return false;
        } else {
            totalMiles += miles;
            fuelLevel -= miles / getMpg();
            return true;
        }
    }

    public void addGas(double gas){
        if (getFuelLevel() + gas  > getFuelCapacity()){
            fuelLevel = getFuelCapacity();
        }
        else {
            fuelLevel += gas;
        }
    }

    public String toString(){
        String yeet = String.format("%s %s (%.1f mpg);  %.1f / %.1f gallons in tank; \nRange = %.1f miles", make, model, mpg, fuelLevel, fuelCapacity, getRange());
        return yeet;
    }
}
