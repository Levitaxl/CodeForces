
import java.util.Scanner;


public class P935A {
    
    public static void main(String[] args) {
        int n,cont=1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        
         for (int i = 2; i <=n / 2; i++) {
            if(n%i == 0)cont++;
        }
        
        System.out.println(cont);
    }
}
