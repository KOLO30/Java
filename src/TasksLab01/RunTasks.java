package TasksLab01;
import javax.xml.transform.Source;
import java.util.Random;
import java.util.Scanner;

public class RunTasks {


    public Scanner input = new Scanner(System.in);
    //obiekt klasy Task
    Tasks tasks = new Tasks();

    public Random rand = new Random();
    //metoda uruchomieniowa
    public void Run(){
        MenuView(); // wywołwanie metody do wyśwetlenia menu
    }

    //metoda do wyśweitlenia menu
    private void MenuView(){
        System.out.println("Laboratorium 1\n");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Zadanie 6\n7. Zadanie 7\n8. Wyjście");
        System.out.println("Wybierz, które zadanie rozwiązać: ");

        Scanner liczby = new Scanner(System.in);
        int wybor = InputInt();
        switch (wybor){
            case 1 :
                System.out.println(tasks.Task001());
            break;
            case 2 :
                System.out.println("Podaj pierwszą liczbe: ");
                double v1 = liczby.nextDouble();
                System.out.println("Podaj drugą liczbe: ");
                double v2 = liczby.nextDouble();
                tasks.Task002(v1,v2);
            break;
            case 3 :
                System.out.println("Podaj liczbe:");
                int v3 = liczby.nextInt();
                tasks.task003(v3);
                break;
            case 4 :
                System.out.println("Podaj liczbe:");
                int v4 = liczby.nextInt();
                tasks.task004(v4);
            case 5 :
                System.out.println("Podaj liczbe");
                int v5 = liczby.nextInt();
                System.out.println("Trzecia potęga liczby "+ v5 +" to "+ tasks.task005(v5));
                break;
            case 6 :
                System.out.println("Podaj liczbe");
                int v6 = liczby.nextInt();
                System.out.println("Pierwiastek kwadratowy z liczby "+ v6 + " to "+ tasks.task006(v6));
                break;
            case 7 :
                System.out.println("Podaj przedział z jakiego mam wybrać liczby ");
                int v7 = liczby.nextInt();
                int v72 = liczby.nextInt();
                int min=Math.min(v7,v72);
                int max=Math.max(v7,v72);
                tasks.task007(rand.nextInt(min,max),rand.nextInt(min,max),rand.nextInt(min,max));
                break;
            default: break;
        }
    }

    //metdoa do wczytywania int
    public int InputInt(){

        int value = input.nextInt();
        return value;
    }

}
