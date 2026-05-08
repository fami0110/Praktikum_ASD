import java.util.Scanner;

public class SuratDemo14 {

    static void banner() {
        System.out.println("\n=== SISTEM MANAJEMEN SURAT IZIN ===");
        System.out.println("1. Terima Surat Izin");
        System.out.println("2. Proses Surat Izin");
        System.out.println("3. Lihat Surat Izin Terakhir");
        System.out.println("4. Cari Surat Izin Berdasarkan Nama Mahasiswa");
        System.out.println("0. Keluar");
        System.out.print("> ");
    }

    static void terimaSurat(StackSurat14 stack, Scanner sc) {
        String idSurat, namaMahasiswa, kelas;
        char jenisIzin;
        int durasi;

        System.out.print("ID Surat       : ");
        idSurat = sc.nextLine();

        System.out.print("Nama Mahasiswa : ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Kelas          : ");
        kelas = sc.nextLine();

        System.out.print("Jenis Izin     : ");
        jenisIzin = sc.next().charAt(0); 

        System.out.print("Durasi         : ");
        durasi = sc.nextInt();

        sc.nextLine();

        Surat14 surat = stack.push(new Surat14( idSurat, namaMahasiswa, kelas, jenisIzin, durasi ));

        if (surat == null) return;

        System.out.printf("\n[+] Surat Baru Telah Diterima! (%s)\n", surat.idSurat);
    };

    static void prosesSurat(StackSurat14 stack) {
        Surat14 surat = stack.pop();

        if (surat == null) return;

        System.out.printf("Memroses surat %s...\n", surat.idSurat);

        if (surat.jenisIzin == 'S' || surat.jenisIzin == 'I') {
            System.out.println("[v] Surat diterima!");
            System.out.printf("    Status: %s\n", (surat.jenisIzin == 'S') ? "Sakit" : "Izin");
            System.out.printf("    Durasi: %d jam\n", surat.durasi);
        } else {
            System.out.println("[X] Surat ditolak! jenis izin tidak valid!");
        }
    };

    static void lihatSuratTerakhir(StackSurat14 stack) {
        Surat14 surat = stack.peek();
        
        if (surat == null) return;
        
        System.out.println("Surat Terakhir:");
        surat.tampil();
    };

    static void cariSurat(StackSurat14 stack, Scanner sc) {
        System.out.print("Masukan Nama Mahasiswa: ");
        String namaMahasiswa = sc.nextLine();

        Surat14 cari = stack.search(namaMahasiswa);

        if (cari == null) {
            System.out.println("Surat tidak ditemukan!");
            return;
        }

        System.out.println("\nHasil Pencarian: ");
        cari.tampil();
    };

    public static void main(String[] args) {
        StackSurat14 stack = new StackSurat14(25);
        Scanner sc = new Scanner(System.in);
        short opt;

        do {
            banner();
            opt = sc.nextShort();
            sc.nextLine();
            System.out.println();

            switch (opt) {
                case 1:
                    terimaSurat(stack, sc);
                    break;
                case 2:
                    prosesSurat(stack);
                    break;
                case 3:
                    lihatSuratTerakhir(stack);
                    break;
                case 4:
                    cariSurat(stack, sc);
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (opt != 0);
    }
}
