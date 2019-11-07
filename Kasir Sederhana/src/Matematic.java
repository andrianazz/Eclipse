import java.sql.BatchUpdateException;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Matematic {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("|--------------------------------------|");
		System.out.println("| Selamat datang di Program Matematika |");
		System.out.println("|      Silahkan Pilih operasi anda     |");
		System.out.println("|--------------------------------------|");
		System.out.println("|    Persegi        Persegi Panjang    |");
		System.out.println("|    Lingkaran      Segitiga           |");
		System.out.println("|--------------------------------------|");
		System.out.println();
		
		batas();
		System.out.println("Masukkan Pilihan");
		String pilih = input.nextLine();
		batas();
		
		switch (pilih) {
		case "Persegi":
			
			System.out.println("Luas atau Keliling?");
			String pilih2 = input.nextLine();
			int panjang,lebar, luas, keliling;
			batas();
			switch (pilih2) {
			case "Luas":
				System.out.print("Masukkan Panjang = ");
				panjang = input.nextInt();
				System.out.print("Masukkan Lebar = ");
				lebar = input.nextInt();
				luas = panjang * lebar;
				System.out.println("Luas = " + luas );
				batas();
				break;
			case "Keliling":
				System.out.print("Masukkan Panjang = ");
				panjang = input.nextInt();
				System.out.print("Masukkan Lebar = ");
				lebar = input.nextInt();
				keliling = 2*panjang + 2*lebar;
				System.out.println("Keliling = " + keliling);
				break;
			default:break;
			}
			break;
		case "Persegi Panjang": 
			
			break;
		case "Lingkaran": break;
		case "Segitiga": break;

		default:break;
		
	
		}
	}
	
	static void batas() {
		System.out.println("-----------------------------");
	}
}
