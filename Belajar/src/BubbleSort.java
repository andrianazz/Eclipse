

public class BubbleSort {
	public static void main(String[] args) {
		
	int angka[] = { 12,23,43,5,3,1};
	
	for (int x = 0; x < angka.length-1; x++) {
		for (int i = 0; i < angka.length-1-x; i++) {
			if(angka[i] > angka[i+1]) {
				int tukar = angka[i];
				angka[i] = angka[i+1];
				angka[i+1] = tukar;
			}
		}
	}
	
	for (int i = 0; i < angka.length; i++) {
		System.out.print(angka[i] + " ");
	}
	}	
}

