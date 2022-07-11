import java.util.Scanner;

/**
 *
 * @author herme
 */
public class P680B {
    
    public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int a = entrada.nextInt();
        String[] data=new String[n+1];
        
        for (int i = 1; i <= n; i++) data[i]=entrada.next();
        
        int i=a;
        int j=a;
        int cont=0;
        while(i>0 || j<=n ){
           if(i>0 && j<=n && data[i].equals("1") && data[j].equals("1")){
               if(i!=j)cont++;
               cont++;
           }
           else if(i<=0 && j<=n && data[j].equals("1")) cont++;
           else if(i>0 && j>n && data[i].equals("1"))   cont++;
           
           i--;
           j++;
        }
        System.out.println(cont);
    }
   
}
