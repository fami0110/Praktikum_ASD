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

		System.out.println("Pencarian data");
		System.out.println("------------------");
		System.out.println("masukkan ipk mahasiswa yang dicari: ");
		System.out.print("IPK: ");
		double cari = sc.nextDouble();

		System.out.println("menggunakan sequential searching");
		double posisi = list.sequentialSearching(cari);
		int pss = (int) posisi;
		list.tampilPosisi(cari, pss);
		list.tampilDataSearch(cari, pss);

		sc.close();
	}
}