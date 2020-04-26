import java.util.Scanner;

public class P1208A {
     public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int n=entrada.nextInt();
        int m=entrada.nextInt();
        String [] x = new String[n+1];
        int contx=0,conty=0,cont=0;

        for (int i =0; i <= n; i++) x[i]=entrada.nextLine();
        
        for (int i = 1; i <=n; i++) 
            for (int j = 0; j <m; j++)
                if(x[i].charAt(j)=='B'){
                    contx=contx+j;
                    conty=conty+i;
                    cont++;                            
               }
           
         
         System.out.print(((conty/cont))+" ");
         System.out.print((contx/cont)+1);
             
     }
    
}
