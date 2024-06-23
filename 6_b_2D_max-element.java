import java.util.*;
class Howaisanmigi{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n,m,n1=0,m1=0;
        n=s.nextInt();
        m=s.nextInt();
        double[][]a=new double[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=s.nextDouble();
            }
            
        }
        double x=a[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]>x)
                {
                    x=a[i][j];
                    n1=i;
                    m1=j;
                }
            }
        }
        
    System.out.println("Maximum Element: "+x);
    System.out.println("Row Index of Maximum Element: "+n1);
    System.out.println("Column Index of Maximum Element: "+m1);
    
        
    }
}
