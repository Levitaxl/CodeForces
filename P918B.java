
import java.util.Arrays;
import java.util.Scanner;

public class P918B {
    
    public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int n= entrada.nextInt(), m=entrada.nextInt();
        String []servers_ip=new String[n], commands_ip= new String[m];
        String []servers_names= new String[n], commands_names=new String[m];
        
        for (int i = 0; i < n; i++) {
            servers_names[i]= entrada.next();
            servers_ip[i]= entrada.next();
        }
        
        for (int i = 0; i < m; i++) {
            commands_names[i]= entrada.next();
            commands_ip[i]= entrada.next();
            
            commands_ip[i]=commands_ip[i].substring(0, commands_ip[i].length()-1);
        }
        
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(commands_ip[i].equals(servers_ip[j])){
                    System.out.println(commands_names[i]+" "+commands_ip[i]+"; #"+servers_names[j]);
                }
                
            }
            
        }
        

    }
    
    
}
