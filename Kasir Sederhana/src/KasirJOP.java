import javax.swing.JOptionPane;

public class KasirJOP {
	public static void main(String[] args) {
		opening();
		
		String barang = JOptionPane.showInputDialog(null,"Apa yang ingin dibeli?");
		
		int total = Uang(barang);
		int uang = Integer.parseInt(JOptionPane.showInputDialog("Total = " + total + "\n"+ "\n" +
		"Masukkan Uang Anda "));
		
		int kembalian = uang - total;
		JOptionPane.showMessageDialog(null, "Uang kembali = " + kembalian);
		JOptionPane.showMessageDialog(null, "Terima kasih");
		
		
	}
	
	static void opening() {
		JOptionPane.showMessageDialog(null, 
				" Toko Sembako  " + "\n" + "\n" + 
				" Beras      : Rp. 11.000 " + "\n" +
				" Gula        : Rp. 12.000 " + "\n" +
				" Minyak    : Rp. 6.000 " + "\n" +
				" Garam     : Rp. 3.000 " + "\n" +
				" Mentega  : Rp. 4.000 " );
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
	
}
