import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("\nSilahkan pilih menu di bawah ini:");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Tambah Mahasiswa");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("5. Tampilkan Peminjaman");
        System.out.println("6. Keluar");
        System.out.print("> ");
    }

    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan(sc);

        System.out.println("\n###############################");
        System.out.println("##### SISTEM PERPUSTAKAAN #####");
        System.out.println("###############################");

        byte opt;
        boolean loop = true;

        while (loop) {
            menu();
            opt = sc.nextByte();
            sc.nextLine(); // RESET INPUT STREAM

            System.out.println();

            switch (opt) {
                case 1:
                    perpustakaan.tambahBuku();
                    break;
                case 2:
                    perpustakaan.tambahMahasiswa();
                    break;
                case 3:
                    perpustakaan.pinjamBuku();
                    break;
                case 4:
                    perpustakaan.kembalikanBuku();
                    break;
                case 5:
                    perpustakaan.tampilkanDaftarPeminjaman();
                    break;
                case 6:
                    loop = false;
                    System.out.println("[~] Terima kasih telah menggunakan sistem perpustakaan!"); 
                    break;
                default:
                    System.out.println("[!] Opsi tidak valid!");
                    break;
            }
        }
    }
}
