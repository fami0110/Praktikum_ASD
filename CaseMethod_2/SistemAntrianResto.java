import java.util.Scanner;

public class SistemAntrianResto {
	public static void banner() {
		System.out.println("\n=============================================");
		System.out.println("         SISTEM ANTREAN ROYAL DELISH         ");
		System.out.println("=============================================");
		System.out.println("1. Tambah Antrian");
		System.out.println("2. Cetak Antrian");
		System.out.println("3. Hapus Antrian dan Pesan");
		System.out.println("4. Laporan Pesanan");
		System.out.println("0. Keluar");
		System.out.print("> ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int option;

		DaftarAntrean A = new DaftarAntrean();
		DaftarPesanan P = new DaftarPesanan();
		
		do {
			banner();
			option = sc.nextInt(); sc.nextLine();
			System.out.println();

			switch (option) {
				case 1:
					System.out.print("Nama Pembeli : ");
					String namaPembeli = sc.nextLine();
					System.out.print("No HP        : ");
					String noHP = sc.nextLine();
					System.out.println();

					int nomor = A.tambahAntrian(new Pembeli(namaPembeli, noHP));
					
					System.out.println("[+] Antrean berhasil ditambahkan dengan nomor " + nomor);
					break;
				case 2:
					A.cetakAntrian();
					break;
				case 3:
					Pembeli pembeli = A.hapusAntrean();
					System.out.printf("\n[>] Melayani %s...\n", pembeli.namaPembeli);

					System.out.print("Kode Pesanan : ");
					int kodePesanan = sc.nextInt(); sc.nextLine();
					System.out.print("Nama Pesanan : ");
					String namaPesanan = sc.nextLine();
					System.out.print("Harga        : ");
					int harga = sc.nextInt(); sc.nextLine();

					P.tambahPesanan(new Pesanan(kodePesanan, namaPesanan, harga));
					System.out.printf("\n[+] %s telah memesan %s.\n", pembeli.namaPembeli, namaPesanan);
					break;
				case 4:
					P.laporanPesanan();
					break;
				case 0:
					System.out.println("[#] Keluar...");
					break;
				default:
					System.out.println("[#] Pilihan tidak valid!");
					break;
			}

		} while (option != 0);
		
		sc.close();
	}
}