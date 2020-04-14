
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

/*
10
12
sin
im
gye
gap
eul
byeong
jeong
mu
gi
gyeong
yu
sul
hae
ja
chuk
in
myo
jin
sa
o
mi
sin
14
1
2
3
4
10
11
12
13
73
2016
2017
2018
2019
2020


*/
/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()), m=Integer.parseInt(br.readLine());  
        StringBuilder[] s1=new StringBuilder[n], s2=new StringBuilder[m];
        
        for(int i=0;i<n;i++) s1[i]=new StringBuilder(br.readLine());
        for(int i=0;i<m;i++) s2[i]=new StringBuilder(br.readLine());
        
        int q=Integer.parseInt(br.readLine());
        
        int[] y = new int[q];
      
        for(int i=0; i<q; i++ )y[i]=Integer.parseInt(br.readLine());
        for(int i=0; i<q; i++) System.out.println(s1[(y[i]-1)%n].append(s2[(y[i]-1)%m])); 

*/
