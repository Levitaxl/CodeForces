import java.util.Scanner;


public class P1077A {
    public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int t=entrada.nextInt();
        long[] a=new long[t];
        long[] b=new long[t];
        long[] k=new long[t];
        
        
          for (int i = 0; i < t; i++) {
            a[i]=entrada.nextLong();
            b[i]=entrada.nextLong();
            k[i]=entrada.nextLong();
        }
          
        for (int i = 0; i < t; i++) {
            long aux;
            aux=k[i]/2;
            if(aux>k[i]) System.out.println(((aux-k[i])*a[i])-(k[i]*b[i]));
            else         System.out.println(((k[i]-aux)*a[i])-(aux*b[i]));  
        }
    
    }
}
