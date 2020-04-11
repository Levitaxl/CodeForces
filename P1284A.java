import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class P1284A {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n=entrada.nextInt(), m=entrada.nextInt();
        
        System.out.println(n+"-"+m);
        String[] s1= new String[n],s2=new String[m];

        s1=entrada.nextLine().split(" ");
        s2=entrada.nextLine().split(" ");

        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
        /*int q= entrada.nextInt();
        int y[]=new int[q];
        
        
        for (int i = 0; i < q; i++) y[i]=entrada.nextInt();*/
        
        
        //for (int i = 0; i < q; i++) System.out.println((s1[y[i]-1]%n)+(s2[y[]]));

        
        
        
        
        
        
        
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder n=new StringBuilder(br.readLine()),m=new StringBuilder(br.readLine()) ;
        StringBuilder[] s1=new StringBuilder[Integer.parseInt(n.toString())], s2=new StringBuilder[Integer.parseInt(m.toString())];
        
        for(int i=0;i<Integer.parseInt(n.toString());i++) s1[i]=new StringBuilder(br.readLine());
        for(int i=0;i<Integer.parseInt(m.toString());i++) s2[i]=new StringBuilder(br.readLine());
        
        
        StringBuilder q=new StringBuilder(br.readLine());
        
        StringBuilder[] y = new StringBuilder[Integer.parseInt(q.toString())];
        for(int i=0;i<Integer.parseInt(q.toString());i++) y[i]=new StringBuilder(br.readLine());
        for(int i=0; i<Integer.parseInt(q.toString()); i++) System.out.println(s1[(Integer.parseInt(y[i].toString())-1)%Integer.parseInt(n.toString())].append(s2[(Integer.parseInt(y[i].toString())-1)%Integer.parseInt(m.toString())])); */
        
    }
}

