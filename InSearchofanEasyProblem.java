import java.util.Scanner;

public class InSearchofanEasyProblem{
    
    public static void main(String[] args) { 
        String n;
         String n2;
        Integer per=0;
        Integer i=0;
        Scanner entrada = new Scanner(System.in);
        
  
   
        n = entrada.nextLine();
        n2=entrada.nextLine();
        
        
        while ( i< n2.length() ){
            if(n2.charAt(i)=='1') {
                per=1;
                break;
            };
            i=i+2;
        }
        
        if(per==0) System.out.println("EASY");
        else  System.out.println("HARD");

            

        
        
        
    
    }
    
}
