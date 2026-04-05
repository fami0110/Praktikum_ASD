import java.util.Scanner;

public class MahasiswaDemo14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nim, nama, kelas;
		double ipk;

		MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14();

		System.out.println("SISTEM MANAJEMEN DATA MAHASISWA BERPRESTASI\n");
		for (int i = 0; i < list.listMhs.length; i++) {
			System.out.println("Masukkan data mahasiswa ke-"+(i+1));
			
			System.out.print("NIM	: ");
			nim = sc.nextLine();
			
			System.out.print("Nama	: ");
			nama = sc.nextLine();
			
			System.out.print("Kelas	: ");
			kelas = sc.nextLine();
			
			System.out.print("IPK	: ");
			ipk = sc.nextDouble();
			sc.nextLine();

			list.tambah(new Mahasiswa14(nim, nama, kelas, ipk));

			System.out.println("------------------");
		}

		System.out.println("Data mahasiswa sebelum sorting: ");
		list.tampil();

		System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
		list.bubbleSort();
		list.tampil();

		System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
		list.selectionSort();
		list.tampil();

		System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC): ");
		list.insertionSort();
		list.tampil();

		sc.close();
	}
}