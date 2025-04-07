package Lab5Zad;

public class Vehicle {
    protected String brand;
    protected String model;
    protected  int rokProdukcji;
    protected int maxSpeed;
    Engine engine;
    FuelTank fuelTank;


    public Vehicle(String brand, String model, int rokProdukcji, int maxSpeed, Engine engine, FuelTank fuelTank) {
        this.brand = brand;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public void displayInfo(){
        System.out.println("****** Pojazd ******"+
                "\nMarka: "+ brand+
                "\nModel: "+ model+
                "\nRok produkcji: "+ rokProdukcji+
                "\nMaksymalna prędkość: "+maxSpeed);
    }
}
