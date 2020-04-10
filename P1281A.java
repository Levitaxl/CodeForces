import java.util.Scanner;

public class P1281A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int t=Integer.parseInt(entrada.nextLine());
        String[] s= new String[t];
        
        for (int i = 0; i < t; i++) s[i]=entrada.nextLine();
        
        for (int i = 0; i < t; i++) {
            if(s[i].charAt(s[i].length()-2)=='p') System.out.println("FILIPINO");
            else if(s[i].charAt(s[i].length()-4)=='d' || s[i].charAt(s[i].length()-4)=='m') System.out.println("JAPANESE");
            else if(s[i].charAt(s[i].length()-5)=='m') System.out.println("KOREAN");
        }
        
    }
    
}
