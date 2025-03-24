package Tasks;

import java.util.Scanner;

public class InputData {
    Scanner input = new Scanner(System.in);

    public int InputInt(){
        return input.nextInt();
    }
    protected double InputDouble() {
        return input.nextDouble();
    }
    public String InputString(){return input.next();}
}
