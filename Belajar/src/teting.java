import java.util.Scanner;

public class teting {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("Masukkan Pasword");
			
			int input = scan.nextInt();
			
			int angka = 1 ;
			if (input == angka ) {
				System.out.println("Bagus");
			} else {
				System.out.println("Salah");
			}
		} catch (Exception e) {
			System.out.println("Harus Angka");		}
		
		
		
		
	}
}
