package Lab5Zad;

public class Car extends Vehicle{
    private int passagerCapacity;

    public Car(String brand, String model, int rokProdukcji, int maxSpeed, Engine engine, FuelTank fuelTank, int passagerCapacity) {
        super(brand, model, rokProdukcji, maxSpeed, engine, fuelTank);
        this.passagerCapacity = passagerCapacity;
    }

    public void displayInfo(){
        super.displayInfo();    // wywołanie klasy bazowej
        System.out.println("Poejmność pasażerska: "+ passagerCapacity+ "osób");
    }
}
