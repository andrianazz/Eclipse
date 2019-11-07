
public class Stack1 {
	
	private int data[];
	private int top;
	
	public Stack1(int jumlah) {
		data = new int[jumlah];
		top = -1;
	}
	
	public void push(int nilai) {
		if (top < data.length-1) {
			data[++top] = nilai;
			
		}
	}
	
	public int pop() {
		if (top >= 0 ) {
			int temp = data[top--];
			return temp;
		}
		return 0;
	}
	
	public void print() {
		for (int i = data.length-1; i >= 0 ; i--) {
			System.out.println(data[i]);
		}
	}
}
