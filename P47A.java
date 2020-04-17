
import java.util.Scanner;
public class P47A {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int n=entrada.nextInt(),per=0;
         
         for (int i = 1; i <= n; i++) if(i*(i+1)/2==n)per=1;
         
         if(per==1)System.out.println("YES");
         else System.out.println("NO");
     }
}
