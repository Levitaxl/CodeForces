
import java.util.Scanner;

public class P996A {
     public static void main(String[] args) {
        int n;
        int cont=0;
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        
        while(n>0){
            if(n>=100){
                n=n-100;
                cont++;
            }
            else if(n>=20){
                n=n-20;
                cont++;
            }
            else if(n>=10){
                n=n-10;
                cont++;
            }
            else if(n>=5){
                n=n-5;
                cont++;
            }
            else if(n>=1){
                n=n-1;
                cont++;
            }
            
    
            
        }
        
         System.out.println(cont);
       
    
     }
    
}
