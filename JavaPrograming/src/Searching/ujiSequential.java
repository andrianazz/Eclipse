package Searching;

public class ujiSequential {
public static void main(String[] args) {
		Sequential x = new Sequential();
		x.awal();
		
		int jumlah = x.masukan();
		int angka[] = new int[jumlah];
		
		x.opening();
		int pilih1 = x.masukan();
		
		switch (pilih1) {
		case 1:
			x.isiSendiri(angka, jumlah);
			break;
		case 2:
			x.random(angka, jumlah);
			break;
		default:
			break;
		}
		
		x.pencarian();
		int cari = x.masukan();
		
		System.out.println("Angka ada di index "+ x.mencari(cari, angka, jumlah));
		
		int max = angka[0];
		for (int i = 0; i <jumlah; i++) {
			if (angka[i]>angka[0]) {
				max = angka[i];
			}
		}
		
		System.out.println("Angka tertinggi adalah = " + max);
		
		
	}
}
