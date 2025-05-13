public class Main {

    public enum Swiatlo{
        CZERWONE("Stój"),ZOLTE("Uwaga!"),ZIELONE("Jedź!");
        private final String komunikat;

        Swiatlo(String komunikat) {
            this.komunikat = komunikat;
        }

        public String getKomunikat() {
            return komunikat;
        }
    }
    public enum PizzaSize{
            MALA(20,18.99),SREDNIA(30,26),DUZA(40,32.99);
        private final int srednica;
        private final double cena;

        PizzaSize(int srednica, double cena) {
            this.srednica = srednica;
            this.cena = cena;
        }

        public int getSrednica() {
            return srednica;
        }

        public double getCena() {
            return cena;
        }
    }



    public static void main(String[] args) {
        Swiatlo aktualne = Swiatlo.CZERWONE;
        switch (aktualne){
            case CZERWONE -> System.out.println("Stój!");
            case ZOLTE -> System.out.println("Uwaga!");
            case ZIELONE -> System.out.println("Jedź!");
            default -> System.out.println("rób co chesz");
        }
        System.out.println(PizzaSize.DUZA.getSrednica());
        System.out.println(PizzaSize.DUZA.getCena());
    }
}