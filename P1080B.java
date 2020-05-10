import java.util.Scanner;
public class P1080B {
    
    static int print(int x){
        if(x%2==0)return (x/2);
        else return(((print(x-1)-x)));   
    }
    
    public static void main(String[] args) { 
        
        Scanner entrada = new Scanner(System.in);
        int q=entrada.nextInt();
        int[] l=new int[q+1];
        int[] r=new int[q+1];
        
        for (int i = 1; i <=q; i++) {
            l[i]=entrada.nextInt();
            r[i]=entrada.nextInt();
        }
       
        for (int i = 1; i <=q; i++) System.out.println(print(r[i])-print(l[i]-1));

        
        
        
    
    }
}
