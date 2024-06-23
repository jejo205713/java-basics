import java.util.*;
public class main{
    public static void main(String arg[])
    Scanner s=new Scanner(System.in);
    int size=s.nextInt()
    int[] arr=new int[size]
    for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
    }
    int a=arr[0],b=0;
    for(int i=0;i<size;i++){
        if(arr[i]>a){
            a=arr[i];
            b=i;
            
        }
    }
    System.out.println("Maximum Element : "+a);
    System.out.println("Index of maximum element : "+b);
    
}
