package TasksLab4;

import TasksLab3.TasksL3;

import java.awt.*;
import java.util.Scanner;

public class RunLab4 {
    public void RunTask4(){
        Menu();
    }
    public Scanner input = new Scanner(System.in);
    public int InputInt(){
        int value = input.nextInt();
        return value;
    }
    private void Menu(){
        System.out.println("Laboratorium 3\n");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Wyjście");
        System.out.println("Wybierz, które zadanie rozwiązać: ");

        Scanner liczby = new Scanner(System.in);
        int wybor = InputInt();
        switch (wybor){
            case 1:

                break;
            case 2:
                TaskL4.zad2();
                break;
            case 3:
                TaskL4.zad3();
                break;
            case 4:

                break;
            default: break;
        }

    }
}
