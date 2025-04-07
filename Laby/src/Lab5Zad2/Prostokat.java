package Lab5Zad2;

public class Prostokat extends Figura{
    private float wysokosc;
    private float szerokosc;
    private Punkt punkt;

    public Prostokat(float wys, float szer, String kolor) {
        super(kolor);
        this.wysokosc = wys;
        this.szerokosc = szer;
        this.punkt = new Punkt();
    }

    public void przesun(float dx, float dy) {
        punkt.przesun((int) dx, (int) dy);
    }

    @Override
    public void opis() {
        System.out.println("Prostokąt: " + szerokosc + "x" + wysokosc + ", kolor: " + kolor);
    }
}
