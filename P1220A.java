
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P1220A {
    
    public static void main(String[] args) throws IOException {
        int n;
        int n0=0;
        int n1=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        StringBuilder n2= new StringBuilder();
        StringBuilder n3= new StringBuilder();
    
        
        n3.append(br.readLine());
        n=Integer.parseInt(n3.toString());
        
        n2.append(br.readLine());
        
        for (int i = 0; i <n; i++) {
            if(n2.charAt(i)== 'z')n0++;
            else if(n2.charAt(i)== 'n') n1++;
        }   
        
        while(n1>0){
            n1--;
            System.out.print("1 ");}
        while(n0>0){
            n0--;
            System.out.print("0 ");}
  }
    
}
