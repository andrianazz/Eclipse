
public class Rekursif {
	
	public static double luas(double p, double l) {
		return p* l ;
	}
	public static void main(String[] args) {
		System.out.println("Luas = " + luas(12, 8));
		System.out.println(contoh(99));
	}
	
	public static double contoh(int x) {
		x++;
		if (x>=100) {
			return x;
		} else {
			contoh(x);
		}
		return contoh(x);
	}
}
