package Searching;

import javax.sql.rowset.CachedRowSet;

public class Binary {
	public static void main(String[] args) {
	int nilai[] = {1,2,3,4,5,6,7};

	
	int cari =7;
	int a = Binary(nilai,cari);
	System.out.println("Angka "+ cari+ " ada di index " + a);
	
	}

	
	static int Binary(int nilai[],int cari) {
	int left = 0;
	int right = nilai.length-1;
	
	while (left <= right) {
		int mid = (left+right)/2;
		if (nilai[mid] == cari ) {
			return mid;
		} else if (nilai[mid] < cari) {
			left = mid+1;
		}else {
			right = mid-1;
		}
	}
	return 0;
	}
	
	
}
