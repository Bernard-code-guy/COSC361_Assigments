import java.util.Scanner;

public class QueueApp <T>{

	

		
		int num = 3;
		
		for(int i = 0; i < num; i++) {
			System.out.print("Enter data "+(i+1)+": ");
			String content = keyboard.next();
			q.enqueue(content);
			keyboard.nextLine();
			
		}
		
		q.printQueue();
	
	}
	
}

	