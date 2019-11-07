package Searching;

import java.util.Random;
import java.util.Scanner;

public class Sequential {
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	
	static int masukan() {	
		return scan.nextInt();
	}
	
	
	static void opening() {
		System.out.println("Selamat datang di aplikasi Array");
		System.out.println("Silahkan masukkan pilihan anda");
		System.out.println("1. Masukkan array sendiri");
		System.out.println("2. Random oleh program");
	}
	
	
	static void awal() {
		System.out.print("Banyak array yang dibuat = ");
	}
	
	
	static int[] isiSendiri(int angka[],int jumlah) {
		for (int i = 0; i < jumlah; i++) {
			System.out.println("Array " + i + " : ");
			angka[i] = scan.nextInt();
		}
		return angka;
	}
	
	
	static int[] random(int angka[],int jumlah) {
		for (int i = 0; i < jumlah; i++) {
			angka[i] = rand.nextInt(21);
			System.out.println("Array " + i + " : " + angka[i]);
		}
		return angka;
	}
	
	
	static void pencarian() {
		System.out.println("Masukkan angka yang ingin dicari = ");
	}
	
	
	static int mencari(int cari, int angka[],int jumlah) {
		int temu = 0;
		for (int i = 0; i < jumlah; i++) {
			if (cari == angka[i]) {
				temu = i;
			}
		}
		return temu;
	}
}