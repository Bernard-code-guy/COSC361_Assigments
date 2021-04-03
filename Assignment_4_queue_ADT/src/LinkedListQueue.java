
// Java program for linked-list implementation of queue 
  
// A linked list (LL) node to store a queue entry 
public class LinkedListQueue <T>{ 
    T data; 
    LinkedListQueue next; 
  
    // constructor to create a new linked list node 
    public LinkedListQueue(T data) 
    { 
        this.data = data; 
        this.next = null; 
    } 
} 
  
// A class to represent a queue 
// The queue, front stores the front node of LL and rear stores the 
// last node of LL 
class Queue <T>{ 
    LinkedListQueue front, rear; 
  
    public Queue() 
    { 
        this.front = this.rear = null; 
    } 
  
    // Method to add an key to the queue. 
    void enqueue(T data) 
    { 
  
        // Create a new LL node 
        LinkedListQueue temp = new LinkedListQueue(data); 
  
        // If queue is empty, then new node is front and rear both 
        if (this.rear == null) { 
            this.front = this.rear = temp; 
            return; 
        } 
  
        // Add the new node at the end of queue and change rear 
        this.rear.next = temp; 
        this.rear = temp; 
    } 
  
    // Method to remove an key from queue. 
    void dequeue() 
    { 
        // If queue is empty, return NULL. 
        if (this.front == null) 
            return; 
  
        // Store previous front and move front one node ahead 
        LinkedListQueue temp = this.front; 
        this.front = this.front.next; 
  
        // If front becomes NULL, then change rear also as NULL 
        if (this.front == null) 
            this.rear = null; 
    } 
    
    
    // Displays all elements in the queue
    public void printQueue() {
    	
    	if(this.front == null) {	
    		System.out.println("Queue Empty!!");
    		return;
    	}
    	
    	while(this.front != null) {
    		System.out.print("("+this.front.data+ ") ");
    		this.front = this.front.next;
    	}
    }
    
    
    // Method to Check if there is no queue in the structure
    public boolean isEmpty() {
    	
    	if(this.front == null) {
    		return true;
    	}else {
    		return false;
    	}
    	
   }
    
    
    // Method to return the first element in the queue
    public T first() {
    	
    	T firstData = (T) this.front.data;
    	
    	return firstData;
    	
    }
    
    // Method return the size of the queue data structure
    public int size() {
    	
    	int i = 0;
    	
    	while(this.front != null) {
    		i = i+1;
    		this.front = this.front.next; 
    	}
    	
    	return i;
    	
    }
    
    
} 
  

