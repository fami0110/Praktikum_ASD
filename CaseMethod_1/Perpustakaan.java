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

    Peminjaman[] insertionSortPeminjamanASC() {
        Peminjaman sorted[] = dataPeminjaman.clone();
        
        Peminjaman currentData;
        int j;
        for (int i = 1; i < sorted.length; i++) {
            currentData = sorted[i];
            j = i-1;
            
            while (j >= 0 && currentData.mhs.nim.compareTo(sorted[j].mhs.nim) < 0) {
                sorted[j+1] = sorted[j];
                --j;
            }

            sorted[j+1] = currentData;
        }

        return sorted;
    }

    int binarySearchPeminjaman(Peminjaman[] peminjaman, String cari, int left, int right) {
		int mid;
		if (right >= left) {
			mid = (left + right) / 2;
			if (cari.equalsIgnoreCase(peminjaman[mid].mhs.nim)) {
				return mid;
			} else if (peminjaman[mid].mhs.nim.compareTo(cari) > 0) {
				return binarySearchPeminjaman(peminjaman, cari, left, mid - 1);
			} else {
				return binarySearchPeminjaman(peminjaman, cari, mid + 1, right);
			}
		}
		return -1;
	}

    void tampilHasilBinaryPeminjaman(Peminjaman[] sorted_asc, int found_idx) {
        // Cetak nilai yang ditemukan
        sorted_asc[found_idx].tampilPeminjaman();

        // Cetak nilai yang sama dengan cara ekspansi sisi kiri dan kanan
        boolean left_found = true;
        boolean right_found = true;
        int offset = 1;

        while (left_found || right_found) {
            if (left_found) {
                if ((found_idx-offset) < 0) {
                    left_found = false;
                } else if (!sorted_asc[found_idx-offset].mhs.nim.equalsIgnoreCase(sorted_asc[found_idx].mhs.nim)) {
                    left_found = false;
                } else {
                    sorted_asc[found_idx-offset].tampilPeminjaman();
                }
            }
            if (right_found) {
                if ((found_idx+offset) >= sorted_asc.length) {
                    right_found = false;
                } else if (!sorted_asc[found_idx+offset].mhs.nim.equalsIgnoreCase(sorted_asc[found_idx].mhs.nim)) {
                    right_found = false;
                } else {
                    sorted_asc[found_idx+offset].tampilPeminjaman();
                }
            }
            offset++;
        }
    }

    void cariBerdasarkanNIM(Scanner sc) {
        System.out.print("\nMasukkan NIM: ");
        String cari = sc.nextLine();

        // Sequencial Searching
        // int find = -1;

        // for (int i = 0; i < dataPeminjaman.length; i++) {
        //     if (cari.equalsIgnoreCase(dataPeminjaman[i].mhs.nim)) {
        //         find = i;
        //         break;
        //     }
        // }

        // Binary search
        Peminjaman[] sorted_asc = insertionSortPeminjamanASC();
        int find = binarySearchPeminjaman(sorted_asc, cari, 0, sorted_asc.length-1);

        if (find != -1) {
            tampilHasilBinaryPeminjaman(sorted_asc, find);
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
