package TasksLab3;

import TasksLab3.TasksL3;

import java.util.Scanner;

public class RunLab3 {
    public void RunTask(){
        Menu();
    }
    public Scanner input = new Scanner(System.in);
    public int InputInt(){
        int value = input.nextInt();
        return value;
    }
    private void Menu(){
        System.out.println("Laboratorium 3\n");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Zadanie 6\n7. Zadanie 7\n8. Wyjście");
        System.out.println("Wybierz, które zadanie rozwiązać: ");

        Scanner liczby = new Scanner(System.in);
        int wybor = InputInt();
        switch (wybor){
            case 1:
                TasksL3.zad1();
                break;
            case 2:
                TasksL3.zad2();
                break;
            case 3:
                TasksL3.zad3();
                break;
            case 4:
                TasksL3.zad4();
                break;
            case 5:
                TasksL3.zad5();
                break;
            case 6:
                TasksL3.zad6();
                break;
            case 7:
                TasksL3.zad7();
                break;
            default: break;
        }

    }

}
