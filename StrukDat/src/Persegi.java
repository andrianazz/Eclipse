
public class Persegi {
	double sisi;
	double luas;
	double keliling;

	
	public Persegi(int sisi) {
		this.sisi = sisi;
		luas();
		keliling();
		
	}
	
	public double luas() {
		luas = sisi*sisi;
		return luas;
	}
	
	public double keliling() {
		keliling = 4*sisi;
		return keliling;
				
	}
	
}
