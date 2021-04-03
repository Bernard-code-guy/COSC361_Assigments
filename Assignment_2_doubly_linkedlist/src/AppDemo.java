
public class AppDemo {

	public static void main(String[] args) {
		/* Start with the empty list */
        DoublyLinkedList dll = new DoublyLinkedList();
 
        
       
 
        
        dll.insertAtFront("Mr. Isaac");
 
        
        dll.insertAfter(dll.head,"Mr. Billy");
 
        
        dll.insertAfter(dll.head.next, "Mr. Michael");
 
       
        dll.insertAfter(dll.head.next.next, "Mr. Samuel");
 
        
        dll.insertAtEnd("Mr. Bernard");
        
        
        
        dll.printlist(dll.head);
	}

}
