import java.util.Scanner;
public class P49A {
    public static void main (String[] args) { 
       Scanner entrada = new Scanner(System.in);    
       String s = (entrada.nextLine()).toLowerCase();
       int i=s.length()-1;
       
       while(i>=0){
           if(s.charAt(i)!=' ' && s.charAt(i)!='?'){
               if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='y')    System.out.println("YES");
               else System.out.println("NO");
               break;
           }
           i--;
       
       
    }
}
}
