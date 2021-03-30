
import java.util.Scanner;


public class P339B {
     public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int n= entrada.nextInt(), m=entrada.nextInt();
        long sum=0;
        int prevHouse=1;
        for (int i = 0; i < m; i++) {
            int nextHouse=entrada.nextInt();
            if(prevHouse<nextHouse)        sum+=nextHouse-prevHouse;
            else if(prevHouse>nextHouse)   sum+=n-(prevHouse-nextHouse);           
            prevHouse=nextHouse;  
        }
        System.out.println(sum);
    }
}
