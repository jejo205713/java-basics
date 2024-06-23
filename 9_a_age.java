import java.util.*;
import java.time.Year;
public class main{
public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int birthy = s.nextInt();
        if(birthy<0){
            System.out.println("birthyear cant be negative nigga !");
        }
        else {
            int currenty=Year.now().getValue();
            int age = currenty-birthy;
            System.out.println(age);
        }
}
}
