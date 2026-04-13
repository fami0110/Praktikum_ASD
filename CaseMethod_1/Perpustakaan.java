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

        // Selection sorting (DESC)
        // int currentMax;
        // for (int i = 0; i < sorted.length-1; i++) {
        //     currentMax = i;

        //     // Search max value
        //     for (int j = i+1; j < sorted.length; j++) {
        //         if (sorted[j].denda > sorted[currentMax].denda) {
        //             currentMax = j;
        //         }
        //     }

        //     // Swap them
        //     Peminjaman temp = sorted[i];
        //     sorted[i] = sorted[currentMax];
        //     sorted[currentMax] = temp;
        // }

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
}
