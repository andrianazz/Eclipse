package dasar;

public class Game {

public static void main(String[] args) {

	Drone mDrone = new Drone();
	
	mDrone.energi= 15;
	
	mDrone.terbang();
	mDrone.maju();
	mDrone.maju();
	
	System.out.println(mDrone.kecepatan);
	
	}
}
