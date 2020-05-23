
import java.util.Scanner;

public class P115A {
    
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    P115A() {  
        root = null;  
    } 
  
    // This method mainly calls insertRec() 
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void inorder()  { 
    
       inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
    
    Node search(Node root, int key) 
    { 
    // Base Cases: root is null or key is present at root 
    if (root==null || root.key==key) 
        return root; 
  
    // val is greater than root's key 
    if (root.key > key) 
        return search(root.left, key); 
  
    // val is less than root's key 
    return search(root.right, key); 
} 

    void countAllNodes(){
        System.out.println(countAllNodesRec(root));
    } 
    
    
     int countAllNodesRec(Node root){
         int count=1;
         
         if(root.left!=null)count+=countAllNodesRec(root.left);
         if(root.right!=null) count+=countAllNodesRec(root.right);
         return count;
     }
    
    
    
    public static void main (String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int n=entrada.nextInt();
        int []x= new int[n];
        P115A tree = new P115A(); 
        
        for (int i = 0; i < n; i++){
            //tree.insert(entrada.nextInt());
            x[i]=entrada.nextInt();
        }
        
        int cont=1;
        for (int i = 1; i < n; i++) {
            if(x[i]==-1){
                
                break;
            }
            
            else if (i==n-1){
                break;
            }
                else cont++;
            
        }
        
        System.out.println(cont);
        /*System.out.println("////////////");
        tree.inorder();
        System.out.println("////////////");
        
        tree.countAllNodes();*/
    
    }
    
}
