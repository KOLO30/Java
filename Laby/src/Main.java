import Lab5Zad.Car;
import Lab5Zad.Engine;
import Lab5Zad.FuelTank;
import Lab5Zad.Truck;
import Lab5Zad2.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Engine silnik1 = new Engine(230,"Benzynka");
//        FuelTank tankowanie1 = new FuelTank(30,15);
//        Engine silnik2 = new Engine(210,"Diesel");
//        FuelTank tankowanie2 = new FuelTank(40,15);
//
//        Car auto = new Car("Toyota","Yaris",2010,259,silnik1,tankowanie1,5);
//        Truck tir = new Truck("Mercedes","Vito",2015,230,silnik2,tankowanie2,30);
//
//        auto.displayInfo();
//        tir.displayInfo();
//
//        silnik1.startEngine();
//        silnik2.startEngine();
//
//        tankowanie1.refuel(5);
//        tankowanie2.refuel(12);
//
//        tankowanie1.consume(46);
//        tankowanie2.consume(4);

//zad 2
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(3,8);
        Punkt p3 = new Punkt(6,9);

        p1.opis();
        p2.przesun(2, -1);
        p2.opis();
        p3.zeruj();
        p3.opis();

        Prostokat prostokat = new Prostokat(4, 6, "Czerwony");
        prostokat.opis();
        prostokat.przesun(3, 5);
        prostokat.opis();

        Trojkat trojkat = new Trojkat(3, 5, "Niebieski");
        trojkat.opis();

        Kwadrat kwadrat = new Kwadrat(5, "Zielony");
        kwadrat.opis();

        Okrag okrag = new Okrag(new Punkt(2, 2), 5);
        okrag.opis();
        System.out.println("Powierzchnia: " + okrag.getPowierzchnia());
        System.out.println("Średnica: " + okrag.getSrednica());
        System.out.println("Czy punkt (3,3) jest w środku? " + okrag.wSrodku(new Punkt(3, 3)));
    }
    }
