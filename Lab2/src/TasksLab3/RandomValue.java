package TasksLab3;

import java.util.Random;

public class RandomValue {
    /**
     *
     * @param a - początek przedziału losowania
     * @param b - koniec przedzialu losowania
     * @param ilosc - ilość elementów do wylosowania
     * @return - metoda zwraca wylosowaną wartość
     */
    public static int[] RandomValueArr(int a,int b,int ilosc){
        if(a>b){
            System.out.println("Początek przedziału nie może być większa od końca");
            return null;
        }
        if(ilosc<0){
            System.out.println("Ilość elementów dp wylosowanie nie moze być <0");
            return null;
        }
        Random rand =new Random();
        int[] values = new int[ilosc];
        for(int i=0; i<values.length;i++){
            values[i]= rand.nextInt(b-a+1)+a;
        }
        return values;
    }
}