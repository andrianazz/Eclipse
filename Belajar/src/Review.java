
public class Review {



	public static void main(String[] args) {
		
		Mahasiswa data[] = {
		new Mahasiswa("Citra", "023", 78),
		new Mahasiswa("Widya", "791", 61),
		new Mahasiswa("Zainal"," 820", 87),
		new Mahasiswa("Eka","304",90),
		new Mahasiswa("Budi", "211", 69)
		};
		
	
//		for (int i = 0; i < data.length; i++) {
//			System.out.println("Nama = "+ data[i].nama);
//			System.out.println("NIM = "+ data[i].NIM);
//			System.out.println("Nilai = "+ data[i].Nilai);
//			System.out.println();
//		}
		
		
		for (int i = 0; i < data.length-1; i++) {
			for (int j = 0; j < data.length-1; j++) {
				if (data[j].nama.compareTo(data[j+1].nama)>0) {
					Mahasiswa temp = data[j];  
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			data[i].cetak();
		}
		
	}
}


