import java.util.Scanner;

public class KasirEasy {
	public static void main(String[] args) {
		
	int nilai[] = new int[3];
	for (int i = 0; i < nilai.length; i++) {
	System.out.println("Masukkan nilai orang ke -" + i);
	nilai[i] = inputan();
	}
	
	for (int i = 0; i < nilai.length; i++) {
		Jurusan(nilai[i]) ;
	}
		
		
		
		
	}
	
	static void cetak() {
		System.out.println("Menjalankan Method");
	}
	
	static int LuasPersegi(int panjang , int lebar) {
		int luas = panjang * lebar;
		System.out.println("Luas = " + luas);
		return luas;
	}
	
	static int inputan() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	static String Jurusan(int nilai) {
		String pilihan = "";
		switch (nilai) {
		case 1:
			pilihan = "Mastematika";
			break;
		case 2:
			pilihan = "Teknik Informatika";
			break;
		case 3:
			pilihan = "Elektro";
		default:
			break;
			
		}
		System.out.println("Pilihan = " + pilihan );
		return pilihan;
		
	}
	
}
