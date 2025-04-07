package Lab5Zad;

public class FuelTank {
    private double capacity;
    private double currentLevel;

    public FuelTank(double capacity, double currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }
    public void refuel(double a){
        if(currentLevel+ a/6.5>capacity){
            System.out.println("Błąd - za duzo zatankowałeś");
        }
        else{
            currentLevel+=a/6.5;
            System.out.println("Masz "+currentLevel+" litrów paliwa");
        }
    }
    public void consume(double n){
        if(currentLevel<n){
            System.out.println("ZuZycie przekracza poziom paliwa");
        }
        else{
            currentLevel-=n;
            System.out.println("Zużyto: "+n+" l paliwa\nZostało: "+currentLevel+" l paliwa");
        }
    }

}
