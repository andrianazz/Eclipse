package Searching;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Array 
		System.out.println("Array Awal");
		int angka[] = {23,5,34,123,2,59,20};
		
		
		
		//Output nilai pada array
		for (int i = 0; i < angka.length; i++) {
			System.out.print(angka[i] + " ");
		}
		System.out.println("\n--------------------");
		
		//Urutkan array terlebih dahulu
		System.out.println("Array setelah diurutkan");
		for (int i = 0; i < angka.length; i++) {
			for (int j = 1+i; j < angka.length; j++) {
				if (angka[i] > angka[j]) {
					int tukar = angka[i];
					angka[i] = angka[j];
					angka[j] = tukar;
				}
			}
			System.out.print(angka[i] + " ");
		}
		System.out.println("\n-----------------------");
	}
}