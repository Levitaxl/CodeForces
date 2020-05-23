import java.util.Arrays;
import java.util.Scanner;

public class P412B {
     public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int n=entrada.nextInt();
        int k=entrada.nextInt();
        int []a= new int[n];
        
        for (int i = 0; i < n; i++)a[i]=entrada.nextInt();
        
        Arrays.sort(a);
        System.out.println(a[n-k]);
    } 
}
