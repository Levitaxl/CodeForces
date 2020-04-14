import java.util.Scanner;

public class P749A {
    static void printAsMaximalPrimeSum(int n) { 
        int cont2=0, cont3=0, cont=0;

        if (n % 2 == 1) { 
            cont++;
            cont3++; 
            n =n-3; 
        } 
        
        
        while (n>0) {
            cont++;
            cont2++; 
            n =n-2; 
        } 
        
        System.out.println(cont);
        for (int i = 0; i < cont2; i++)  System.out.print("2 ");
        for (int i = 0; i < cont3; i++)  System.out.println("3 ");
        
    } 
    
     public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int n=entrada.nextInt();
        printAsMaximalPrimeSum(n); 
    } 
}
