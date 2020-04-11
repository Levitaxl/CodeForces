
import java.util.Scanner;

public class P677A {
    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         String [] s= new String[1];
         int n,m,cont=0;
         
         s=entrada.nextLine().split(" ");
         n=Integer.parseInt(s[0]);
         m=Integer.parseInt(s[1]);
         
         s=entrada.nextLine().split(" ");
         
         for (int i = 0; i < s.length; i++)
             if(Integer.parseInt(s[i])>m)cont=cont+2;
             else cont++;
         
         System.out.println(cont);
    
    
    }
    
}
