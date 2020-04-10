
import java.util.Scanner;

public class P617A {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int n=entrada.nextInt(), cont=0;
         
         while(n>0){
             if(n>=5)n=n-5;
             else if (n>=4)n=n-4;
             else if (n>=3)n=n-3;
             else if (n>=2)n=n-2;
             else if (n>=1)n=n-1; 
             cont++;
         }
         
         System.out.println(cont);
    
    
    }
    
}
