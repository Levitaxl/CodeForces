import java.util.Scanner;

public class P1146A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int conta=0, contx=0;
        String s=entrada.nextLine();
        
        for (int i = 0; i < s.length(); i++) 
               if(s.charAt(i)=='a')conta++;
               else contx++;
        
        if(conta>contx) System.out.println(s.length());
        else if(contx==conta) System.out.println(s.length()-1);
        else if(contx>conta) System.out.println(s.length()-(contx-conta+1));
            
    }
        
}
    

