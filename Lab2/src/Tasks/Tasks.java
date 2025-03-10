package Tasks;

import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public void run(){
        Run runing = new Run();
    }

    public static Random rand = new Random();

    public static void zad1(){
        InputData inputData = new InputData();
        double lPkt, suma=0;
        System.out.println("Podaj ilość studentów");
        int n = inputData.InputInt();
        int ile_Stud = n;

        if(n<0){
            System.out.println("Liczba studentów w grupie musi byc dodatnia");
        }
        else{
            while(n>0){
                System.out.println("Podaj ilość pkt");
                lPkt=inputData.InputDouble();
                if(lPkt>=0){
                    suma+=lPkt;
                }
                n--;
            }
            System.out.println("Średnia w grupie wynosi "+ suma/ile_Stud);

        }

    }
    public static void zad2(){
        InputData inputData = new InputData();
        int sumaD=0;
        int sumaU=0;
        int ileD=0;
        int ileU=0;
        int a;
        for(int i=0; i<10;i++){
            System.out.println("Podaj liczbe: ");
            a = inputData.InputInt();
            if(a>0){
                sumaD+=a;
                ileD++;
            }
            else{
                sumaU+=a;
                ileU++;
            }
        }
        System.out.println("Suma liczb dodatnich wynosi "+sumaD+ " a jest ich "+ ileD);
        System.out.println("Suma liczb ujemnych wynosi "+sumaU+ " a jest ich "+ ileU);
    }

    public static void zad3(){
        InputData inputData = new InputData();
        System.out.println("Podaj dlugosc ciagu");
        int suma=0;
        int n = inputData.InputInt();
        int a;
        while (n>0){
            System.out.println("Podaj liczbe "+ n);
            a = inputData.InputInt();
            if(a%2==0){
                suma+=a;
            }
            n--;
        }
        System.out.println("Suma liczb parzystych wynosi "+suma);
    }
    public static void zad4(){
        InputData inputData = new InputData();
        System.out.println("Podaj dlugosc ciagu");
        int suma=0;
        int n = inputData.InputInt();
        int a;
        while (n>0){
        a = rand.nextInt(-10,45);
            if(a%2==0){
                suma+=a;
            }
            n--;
        }
        System.out.println("Suma liczb parzystych wynosi "+suma);
    }
    public static String zad5(){
        InputData inputData = new InputData();
        System.out.println("Podaj słowo");
        String s = inputData.InputString();
        int n = s.length();
        for(int i=0, j =s.length()-1; i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return "Nie jest palimdoromem";
            }
        }
        return "To jest palimdromem";


    }

}
