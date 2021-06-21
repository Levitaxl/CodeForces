import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author levitaxl
 */
public class P672B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        String s=in.next();
        
        // Create an empty Hashtable
        Hashtable<Character, Integer> ht = new Hashtable<>();
  
        int cont=0;
        for (int i = 0; i <n; i++) {
            if (!ht.containsKey(s.charAt(i))) ht.put(s.charAt(i), -1);
            else cont++;     
        }   
        
        if (cont<26 && n<27) System.out.println(cont);
        else System.out.println(-1);
    }
}

