
public class TestQueue {
	public static void main(String[] args) {
		Queue x = new Queue(5);
		x.enqueue(5);
		x.enqueue(7);
		x.enqueue(12);
		x.enqueue(25);
		
		System.out.println(x.dequeue());


	}
	
	
	
}
