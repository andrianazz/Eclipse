
public class LinkedList {
	private Node head, tail ;
	
	public LinkedList() {
		head = null;
	}
	
	public void add(int d) {
		Node baru = new Node(d);
		if (head == null) {
			head = baru;
			tail = baru;
		} else {
			baru.next=head;
			head = baru;
		}
	}
	
	public void addLast(int d) {
		Node baru = new Node(d);
		if(head == null) {
			head = baru;
			tail = baru;
		} else {
			tail.next = baru;
			tail = baru;
		}
	}
	
	public Node del() {
		if(head!=null) {
			Node temp =head;
			head = head.next;
			temp.next =null;
			return temp;
		} else {
			System.out.println("List Kosong");
			return null;
		}
	}
	
	public Node delLast() {
		if(head!=null) {
			Node bantu, temp;
			if(head.next==null) {
				temp=head;
				head= tail = null;
			} else {
				bantu = head;
				while(bantu.next!=tail) {
					bantu = bantu.next;
				}
				temp = tail;
				tail = bantu;
				tail.next = null;
			}
			return temp;
		} else {
			System.out.println("List Kosong");
			return null;
		}
	}
	
	void printNode(){
  		Node temp;
  		temp = head;
  		while (temp != null){
   			System.out.print(temp.data + " ");
   			temp = temp.next;
  		}
  		
	}
}
