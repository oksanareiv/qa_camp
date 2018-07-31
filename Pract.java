import java.lang.Math;

public class Pract {


    public double korin(Double n){
        Math.sqrt(n);
        if(n<0){
            throw new ArithmeticException("Wrong number to couting");
        }
        return Math.sqrt(n);
    }

    public static void main (String [] args){
        Pract Task = new Pract();
        System.out.println(Task.korin(9.0));

    }
}
