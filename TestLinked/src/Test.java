
public class Test {
	public static void main(String[] args) {
		Node a = new Node();
		Node b = new Node();
		
		a.setValue(8);
		b.setValue(10);
		
		a.setNext(b);
		System.out.println(a.getValue() +" "+a.getNext());
		
		
	}
}
