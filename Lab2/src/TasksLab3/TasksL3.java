package TasksLab3;

import Tasks.InputData;

import java.util.Arrays;
import java.util.Scanner;

public class TasksL3 {
    public void run3(){RunLab3 r3 = new RunLab3();}
    public static Scanner input = new Scanner(System.in);
    public static void zad1(){
        Scanner input = new Scanner(System.in);
        float suma=0;
        double srednia=0;
        int a[]= RandomValue.RandomValueArr(2,22,6);
        for (int i=0; i<a.length;i++){
            suma+=a[i];
            System.out.println(a[i]);
        }
        srednia=suma/a.length;
        System.out.println("Suma wylosowanych elementów wynosi: "+ suma);
        System.out.println("Średnia wylosowanych elementów wynosi: "+srednia);
    }
    public static void zad2(){
        int tab1[]={5,6,7,8,1,2};
        int tab2[]={6,5,4,3,2};
        int j=0;
        for(int item: tab1){
            if(j%2==0){
                System.out.print(item +" ");
            }
            j++;
        }
        j=0;
        System.out.println("");
        for(int item: tab2){
            if(j%2==0){
                System.out.print(item+" ");
            }
            j++;
        }
    }
    public static void zad3(){
        String tab1[]={"asd","kolo","asdsda"};
        for (String i:tab1){
            System.out.println(i.toUpperCase());
        }
    }
    public static void zad4(){
        String tab1[] = new String[6];
        for(int i=0; i<6;i++){
            System.out.println("Podaj wyraz: ");
            tab1[i] = input.next();
        }
        for(int i=5;i>=0;i--){
            for (int j=tab1[i].length()-1;j>=0;j--)
            System.out.print(tab1[i].charAt(j));
            System.out.println("");
        }
    }
    public static void zad5(){
        int tab1[]=new int[8];
        for(int i=0; i<8;i++){
            System.out.println("Podaj liczbe: ");
            tab1[i]=input.nextInt();
        }
        Arrays.sort(tab1);
        for(int item:tab1){
            System.out.println(item);
        }
    }
    private static long silnia(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n*silnia(n-1);
    }
    public static void zad6(){
        int tab1[]= new int[5];
        for(int i=0; i<5;i++){
            System.out.println("Podaj liczbe");
            tab1[i]= input.nextInt();
        }

        for(int item: tab1){
            System.out.println(silnia(item));
        }
    }
    public static void zad7(){
        String tab1[]={"kolo","tak","nie"};
        String tab2[]={"kolo","tak","nie"};
       if(Arrays.equals(tab1,tab2)==true){
           System.out.println("tablice są identyczne");
       }
       else{
           System.out.println("tablice nie są identyczne");
       }
    }
}
