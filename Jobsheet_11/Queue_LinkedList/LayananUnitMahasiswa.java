import java.util.Scanner;

public class LayananUnitMahasiswa {
	public static void banner() {
		System.out.println("\n==== Menu Layanan Unit Mahasiswa ====");
		System.out.println("1. Tambah Mahasiswa ke Antrian");
		System.out.println("2. Panggil Antrian");
		System.out.println("3. Tampilkan Antrian Paling Depan");
		System.out.println("4. Tampilkan Antrian Paling Belakang");
		System.out.println("5. Tampilkan Daftar Antrian");
		System.out.println("6. Jumlah Antrian Saat Ini");
		System.out.println("7. Kosongkan Antrian");
		System.out.println("0. Keluar");
		System.out.println("====================================");
		System.out.print("> ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan maksimal jumlah antrian: ");
		int max = sc.nextInt();
		sc.nextLine();

		AntrianMahasiswa antrian = new AntrianMahasiswa(max);
		int opt;

		do {
			banner();
			opt = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (opt) {
				case 1:
					System.out.print("NIM   : ");
					String nim = sc.nextLine();
					System.out.print("Nama  : ");
					String nama = sc.nextLine();
					System.out.print("Prodi : ");
					String prodi = sc.nextLine();
					System.out.print("UKM   : ");
					String ukm = sc.nextLine();
					antrian.tambahAntrian(new Mahasiswa(nim, nama, prodi, ukm));
					break;
				case 2:
					antrian.panggilAntrian();
					break;
				case 3:
					antrian.lihatDepan();
					break;
				case 4:
					antrian.lihatBelakang();
					break;
				case 5:
					antrian.tampilkanAntrian();
					break;
				case 6:
					System.out.println("Jumlah dalam antrian: " + antrian.jumlahAntrian());
					break;
				case 7:
					antrian.kosongkanAntrian();
					break;
				case 0:
					System.out.println("Keluar...");
					break;
				default:
					System.out.println("[!] Pilihan tidak valid!");
					break;
			}
		} while (opt != 0);

		sc.close();
	}
}
