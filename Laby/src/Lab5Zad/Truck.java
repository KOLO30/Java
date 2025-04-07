package Lab5Zad;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String brand, String model, int rokProdukcji, int maxSpeed, Engine engine, FuelTank fuelTank, double loadCapacity) {
        super(brand, model, rokProdukcji, maxSpeed, engine, fuelTank);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Maksymalna ładowność: "+loadCapacity+" ton");
    }
}
