
import java.util.Scanner;

public class P59A {
    public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        String s= entrada.nextLine();
        int contu=0, contl=0;
        
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))contu++;
            else contl++;
        }
        
        if(contu<contl || contu==contl)System.out.println(s.toLowerCase());
        else System.out.println(s.toUpperCase());
        
            
    }
}
