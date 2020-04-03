import java.util.Scanner;

public class P1097A {
    public static void main(String[] args) {
        
        String n,n2;
        Scanner entrada = new Scanner(System.in);
        
        n = entrada.nextLine(); 
        n2 = entrada.nextLine();
        
        if(n2.charAt(0)==n.charAt(0) || n2.charAt(3)==n.charAt(0) || n2.charAt(6)==n.charAt(0) || n2.charAt(9)==n.charAt(0) || n2.charAt(12)==n.charAt(0))
            System.out.println("YES");
        else if (n2.charAt(1)==n.charAt(1) || n2.charAt(4)==n.charAt(1) || n2.charAt(7)==n.charAt(1) || n2.charAt(10)==n.charAt(1) || n2.charAt(13)==n.charAt(1)) 
            System.out.println("YES");
        else 
            System.out.println("NO");
    
    
    }
    
}
