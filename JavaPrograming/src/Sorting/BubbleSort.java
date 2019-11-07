package Sorting;

public class BubbleSort {
 public static void main(String[] args) {
	int angka[] = {12,2,1,5,34,22};
	
	System.out.println("Angka sebelum disorting = ");
	for (int i = 0; i < angka.length; i++) {
		System.out.print(angka[i] + " ");
	}
	

	 for (int i = 0; i < angka.length; i++) {
			for (int j = 1+i; j < angka.length; j++) {
				if (angka[i] > angka[j]) {
					int tukar = angka[i];
					angka[i] = angka[j];
					angka[j] = tukar;
				}  
			}
 }
	 
	  
	 System.out.println("Angka sesudah disorting = ");
		for (int i = 0; i < angka.length; i++) {
			System.out.print(angka[i] + " ");
		}
} 
}