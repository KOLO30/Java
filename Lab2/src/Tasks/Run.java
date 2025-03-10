package Tasks;

import java.util.Scanner;

public class Run {
    public void RunT(){
        MenuView(); // wywołwanie metody do wyśwetlenia menu
    }
    public Scanner input = new Scanner(System.in);
    Tasks tasks =new Tasks();
    public int InputInt(){
        int value = input.nextInt();
        return value;
    }
    private void MenuView(){
        System.out.println("Laboratorium 3\n");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Wyjście");
        System.out.println("Wybierz, które zadanie rozwiązać: ");

        Scanner liczby = new Scanner(System.in);
        int wybor = InputInt();
        switch (wybor){
            case 1:
                Tasks.zad1();
                break;
            case 2:
                Tasks.zad2();
                break;
            case 3:
                Tasks.zad3();
                break;
            case 4:
                Tasks.zad4();
                break;
            case 5:
                System.out.println(Tasks.zad5());
                break;
            default: break;
        }

    }
}
