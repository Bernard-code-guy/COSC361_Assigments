## SINGLY LINKED LIST PROGRAM DOCUMENTATION

**LinkedList Class**

**head** variable is the HEAD of the linked list

~~~java

Node head;
~~~


**An inner class**
~~~
    a static void class which holds the data of Linked List
~~~

~~~Java
    int data; 
     Node next;
     
     Node(int d) 
     { 
         data = d; 
         next = null; 
     } 

~~~

**Inserting at the front of the node (i.e head)**

*Method Accepts data and pass it to the front of node*


~~~Java
    Node new_Data = new Node(newData);
	new_Data.next = head;
    head = new_Data;
~~~

**Inserting after places a node after specified location**

*Parameter **prev_node** accepts location to be inserted after whiles parameter **data** accepts data to be inserted*

~~~java

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
~~~

## Other methods include 
* insertAfter(Node prev_node, int new_data) *This inserts a node a specified location*
* insertAtEnd(int new_data) *This inserts a node at the end*
* deleteNodeIterative(int data) *Delete a node using the iterative method*
* deleteNodeRecursive(Node head, int postion) *Delete a node using the recursive method*
* printList() *Prints the list*
* printListStructure() *Prints the list in a structure form*


## Inside Main Method including the assignment given on singly linked list
~~~java

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


~~~


