import java.util.Scanner;

public class Cara {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukkan Panjang");
		int panjang = scan.nextInt();
		System.out.println("Masukkan Lebar");
		int lebar = scan.nextInt();
		
		int Luas = panjang * lebar;
		
		System.out.println("Luas = " + Luas);
		
	}

	static int input(String nama) {
		Scanner scan = new Scanner(System.in);
		System.out.println(nama + " = ");
		return scan.nextInt();
	}
}
