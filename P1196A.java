import java.util.Scanner;


public class P1196A {
    
    public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int n=entrada.nextInt();
        long n1,n2,n3;
        long[] a=new long[n];
        
        for (int i = 0; i < n; i++) {
            n1=entrada.nextLong();
            n2=entrada.nextLong();
            n3=entrada.nextLong();
            a[i]=(n1+n2+n3)/2;
        }
        
        for (int i = 0; i < n; i++) System.out.println(a[i]);
    
    
    }
    
}
