
import java.util.Scanner;
public class P791A {
    public static void main(String[] args) { 
        int n;
        int k;
        int z=0;
        Scanner entrada = new Scanner(System.in);

        n = entrada.nextInt();
        k = entrada.nextInt();
        
        
        while(n<=k){
            if(n<=k){
                n=n*3;
                k=k*2;
                z++;
            }   
        }

        
        System.out.println(z);
        
        
        
        
  
   


            

        
        
        
    
    }
    
}
