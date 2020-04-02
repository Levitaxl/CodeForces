

import java.util.Scanner;


public class Excercices {


    public static void main(String[] args) {
        int n;
        int k;
        Scanner entrada = new Scanner(System.in);

        n = entrada.nextInt();

        k = entrada.nextInt();
        
        for(int i = 0; i <k; i++){
            if(n%10==0){
                n=n/10;
            }
            else{
                n--;
            }
 
        }
        
        System.out.println(n);
        
        
       
    }
    
}
