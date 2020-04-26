
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
         System.out.println(Arrays.toString(a));
         
         for (int i = 0; i < n-1; i++) sum-=a[i];
         
         
         System.out.println(sum);
         if(sum>=0 )System.out.println("NO");
         else System.out.println("YES");
         
         
    }
    
}
