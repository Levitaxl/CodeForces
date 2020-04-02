
import java.util.Scanner;

public class P705A {
    
    public static void main(String[] args) {
        int n;
        String x=" that I hate";
        String y=" that I love";
        String z="I hate";
        int i=1;
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        
       while(i<n){
           if(i%2==0)z=z+x;
           else z=z+y;
           i++;
       }
       
        System.out.println(z+" it");
    
    
    
    }
    
}
