import java.util.*;
public class Jejo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int a=0,e=0,ii=0,o=0,u=0,c=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch=='A'||ch=='a')
            a++;
            else if(ch=='E'||ch=='e')
            e++;
            else if(ch=='I'||ch=='i')
            ii++;
            else if(ch=='O'||ch=='o')
            o++;
            else if(ch=='U'||ch=='u')
            u++;
            else 
            c++;
        }
        String nstr=" ";
        for(int i=0;i<st.length();i++)
        {
            int f=0;
            for(int j=0;j<nstr.length();j++){
                if(st.charAt(i)==nstr.charAt(j))
                {
                    f+=1;
                }
            }
            if((f==0)&&(st.charAt(i)!=' '))
            {
                nstr=nstr+st.charAt(i);
            }
        }
        System.out.println(nstr);
        if(c!=st.length())
        {
            if(a>0)
            System.out.println("a"+a);
            if(e>0)
            System.out.println("e"+e);
            if(ii>0)
            System.out.println("i"+ii);
            if(o>0)
            System.out.println("o"+o);
            if(u>0)
            System.out.println("u"+u);
        }
        else
        {
            System.out.println("No vowels found.");
        }
    }
}
