package TasksLab4;

public class Student {
    private String imie,nazwisko,nazwa_specjalnosci;
    private int nr_albumu,rok_studiow;

    public Student(){
        this.imie="";
        this.nazwisko="";
        this.rok_studiow=0;
        this.nazwa_specjalnosci="";
        this.nr_albumu=0;
    }
    public Student(String imie, String nazwisko, int nr_albumu, String nazwa_specjalnosci, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.nr_albumu = nr_albumu;
        this.rok_studiow = rok_studiow;
    }

    public Student(String imie, int nr_albumu, int rok_studiow) {
        this.imie = imie;
        this.nr_albumu = nr_albumu;
        this.rok_studiow = rok_studiow;
    }

    public Student(String nazwa_specjalnosci, int rok_studiow) {
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.rok_studiow = rok_studiow;
    }

    public Student(String nazwisko, String nazwa_specjalnosci, int nr_albumu) {
        this.nazwisko = nazwisko;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.nr_albumu = nr_albumu;
    }
    public void wyswietl_dane(){
        System.out.println("Imie: "+imie+"\nNazwisko: "+nazwisko+"\nNazwa specjalności: "+nazwa_specjalnosci+"\nNr.albumu: "+nr_albumu+"\nRok studiów: "+rok_studiow);
    }
}
