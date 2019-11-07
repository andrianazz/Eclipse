
public class Mahasiswa {
	public String nama;
	public String NIM;
	public int Nilai;

	Mahasiswa(String nama,String NIM,int Nilai){
		this.nama = nama;
		this.NIM = NIM;
		this.Nilai = Nilai;
	}
	
	Mahasiswa(){
		System.out.println("Nama Mahasiswa = "+ nama);
	}
	
	void cetak() {
		System.out.println("Nama = " + nama);
		System.out.println("NIM = " + NIM);
		System.out.println("Nilai = " + Nilai);
		System.out.println("\n");
		
	}
	
}
