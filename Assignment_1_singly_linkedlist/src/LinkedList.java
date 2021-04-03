

//Linked List Class


public class LinkedList { 
 Node head; // head of list 

 
 public static class Node { 
     int data; 
     Node next;
     
     Node(int d) 
     { 
         data = d; 
         next = null; 
     } 
 }
 
 
 
 
 


 // Inserting infront
 
 public void insertAtFront(int newData) {
	 
	 Node new_Data = new Node(newData);
	 new_Data.next = head;
	 head = new_Data;
 }
 
 
 
 
 // Inserting after
 
 public void insertAfter(Node prev_node, int new_data)  
 {  
     /* 1. Check if the given Node is null */
     if (prev_node == null)  
     {  
         System.out.println("The given previous node cannot be null");  
         return;  
     }  
   
     /* 2. Allocate the Node &  
     3. Put in the data*/
     Node new_node = new Node(new_data);  
   
     /* 4. Make next of new Node as next of prev_node */
     new_node.next = prev_node.next;  
   
     /* 5. make next of prev_node as new_node */
     prev_node.next = new_node;  
 }

 
 // Appending a node at the end
 
 public void insertAtEnd(int new_data) 
 { 
     /* 1. Allocate the Node & 
        2. Put in the data 
        3. Set next as null */
     Node new_node = new Node(new_data); 
   
     /* 4. If the Linked List is empty, then make the 
            new node as head */
     if (head == null) 
     { 
         head = new Node(new_data); 
         return; 
     } 
   
     /* 4. This new node is going to be the last node, so 
          make next of it as null */
     new_node.next = null; 
   
     /* 5. Else traverse till the last node */
     Node last = head;  
     while (last.next != null) 
         last = last.next; 
   
     /* 6. Change the next of last node */
     last.next = new_node; 
     return; 
 } 

 
 // Deleting a node iteratively
 
 public void deleteNodeIterative(int data)
 {
    
     Node temp = head, prev = null;

     
     if (temp != null && temp.data == data) {
         head = temp.next; // Changed head
         return;
     }

     
     while (temp != null && temp.data != data) {
         prev = temp;
         temp = temp.next;
     }

    
     if (temp == null)
         return;

     
     prev.next = temp.next;
 }

 
//Deleting a node recursively
 public Node deleteNodeRecursive(Node head, int postion) {
	 
	 
	    
	    if (postion < 1)  
	    return head;  
	  
	    
	    if (head == null)  
	    return null;  
	  
	    
	    if (postion == 1)  
	    {  
	        Node res = head.next;  
	        return res;  
	    }  
	      
	    head.next = deleteNodeRecursive(head.next, postion-1);  
	    return head;  

 }
 
// public void deleteNodeRecursive1(int data) {
//	 
//	 Node newNode = new Node(data);
//	  
//	 if(head == null) {
//		 
//		 return;
//	 }
//	  
//	 
//	 head = newNode.next;
//	 
// }
 
 
 
 public void printList() 
 { 
     Node n = head; 
     while (n != null) { 
         System.out.print(n.data + " "); 
         n = n.next; 
     } 
     
     System.out.println("");
 } 
 
 
 public void printListStructure() {
	 
	 Node n = head; 
     while (n != null) { 
         System.out.print("["+n.data + "][-->] "); 
         n = n.next; 
     }
     
     System.out.print("Null");
 }
 
 public static void main(String[] args) 
 { 
     /* Start with the empty list. */
     LinkedList llist = new LinkedList(); 

     llist.head = new Node(8); 
     Node second = new Node(10); 
     Node third = new Node(12); 
     Node fourth = new Node(16);
     Node fifth = new Node(9);
     Node sixth = new Node(14);
     
    
     
     

     llist.head.next = second; // Link first node with the second node 

    

     second.next = third; // Link second node with the third node 
     
     third.next = fourth;
     
     
     fourth.next = fifth;
     
     fifth.next = sixth;
     System.out.println("THE LINKED LIST");
     llist.printList();
     System.out.println("");
     
     
     //Assignment
     
     //Operation 1
     //Inserting 15 infront
     llist.insertAtFront(15);
     System.out.println("ADDING 15 AT THE FRONT OF LIST");
     llist.printList();
     System.out.println("");
     
     
     //Operation 2
     //Inserting 25 after node 16
     llist.insertAfter(fourth, 25);
     System.out.println("INSERTING 25 AFTER NODE 16");
     llist.printList();
     System.out.println("");
     
     
     //Operation 3
     //Deleting node 9
     System.out.println("DELETING NODE 9 USING RECURSIVE");
     llist.deleteNodeRecursive(llist.head, 7);
     llist.printList();
     System.out.println("");
     
    //Operation 4
    //Inserting node 30 after node 10
    llist.insertAfter(second, 30);
    System.out.println("INSERTING 30 AFTER 10");
    llist.printList();
    System.out.println("");
     
     //Operation 5
    // Inserting node 45 at the end
    llist.insertAtEnd(45);
    System.out.println("INSERTING 45 AT THE END OF LIST");
    llist.printList();
    System.out.println("");
    
    //Operation 6
    //Deleting node 8 after node 15 (Iterative method)
    llist.deleteNodeIterative(8);
    System.out.println("DELETING NODE 8 AFTER NODE 15");
    llist.printList();
    System.out.println("");
    
    llist.printListStructure();
         
 } 
} 
