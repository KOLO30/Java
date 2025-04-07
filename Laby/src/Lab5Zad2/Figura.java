package Lab5Zad2;

public class Figura {
    protected String kolor = "brak";

    public Figura() {}

    public Figura(String kolor) {
        this.kolor = kolor;
    }

    public void opis() {
        System.out.println("To jest figura o kolorze: " + kolor);
    }
}
