package inheritance;

public class Main {
	public static void main(String[] args) {
		
		//mebuat objek bangun datar
		BangunDatar mBangunDatar = new BangunDatar();
		
		//mebuat objek persegi dan nilai properti
		Persegi mPersegi = new Persegi();
		mPersegi.sisi = 2;
		
		//membuat objek lingkaran
		Lingkaran mLingkaran = new Lingkaran();
		mLingkaran.r = 22;
		
		//membuat objek Persegi panjang dan nilai properti
		PersegiPanjang mPersegiPanjang = new PersegiPanjang();
		mPersegiPanjang.panjang = 8;
		mPersegiPanjang.lebar = 4;
		
		//membuat objek segitiga dan jilai properti
		Segitiga mSegitiga = new Segitiga();
		mSegitiga.alas = 12;
		mSegitiga.tinggi = 8;
		
		//Memanggil method luas dan keliling
		mBangunDatar.luas();
		mBangunDatar.keliling();
		
		mPersegi.luas();
		mPersegi.keliling();
		
		mLingkaran.luas();
		mLingkaran.keliling();
		
		mPersegiPanjang.luas();
		mPersegiPanjang.keliling();
		
		mSegitiga.luas();
		
	}

}
