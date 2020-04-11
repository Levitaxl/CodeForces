import java.util.Scanner;

public class P1284A {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] s= new String[1];
        int n,m;
        
        s=entrada.nextLine().split(" ");
        n=Integer.parseInt(s[0]);
        m=Integer.parseInt(s[1]);
        
        String[] s1= new String[n],s2=new String[m];
        
        s1=entrada.nextLine().split(" ");
        s2=entrada.nextLine().split(" ");
        
        int q= entrada.nextInt();
        int y[]=new int[q];
        
        for (int i = 0; i < q; i++) y[i]=entrada.nextInt();
        
        for(int i=0; i<q; i++) System.out.println(s1[((y[i]-1)%n)]+s2[(y[i]-1)%m]); 

    }
}

