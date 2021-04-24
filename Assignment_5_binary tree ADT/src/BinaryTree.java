import java.util.Scanner;


// The node containing the left and right children
class Node<T>{
    T key;
    Node left, right;
 
    public Node(T item)
    {
        key = item;
        left = right = null;
    }
}
 
// A Java program to introduce Binary Tree
public class BinaryTree<E>{
    // Root of Binary Tree
    Node root;
 
    // Class Constructors
    BinaryTree(E key)
    {
        root = new Node(key);
        
    }
 
    BinaryTree()
    {
        root = null;
    }
    
    // Shows the root of tree
    public void  treeRoot() {
    	Node rt = root;
    	
    	if(rt == null) {
    		System.out.println("Tree has no root");
    		return;
    	}
    	
    	System.out.println("Root: "+root.key);
    }
    
    // Shows children and grandchildren of root of on the left
    public void rootChildrenAndGrandChildrenLeft() {
    	 Node n = root.left;
    	 
    	 if(n == null) {
       		 System.out.println("null");
       	 }
    	 
    	while (n != null) { 
    		System.out.println("     "+n.key);
            n = n.left; 
            
    	}
            
        } 
    	
 // Shows children and grandchildren of root of on the right
    	public void rootChildrenAndGrandChildrenRight() {
       	 Node n = root.right;
       	 if(n == null) {
       		 System.out.println("null");
       	 }
     	while (n != null) { 
     		System.out.println("     \t"+n.key);
             n = n.right; 
             
             
             
         } 
        
       
    	
    }
    	
    	// Application for binary tree
    	public static void filePath() {
    		
    		Scanner keyboard = new Scanner(System.in);
    		BinaryTree tree = new BinaryTree();
    		
    		//
    		tree.root = new Node("C:/");
    		
    		tree.root.left = new Node(" /Users");
    		
    		tree.root.left.left = new Node("/file.txt");
    		
    		tree.treeRoot();
    		tree.rootChildrenAndGrandChildrenLeft();
    	}
    	
 
    public static void main(String[] args)
    {
        filePath();
    }
}