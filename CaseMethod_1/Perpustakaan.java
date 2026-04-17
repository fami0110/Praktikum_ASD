import java.util.Arrays;
import java.util.Scanner;

public class Perpustakaan {
    Mahasiswa dataMahasiswa[];
    Buku dataBuku[];
    Peminjaman dataPeminjaman[];

    void tampilDataMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mhs : dataMahasiswa) {
            mhs.tampilMahasiswa();
        }
    }

    void tampilDataBuku() {
        System.out.println("\nDaftar Buku:");
        for (Buku buku : dataBuku) {
            buku.tampilBuku();
        }
    }

    void tampilDataPeminjaman() {
        System.out.println("\nDaftar Peminjaman:");
        for (Peminjaman pnj : dataPeminjaman) {
            pnj.tampilPeminjaman();
        }
    }

    void urutkanBerdasarkanDenda() {
        Peminjaman sorted[] = dataPeminjaman.clone();

        // Insertion Sort (DESC)
        Peminjaman currentData;
        int j;
        for (int i = 1; i < sorted.length; i++) {     
            currentData = sorted[i];
            j = i-1;
            
            while (j >= 0 && currentData.denda > sorted[j].denda) {
                sorted[j+1] = sorted[j];
                --j;
            }

            sorted[j+1] = currentData;
        }

        System.out.println("\nDaftar Peminjaman:");

        for (Peminjaman pnj : sorted) {
            pnj.tampilPeminjaman();
        }
    }

    void cariBerdasarkanNIM(Scanner sc) {
        // Linear Searching
        System.out.print("\nMasukkan NIM: ");
        String cari = sc.nextLine();
        int find = -1;

        for (int i = 0; i < dataPeminjaman.length; i++) {
            if (cari.equalsIgnoreCase(dataPeminjaman[i].mhs.nim)) {
                find = i;
                break;
            }
        }

        if (find != -1) {
            dataPeminjaman[find].tampilPeminjaman();
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }

    int tamdahDataPeminjaman(Scanner sc) {
        String nim, kodeBuku;
        int lamaPinjam;
        
        
        System.out.println();

        System.out.print("Masukkan NIM         : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kode Buku   : ");
        kodeBuku = sc.nextLine();
        System.out.print("Masukkan Lama Pinjam : ");
        lamaPinjam = sc.nextInt();
        sc.nextLine();

        int i_mhs = -1;
        int i_buku = -1;

        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (nim.equalsIgnoreCase(dataMahasiswa[i].nim)) {
                i_mhs = i;
                break;
            }
        }

        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (kodeBuku.equalsIgnoreCase(dataBuku[i].kodeBuku)) {
                i_buku = i;
                break;
            }
        }

        if (i_mhs == -1 && i_buku == -1) {
            System.out.println("[!] NIM dan Kode Buku TIDAK DITEMUKAN!");
            return -1;
        } else if (i_mhs == -1) {
            System.out.println("[!] NIM TIDAK DITEMUKAN!");
            return -1;
        } else if (i_buku == -1) {
            System.out.println("[!] Kode Buku TIDAK DITEMUKAN!");
            return -1;
        }

        this.dataPeminjaman = Arrays.copyOf(this.dataPeminjaman, dataPeminjaman.length+1);
        this.dataPeminjaman[this.dataPeminjaman.length-1] = new Peminjaman(
            dataMahasiswa[i_mhs], dataBuku[i_buku], lamaPinjam
        );

        System.out.println("[+] Data Peminjaman BERHASIL DITAMBAHKAN!");

        return dataPeminjaman.length;
    }

    void tampilStatistik() {
        System.out.println("\n=== STATISTIK PEMINJAMAN ===");

        int total_denda = 0, jml_terlambat = 0, jml_tepatwaktu = 0;

        for (Peminjaman pnj : dataPeminjaman) {
            if (pnj.terlambat > 0) {
                jml_terlambat++;
            } else {
                jml_tepatwaktu++;
            }
            total_denda += pnj.denda;
        }

        System.out.println("Total Denda Keseluruhan       : " + total_denda);
        System.out.println("Jumlah Peminjaman Terlambat    : " + jml_terlambat);
        System.out.println("Jumlah Peminjaman Tepat Waktu : " + jml_tepatwaktu);
    }
}
