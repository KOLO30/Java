package TasksLab4;

public class Osoba {
    private String imie,nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.nazwisko=null;
    }

    public Osoba() {
        this.imie=null;
        this.nazwisko=null;
        this.wiek=0;
    }

    public void PokazDane(){
        System.out.println("Imie: "+ imie+ "\nNazwisko: "+nazwisko+"\nWiek: "+wiek);
    }

}
