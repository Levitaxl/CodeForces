import java.util.Scanner;


public class P785A {
    
    public static void main(String[] args) {
    
      int total=0;
      Scanner s = new Scanner(System.in);
      int length = s.nextInt();
      String [] myArray = new String[length+1];

      for(int i=0; i<=length; i++ ) myArray[i] = s.nextLine();
     
      
       for(int i=1; i<=length; i++ ) {
        if("Tetrahedron".equals(myArray[i])) total=total+4;
        if("Cube".equals(myArray[i])) total=total+6    ;
        if("Octahedron".equals(myArray[i])) total=total+8;
        if("Dodecahedron".equals(myArray[i])) total=total=total+12;
        if("Icosahedron".equals(myArray[i]))total=total+20;
      }
      
        System.out.println(total);
      
    }
    
}