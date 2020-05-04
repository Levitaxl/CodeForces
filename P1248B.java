
import java.util.Arrays;
import java.util.Scanner;


public class P1248B {
    
    public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int numberOfSticks=entrada.nextInt();
        long[] sticksArray=new long[numberOfSticks];
        
         for (int i = 0; i < numberOfSticks; i++) sticksArray[i]=entrada.nextInt();
         
         Arrays.sort(sticksArray);
         
         
         int i=numberOfSticks-1;
         long ox=0;
         long oy=0;
         
         while(i>=(numberOfSticks/2)){
             ox=sticksArray[i]+ox;
             i--;
         }
         
         i=0;
         
         while(i<(numberOfSticks/2)){
             oy=sticksArray[i]+oy;
             i++;
         }
         

         System.out.println((ox*ox)+(oy*oy));
    }
    
}
