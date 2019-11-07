
public class Test {
	public static void main(String[] args) {
		
		
		Node a = new Node();
		Node b = new Node();
		Node c = new Node();
		
		a.setValue(8);
		b.setValue(10);
		c.setValue(12);
		
		a.setNext(b);
		b.setNext(c);
		
		
		System.out.println(a.getValue() +" "+a.getNext().getValue() +" "+ a.getNext().getNext().getValue());
		
		
	}
}
