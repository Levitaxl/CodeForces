
import java.util.Scanner;

public class P200B {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n=entrada.nextInt();    
        float sum=0;
        for (int i = 0; i < n; i++) sum=sum+(entrada.nextInt());
        System.out.println(sum/n);
    }   
    
}
