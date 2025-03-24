import Tasks.Run;
import TasksLab3.RunLab3;
import TasksLab4.DaneStudentow;
import TasksLab4.Osoba;
import TasksLab4.RunLab4;
import TasksLab4.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Run run = new Run();
//        run.RunT();
//        RunLab3 run3 = new RunLab3();
//        run3.RunTask();

        Osoba osoba1 = new Osoba("KOLO","NIE",21);
        Osoba osoba2 = new Osoba("TAK",20);
        Osoba osoba3 = new Osoba();

        osoba1.PokazDane();
        osoba2.PokazDane();
        osoba3.PokazDane();

//        RunLab4 run4 = new RunLab4();
//        run4.RunTask4();

        DaneStudentow db = new DaneStudentow();
        db.dodajStudenta(0, "EZ", "TAK", 12345, "Infa", 1);
        db.dodajStudenta(1, "Pol", "New", 54321, "Matma", 2);
        db.pokazStudenta(0);
        db.pokazStudenta(1);
        db.edytujStudenta(1, "Ale", "Kowal", 54321, "WF", 3);
        db.pokazStudenta(1);
        db.usunStudenta(0);
        db.pokazStudenta(0);
        db.pokazStudentowWZakresie(0, 5);
    }

}