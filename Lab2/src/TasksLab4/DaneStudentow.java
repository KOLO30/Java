package TasksLab4;

public class DaneStudentow {
    private Student[] studenci;

    public  DaneStudentow(){
        studenci = new Student[100];
        for(int i=0; i<100;i++){
            studenci[i]= new Student();
        }
    }
    public void dodajStudenta(int index, String imie, String nazwisko, int nrIndeksu, String specjalnosc, int rokStudiow) {
        if (index >= 0 && index < 100) {
            studenci[index] = new Student(imie, nazwisko, nrIndeksu, specjalnosc,rokStudiow);
            System.out.println("Dodano studenta na indeks " + index);
        } else {
            System.out.println("Nieprawidłowy indeks!");
        }
    }

    public void edytujStudenta(int index, String imie, String nazwisko, int nrIndeksu, String specjalnosc, int rokStudiow) {
        if (index >= 0 && index < 100) {
            studenci[index] = new Student(imie, nazwisko, nrIndeksu, specjalnosc, rokStudiow);
            System.out.println("Zmieniono dane studenta na indeksie " + index);
        } else {
            System.out.println("Nieprawidłowy indeks!");
        }
    }


    public void usunStudenta(int index) {
        if (index >= 0 && index < 100) {
            studenci[index] = new Student(); // Resetujemy dane
            System.out.println("Usunięto studenta na indeksie " + index);
        } else {
            System.out.println("Nieprawidłowy indeks!");
        }
    }


    public void pokazStudenta(int index) {
        if (index >= 0 && index < 100) {
            System.out.print("Student na indeksie " + index + ": ");
            studenci[index].wyswietl_dane();
        } else {
            System.out.println("Nieprawidłowy indeks!");
        }
    }

    public void pokazWszystkichStudentow() {
        for (int i = 0; i < 100; i++) {
            System.out.print("[" + i + "] ");
            studenci[i].wyswietl_dane();
        }
    }

    public void pokazStudentowWZakresie(int start, int koniec) {
        if (start >= 0 && koniec < 100 && start <= koniec) {
            for (int i = start; i <= koniec; i++) {
                System.out.print("[" + i + "] ");
                studenci[i].wyswietl_dane();
            }
        } else {
            System.out.println("Nieprawidłowy zakres indeksów!");
        }
    }
}
