import java.util.Scanner;

public class PeminjamanDemo {

    static void banner() {
        System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("6. Tambah Data Peminjaman");
        System.out.println("7. Tampil Data Statistik");
        System.out.println("8. Tampil Laporan per Mahasiswa");
        System.out.println("0. Keluar");
    }

    public static void main(String[] args) {
        
        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.dataMahasiswa = new Mahasiswa[] {
            new Mahasiswa("22001", "Teknik Informatika", "Andi"),
            new Mahasiswa("22002", "Teknik Informatika", "Budi"),
            new Mahasiswa("22003", "Sistem Informasi Bisnis", "Citra"),
        };
        
        perpustakaan.dataBuku = new Buku[] {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemograman", 2021),
            new Buku("B004", "Fisika", 2024),
        };

        perpustakaan.dataPeminjaman = new Peminjaman[] {
            new Peminjaman(perpustakaan.dataMahasiswa[0], perpustakaan.dataBuku[0], 7),
            new Peminjaman(perpustakaan.dataMahasiswa[1], perpustakaan.dataBuku[1], 3),
            new Peminjaman(perpustakaan.dataMahasiswa[2], perpustakaan.dataBuku[2], 10),
            new Peminjaman(perpustakaan.dataMahasiswa[2], perpustakaan.dataBuku[3], 6),
            new Peminjaman(perpustakaan.dataMahasiswa[0], perpustakaan.dataBuku[1], 4),
        };
        
        Scanner sc = new Scanner(System.in);
        int opt;
        boolean loop = true;

        while (loop) {
            banner();
            System.out.print("\nPilih: ");
            opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 0:
                    loop = false;
                    System.out.println("\nKeluar...");
                    break;
                case 1:
                    perpustakaan.tampilDataMahasiswa();
                    break;
                case 2:
                    perpustakaan.tampilDataBuku();
                    break;
                case 3:
                    perpustakaan.tampilDataPeminjaman();
                    break;
                case 4:
                    perpustakaan.urutkanBerdasarkanDenda();
                    break;
                case 5:
                    perpustakaan.cariBerdasarkanNIM(sc);
                    break;
                case 6:
                    perpustakaan.tambahDataPeminjaman(sc);
                    break;
                case 7:
                    perpustakaan.tampilStatistik();
                    break;
                case 8:
                    perpustakaan.tampilLaporanMahasiswa();
                    break;
                default:
                    System.out.println("!Input tidak valid, coba lagi!");
                    break;
            }
        }

        sc.close();
    }
}
