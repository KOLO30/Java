package TasksLab01;

public class Tasks {

    protected String Task001(){
        return "Krystian lat 20";
    }
    /*
    * param value1: double  - wartośc pierwszego argumentu
    * param value2: double   - wartośc drugiego argumentu
    * */
    protected void Task002(double value1, double value2){
        System.out.println("Suma "+ value1 + " + " + value2 + " = "+ (value1+value2));
        System.out.println("Różnica "+ value1 + " - " + value2 + " = "+ (value1-value2));
        System.out.println("Iloczyn "+ value1 + " * " + value2 + " = "+ (value1*value2));
        if (value2 != 0 )
            System.out.println("Iloraz "+ value1 + " / " + value2 + " = "+ (value1/value2));
        else System.out.println("Nie można dzielić przez zero");
    }
    protected boolean task003(int value1){
        if(value1%2==0){
            System.out.println("Parzysta");
            return true;
        }else
            System.out.println("Nieparzysta");
            return false;
    }
    protected boolean task004(int value1){
        if(value1%3==0 && value1%5==0){
            System.out.println("Podzielna przez 3 oraz 5");
            return true;
        }
        else{
            System.out.println("Nie dzieli się jednocześnie przez 3 oraz 5");
            return false;
        }
    }
    protected double task005(int value1){
        return Math.pow(value1,3);
    }
    protected double task006(int value1){
        return Math.sqrt(value1);
    }
    protected boolean task007(int value1,int value2,int value3){
        int max= Math.max(Math.max(value1,value2),value3);
        int min1 = Math.min(value1,value2);
        int min2 = Math.min(Math.max(value1,value2),value3);
        if((min1*min1)+(min2*min2)==max*max){
            System.out.println("Trójkąt o bokach długości "+min1+ ", "+min2+", "+max + " jest prostokątny");
            return true;
        }
        else{
            System.out.println("Trójkąt o bokach długości "+min1+ ", "+min2+", "+max + " nie jest prostokątny");
            return false;
        }
    }
}
