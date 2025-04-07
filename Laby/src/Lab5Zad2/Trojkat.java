package Lab5Zad2;

public class Trojkat extends Figura{
    private float wysokosc;
    private float podstawa;

    public Trojkat() {
        super();
        this.wysokosc = 0;
        this.podstawa = 0;
    }

    public Trojkat(float wys, float podst, String kolor) {
        super(kolor);
        this.wysokosc = wys;
        this.podstawa = podst;
    }

    @Override
    public void opis() {
        System.out.println("Trójkąt: podstawa = " + podstawa + ", wysokość = " + wysokosc + ", kolor: " + kolor);
    }
}
