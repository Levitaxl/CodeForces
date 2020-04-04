
import java.util.Scanner;
public class P1220A {
    
    public static void main(String[] args) {
        int n;
        String n2;
        
        
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        n2= s.nextLine();
        
        for (int i = 1; i <=n; i++) {
            if(n2.charAt(i)== 'z')System.out.print("0 ");
            if(n2.charAt(i)== 'n')System.out.print("1 ");
        }   
        
        //for (int i = 0; i < n1; i++) System.out.print("1 ");
        //for (int i = 0; i < n0; i++) System.out.print("0 ");
            
        
    
  }
    
}
