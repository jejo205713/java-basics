import java.util.Scanner;

public class TextTransformer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        scanner.close();
        System.out.println(transform(x));
    }
//x is the string we get from user 
//creating a new function to tranform the string:
   public static String transform(String x){
       String[] words=x.split(" ");
       //we split the string we got with the delimiter " "-> space;
       StringBuilder t = new StringBuilder();
       boolean isUpper=true;
       //calling the StringBulilder class and creating a object t 
      
       for(int i=words.length-1;i>=0;i--){
           //converting the string words->char c;
       for(char c: words[i].toCharArray()){
           if(Character.isUpperCase(c)){
               t.append(Character.toLowerCase(c));
               //if char c is uppercase -> lowercase
           }
           else if(Character.isLowerCase(c)){
               t.append(Character.toUpperCase(c));
               //if char c is lowercase -> uppsercase
           }
           else{
               t.append(c);
               //just append the char as it isthe charecters like numbers and special character;
           }
       }
           
           if(i>0){
               t.append(" ");
           }
       }
       return t.toString();
       //returning values back to t string builder class as a string which can be printed !
   }
}
