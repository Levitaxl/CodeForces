
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
public class P1256A {
    
      public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int q= entrada.nextInt();
        int[] a =new int[q],b=new int[q],n=new int[q],s=new int[q];
        
          for (int i = 0; i < q; i++) {
              a[i]=entrada.nextInt();
              b[i]=entrada.nextInt();
              n[i]=entrada.nextInt();
              s[i]=entrada.nextInt();
          }
          
          
          
          for (int i = 0; i < q; i++) {
              s[i]-=Math.min(s[i]/n[i],a[i])*n[i];
              if(s[i]>b[i]) System.out.println("NO");
              else System.out.println("YES");
          }
      }
      
    
}
