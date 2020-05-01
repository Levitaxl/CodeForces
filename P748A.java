
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class P748A {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int columns=entrada.nextInt(), rows=entrada.nextInt(),position=entrada.nextInt(),contPosition=1;
        
       
                
        for (int i = 1; i <=columns; i++) {
            for (int j = 1; j <=rows; j++) {
                for (int k = 0; k <= 1; k++) {
                    if(contPosition==position){  
                        if(contPosition%2!=0)System.out.println(i+" "+j+" "+"L");
                        else System.out.println(i+" "+j+" "+"R");
                        
                    }
                    contPosition++;
                }
                
            }
            
        }
        
        
        
    
    }
}
