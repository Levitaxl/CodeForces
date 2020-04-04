
import java.util.Scanner;

public class P1154A {
    
    public static void main(String[] args) {
        int x1,x2,x3,x4,a,b,c;
        
        Scanner s = new Scanner(System.in);
        x1 = s.nextInt();
        x2 = s.nextInt();
        x3 = s.nextInt();
        x4 = s.nextInt();
        
        System.out.println(x1+" "+x2+" "+x3+" "+x4);
        
        
       c=x4-x1;
       b=x3-c;
       a=x2-c;
        
        System.out.println(a+" "+b+" "+c);
        


        
    }
    
}
