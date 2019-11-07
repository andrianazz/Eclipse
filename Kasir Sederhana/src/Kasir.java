import java.util.Scanner;

public class Kasir {
	public static void main(String[] args) {
		
		//List Harga
		opening();
		
		//Pembelian
		System.out.println("Apa saja yang ingin dibeli?");
		
		//Array pembelian
		String barang[] = new String[3];
		int jumlah[] = new int[3];
		for (int i = 0; i < barang.length; i++) {
			System.out.print("Nama Barang = " );
			String a[] = inputBarang().split(" ");
			barang[i] = a[0];
			jumlah[i] = Integer.parseInt(a[1]);
		}
		
		//Mencetak Harga pembelian
		batas();
		for (int i = 0; i < barang.length; i++) {
			System.out.println("Harga " + barang[i]+ "\t= " + Uang(barang[i]) + " x " + jumlah[i] + " = " + jumlah[i]*Uang(barang[i]));
		}
		batas();
		
		//Total Pembelian
		int total = Uang(barang[0]) * jumlah[0]+Uang(barang[1]) * jumlah[1];
		System.out.println("Total harga = " + total);
		batas();
		
		System.out.print("Masukkan Uang Anda = Rp.");
		int uang = inputUang();
		int kembalian = uang - total;
		batas();
		
		System.out.println("Uang Kembali = " + kembalian);
		batas();
		
		batas();
		System.out.println("Terima Kasih");
		batas();
	}
	
	
	 //Method Scanner
	  static String inputBarang() {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
	 
	  static int inputUang() {
			Scanner scan = new Scanner(System.in);
			return scan.nextInt();
		}
	 
	 
	 //Method list barang
	 static void opening() {
		System.out.println("|--------------------------------|");
		System.out.println("| Selamat datang di Toko Sembako |");
		System.out.println("|--------------------------------|");
		System.out.println("| Beras         : Rp. 11.000     |");
		System.out.println("| Gula          : Rp. 12.000     |");
		System.out.println("| Minyak        : Rp. 6.000      |");
		System.out.println("| Garam         : Rp. 3.000      |");
		System.out.println("| Mentega       : Rp. 4.000      |");
		System.out.println("|--------------------------------|");
	 }
	 
	 
	 //Method List masukkan harga
	 static int Uang(String rp) {
		int harga = 0 ;
		switch (rp) {
		case "Beras": harga = 11000;break;
		case "Gula": harga = 12000;break;
		case "Minyak": harga = 6000;break;
		case "Garam": harga = 3000;break;
		case "Mentega": harga = 4000;break;
		default: System.out.println("Maaf silahkan masukan lagi");break;
		}
		return harga;
	 }
	 
	 static void batas() {
		 System.out.println("------------------------------------");
	 }
	 
	 
}
