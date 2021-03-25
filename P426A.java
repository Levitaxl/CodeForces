
import java.util.Arrays;
import java.util.Scanner;
public class P426A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n=entrada.nextInt(),s=entrada.nextInt();
        int[] a=new int[n];
        int sum=0;
         
         
        for (int i = 0; i < n; i++)a[i]=entrada.nextInt();
        Arrays.sort(a);        
        
        for (int i = 0; i < n; i++){sum+=a[i];}
        
        if(sum-a[n-1]<=s) System.out.println("YES");
        else System.out.println("NO");
         
    }
    
}
