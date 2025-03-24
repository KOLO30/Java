package TasksLab4;

import Tasks.InputData;

import java.util.Scanner;

public class TaskL4 {
    public static void zad2(){
        Student student1 = new Student("KOLO","OP",135,"TAK",1);
        Student student2= new Student("KOLO",12,4);
        Student student3= new Student("ez",21);
        Student student4= new Student("polska","dla",2137);

        student1.wyswietl_dane();
        student2.wyswietl_dane();
        student3.wyswietl_dane();
        student4.wyswietl_dane();
    }
    Scanner input = new Scanner(System.in);

    public static void zad3(){
        InputData inputData = new InputData();
        System.out.println("Podaj imie: ");
        String imie=inputData.InputString();

        System.out.println("Podaj nazwisko: ");
        String nazwisko=inputData.InputString();

        System.out.println("Podaj nazwę specjalności: ");
        String nazwas=inputData.InputString();

        System.out.println("Podaj numer albumu: ");
        int nr=inputData.InputInt();

        System.out.println("Podaj rok stódiów: ");
        int rok=inputData.InputInt();
    }
}
