import java.util.Arrays;
import java.util.Scanner;

public class P169A {
    public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int totalChores=entrada.nextInt(),petya=entrada.nextInt(),vasyla=entrada.nextInt();
        int[] complexityArray=new int[totalChores+1];
        
         for (int i = 1; i <= totalChores; i++) complexityArray[i]=entrada.nextInt();
         
         Arrays.sort(complexityArray); 
         if(complexityArray[vasyla+1]>=complexityArray[vasyla])System.out.println(complexityArray[vasyla+1]-complexityArray[vasyla]);
         else System.out.println(0);
    }
    
}
