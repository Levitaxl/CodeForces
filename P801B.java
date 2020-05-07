
import java.util.Scanner;

public class P801B {
    public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int per=0;
        String s1=entrada.nextLine(), s2=entrada.nextLine();
        
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)<s2.charAt(i)){
                per=1;
                break;
            }
        }
        
        if(per==0)System.out.println(s2);
        else System.out.println("-1");
        
    }
}
