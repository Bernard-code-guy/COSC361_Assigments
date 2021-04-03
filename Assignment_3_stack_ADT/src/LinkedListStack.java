
public class LinkedListStack <E> implements Stack <E>{
	
	
	StackNode root;
	 
	
    class StackNode {
       E data;
       StackNode next;

       StackNode(E data) { 
       	this.data = data; 
       	}
   }


	@Override
	public void push(E data) {
		StackNode newNode = new StackNode(data);
		 
        if (root == null) {
            root = newNode;
        }
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
		
	}


	@Override
	public E pop() {
		E popped = null; 
        if (root == null) {
            System.out.println("Stack is Empty");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
	}


	@Override
	public E top() {
		if (root == null) {
            System.out.println("Stack is Empty");
            return null;
        }
        else {
            return root.data;
        }
	}


	@Override
	public boolean isEmpty() {
		if (root == null) {
            return true;
        }
        else
            return false;
	}


	@Override
	public int size() {
		StackNode n = root;
    	int i = 0;
    	while(n != null) {
    		i = i + 1;
    		n = n.next;
    	}
    	
    	return i;
	}
	
	/*
	  public void printList() 
	    { 
	    	StackNode n = root; 
	        while (n != null) { 
	            System.out.print(n.data + " "); 
	            n = n.next; 
	        } 
	        
	        System.out.println("");
	    } 
	    */
	    
	    /*
	    public void printListStructure() 
	    { 
	    	StackNode n = root; 
	    	System.out.println("STACK");
	    	System.out.println("*****");
	        while (n != null) { 
	            System.out.println("["+n.data + "]"); 
	            n = n.next; 
	        } 
	        
	        System.out.println("");
	    }
		*/

		@Override
		public void printStackData() {
			StackNode n = root; 
	        while (n != null) { 
	            System.out.print(n.data + " "); 
	            n = n.next; 
	        } 
	        
	        System.out.println("");
			
		}


		@Override
		public void printStackDataStructure() {
			StackNode n = root; 
	    	System.out.println("STACK");
	    	System.out.println("*****");
	        while (n != null) { 
	            System.out.println("["+n.data + "]"); 
	            n = n.next; 
	        } 
	        
	        System.out.println("");
			
		} 
	

}
