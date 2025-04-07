package Lab5Zad2;

public class Kwadrat extends Prostokat{
    public Kwadrat(float bok, String kolor) {
        super(bok, bok, kolor);
    }

    public void opis() {
        System.out.println("Kwadrat ma kolor: " + kolor);
    }
}
