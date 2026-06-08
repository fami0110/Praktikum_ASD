import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo14 {
	public static void main(String[] args) {
		ArrayList<String> daftarSiswa = new ArrayList<>();
		daftarSiswa.add("Zainab");
		daftarSiswa.add("Andi");
		daftarSiswa.add("Rara");

		System.out.println("Sebelum sort:");
		System.out.println(daftarSiswa);
		
		Collections.sort(daftarSiswa);
		
		System.out.println("\nSetelah sort:");
		System.out.println(daftarSiswa);
	}
}
