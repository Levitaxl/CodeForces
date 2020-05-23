
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
    
public class P1132B {
    
   /* public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        int n=entrada.nextInt();
        int []a= new int[n];
        long sum=0;
        
        for (int i = 0; i < n; i++){ 
            a[i]=entrada.nextInt();
            sum=a[i]+sum;
        }
        
        Arrays.sort(a);        
        
        int m=entrada.nextInt();
        //int []q= new int[m];
        
        for (int i = 0; i < m; i++) {
            int q=entrada.nextInt();
            long sum2=sum-a[n-q];
            System.out.println(sum2);
        }
       
        
        
        
        
    
    }*/
    
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            int n = Integer.parseInt(st.nextToken());
            int[]a= new int[n];
            long sum=0;
            System.out.println(n);
            
            for (int i = 0; i < n; i++){ 
                a[i]=Integer.parseInt(st.nextToken()); 
                
                //sum=a[i]+sum;
            }
            Arrays.sort(a); 
           System.out.println(Arrays.toString(a));
            
            /*int m=Integer.parseInt(st.nextToken());
            
            
            for (int i = 0; i < m; i++) {
                int q=Integer.parseInt(st.nextToken());
                long sum2=sum-a[n-q];
                System.out.println(sum2);
            }*/
            
            
        }
    
}
