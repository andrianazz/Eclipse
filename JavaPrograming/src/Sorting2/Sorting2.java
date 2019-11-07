package Sorting2;

public class Sorting2 {
	public static void main(String[] args) {
		int angka[] = {12,23,11,26,76};
		
		int max[] = new int[angka.length];
		
		
		
		for (int i = 1; i < angka.length; i++) {
			if (angka[i] > max[i-1]) {
				max[i] = angka[i];
			}
		}
		
		for (int i = 0; i < angka.length; i++) {
			System.out.println(max[i] + " ");
		}
		
		
		
	}
}
