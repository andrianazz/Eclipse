import java.util.Scanner;

//Rekursif adalah konsep untuk mengulangi perintah dirinya sendiri agar dapat digunakan lebi mudah

public class Cobarekursif {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan Kata Yang ingin di proses = ");
		String kata = scan.nextLine();
		System.out.println("Dikonversi menjadi = ");
		
		cetak(kata);
	}
	
	public static void cetak(String text) {
		
		int x = text.length();
		x--;
		
		if (x>=0) {
			System.out.print(text.substring(x));
			cetak(text.substring(0,x));
		}
	}

}
