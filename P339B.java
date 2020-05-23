
import java.util.Scanner;


public class P339B {
     public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        long n= entrada.nextLong(), m=entrada.nextLong();
        long []a=new long[(int)m];
        
         for (int i = 0; i < m; i++) a[i]=entrada.nextLong();
         
         
         int sum=0;
         int aux=1;
         for (int i = 0; i < m; i++) {
             //if(aux>a[i]) sum=sum+n-aux+a[i];
             //else sum=sum+a[i]-aux;
             
           //  aux=a[i];
             
         }
         
         System.out.println(sum);
        

    }
    
    
}
