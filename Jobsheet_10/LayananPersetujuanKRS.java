import java.util.Scanner;

public class LayananPersetujuanKRS {
	public static void banner(AntrianKRS14 antrian) {
		int belum = antrian.getYangBelumDiproses();
		int sudah = antrian.getYangSudahDiproses();
		int target = antrian.target;

		System.out.println("\n=== Menu Antrian Layanan KRS ===");
		System.out.println("Dosen    : " + antrian.subject);
		System.out.printf("Progress : %.0f%% (%d/%d)\n", 
			(((double)sudah/target) * 100),
			sudah,
			target
		);
		System.out.println("1. Tambah Mahasiswa ke Antrian");
		System.out.println("2. Memanggil Antrian (2 Antrian)");
		System.out.println("3. Lihat 2 Antrian Terdepan");
		System.out.println("4. Lihat Antrian Terakhir");
		System.out.println("5. Lihat Semua Antrian");
		System.out.println("6. Cetak Jumlah Antrian");
		System.out.println("7. Cetak Jumlah yang SUDAH melakukan proses KRS");
		System.out.println("8. Cetak Jumlah yang BELUM melakukan proses KRS");
		System.out.println("0. Keluar");
		System.out.print("Pilih menu: ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nama Dosen: ");
		String namaDosen = sc.nextLine();
		
		AntrianKRS14 antrian = new AntrianKRS14(10, 30, namaDosen);
		
		int pilihan;
		do {
			banner(antrian);
			pilihan = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (pilihan) {
				case 1:
					System.out.print("NIM   : ");
					String nim = sc.nextLine();
					System.out.print("Nama  : ");
					String nama = sc.nextLine();
					System.out.print("Prodi : ");
					String prodi = sc.nextLine();
					System.out.print("Kelas : ");
					String kelas = sc.nextLine();
					Mahasiswa14 mhs = new Mahasiswa14(nim, nama, prodi, kelas);
					antrian.tambahAntrian(mhs);
					break;
				case 2:
					int dilayani = antrian.memanggilAntrian();
					break;
				case 3:
					antrian.lihat2Terdepan();
					break;
				case 4:
					antrian.lihatAkhir();
					break;
				case 5:
					antrian.lihatSemua();
					break;
				case 6:
					System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
					break;
				case 7:
					System.out.println("Mahasiswa yang sudah: " + antrian.getYangSudahDiproses());
					break;
				case 8:
					System.out.println("Mahasiswa yang belum: " + antrian.getYangBelumDiproses());
					break;
				case 0:
					System.out.println("Keluar...");
					break;
				default:
					System.out.println("Pilihan tidak valid.");
			}

		} while (pilihan != 0);

		sc.close();
	}
}
