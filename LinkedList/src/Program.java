
public class Program {
	public static void main(String[] args) {
		LinkedList x = new LinkedList();
		x.add(10);
		x.add(5);
		x.add(6);
		x.addLast(11);
		
		
		
		x.printNode();
		System.out.println();
		System.out.println("======================");
		x.delLast();
		x.del();
		x.printNode();
		
	}
}
