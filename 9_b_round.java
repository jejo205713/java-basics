import java.util.*;
public class round{
    public static int convert(double x){
        return (int)Math.round(x);
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        double x = s.nextDouble();
        int y=convert(x);
        System.out.println("Rounded number : "+y);
    }
}
