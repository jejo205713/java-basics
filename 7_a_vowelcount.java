// editor2
import java.util.*;
class Simple{
    public static void remove(String str)
    {
        String newstr= new String();
        int length=str.length();
        //length=6 if string is "aeiouu"
        char x=' ';
        for(int i=0;i<length;i++)
        {
            x=str.charAt(i);
            //converting string values at str to char x !
            if(newstr.indexOf(x)<0)
            //indexOf() checks whether the char is already present ! 
            {
                if(x==' ')
                continue;
                // if the last values is empty it comes out of the loop 
                else
                newstr+=x;
                //or it adds values as char at newstr...
            }
        }
        System.out.println(newstr);
        //this is to print out the aeiou instead of aeiouu !
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String y=x.toLowerCase();
        int a=0,e=0,i=0,o=0,u=0,n=0;
        for(int j=y.length()-1;j>=0;j--)
        {
            char d=y.charAt(j);
            if(d=='a')
            a++;
            else if(d=='e')
            e++;
            else  if(d=='i')
            i++;
            else if(d=='o')
            o++;
            else if(d=='u')
            u++;
            else
            n++;
        }
        if(n==y.length())
        {
            remove(x);
            //we call remove() to display given string without duplicates 
            //even though there is no duplicates...
            System.out.println("No vowels found.");
        }
        else
        {
            remove(x);
            if(a>0)
            System.out.println("a"+a);
            if(e>0)
            System.out.println("e"+e);
            if(i>0)
            System.out.println("i"+i);
            if(o>0)
            System.out.println("o"+o);
            if(u>0)
            System.out.println("u"+u);
        }
    }
}
