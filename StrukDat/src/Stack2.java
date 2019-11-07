
public class Stack2 {
	
	private String data[];
	private int top;
	
	public Stack2(int jumlah) {
		data = new String[jumlah];
		top = -1;
	}
	
	public void push(String nilai) {
		if (top < data.length-1) {
			data[++top] = nilai;
		}
	}
	
	public String pop() {
		if (top >= 0 ) {
			String temp = data[top--];
			return temp;
		}
		return "";
	}
	
	public void print() {
		for (int i = data.length-1; i >= 0 ; i--) {
			System.out.println(data[i]);
		}
	}
}
