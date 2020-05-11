import java.util.Scanner;

public class P499B {
    
      public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int n= entrada.nextInt(), m=entrada.nextInt();
        String [] a= new String[m],b= new String[m],c=new String[n];
        
          for (int i = 0; i < m; i++) {
              a[i]=entrada.next();
              b[i]=entrada.next();
          }
          
          for (int i = 0; i <n; i++) c[i]=entrada.next();
          
          
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(c[i].equals(a[j])){
                        if(a[j].length()<=b[j].length())System.out.print(a[j]);
                        else System.out.print(b[j]);                    
                    }    
                }
              
                if((n-1)!=i)System.out.print(" ");
            }
        
      
      }
    
}
