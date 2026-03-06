import java.util.Scanner;

public class Perpustakaan {
    Scanner sc;
    
    Buku[] daftarBuku;
    Mahasiswa[] daftarMahasiswa;
    int daftarBuku_index;
    int daftarMahasiswa_index;

    Perpustakaan(Scanner sc) {
        System.out.print("Masukkan kapasitas daftar koleksi perpustakaan\n> ");
        int b_len = sc.nextInt();
        System.out.print("Masukkan kapasitas member perpustakaan\n> ");
        int m_len = sc.nextInt();
        
        this.daftarBuku = new Buku[b_len];
        this.daftarMahasiswa = new Mahasiswa[m_len];
        this.daftarBuku_index = 0;
        this.daftarMahasiswa_index = 0;
        this.sc = sc;

        sc.nextLine();
    }

    Perpustakaan(int b_len, int m_len, Scanner sc) {
        this.daftarBuku = new Buku[b_len];
        this.daftarMahasiswa = new Mahasiswa[m_len];
        this.daftarBuku_index = 0;
        this.daftarMahasiswa_index = 0;
        this.sc = sc;

        sc.nextLine();
    }

    void tambahBuku() {
        System.out.print("Kode    : ");
        String kode = sc.nextLine();
        System.out.print("Judul   : ");
        String judul = sc.nextLine();
        System.out.print("Penulis : ");
        String penulis = sc.nextLine();
        System.out.println();

        if (this.daftarBuku_index >=  this.daftarBuku.length) {
            System.out.println("[!] Gagal menambahkan: Kapasitas daftar koleksi perpustakaan telah mencapai batas maksimal!");
            return;
        }

        this.daftarBuku[this.daftarBuku_index] = new Buku(kode, judul, penulis, false);
        this.daftarBuku_index++;

        System.out.println("[+] Buku berhasil ditambahkan!");
    }

    void tambahMahasiswa() {
        System.out.print("NIM    : ");
        String nim = sc.nextLine();
        System.out.print("Nama   : ");
        String nama = sc.nextLine();
        System.out.println();

        if (this.daftarMahasiswa_index >= this.daftarMahasiswa.length) {
            System.out.println("[!] Gagal menambahkan: Kapasitas member perpustakaan telah mencapai batas maksimal!");
            return;
        }

        this.daftarMahasiswa[this.daftarMahasiswa_index] = new Mahasiswa(nim, nama);
        this.daftarMahasiswa_index++;

        System.out.println("[+] Mahasiswa berhasil ditambahkan!");
    }

    int cariIndexMahasiswa(String nim) {
        for (int i = 0; i < this.daftarMahasiswa.length; i++) {
            if (this.daftarMahasiswa[i] == null) break;
            if (this.daftarMahasiswa[i].nim.equalsIgnoreCase(nim)) {
                return i;
            }
        }
        return -1;
    }

    int cariIndexBuku(String kode) {
        for (int i = 0; i < this.daftarBuku.length; i++) {
            if (this.daftarBuku[i] == null) break;
            if (this.daftarBuku[i].kode.equalsIgnoreCase(kode)) {
                return i;
            }
        }
        return -1;
    }

    void pinjamBuku() {
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Kode Buku     : ");
        String kode = sc.nextLine();
        System.out.println();

        int index_mhs = cariIndexMahasiswa(nim);
        if (index_mhs == -1) {
            System.out.println("[!] Mahasiswa tidak ditemukan!");
            return;
        }

        int index_buku = cariIndexBuku(kode);
        if (index_buku == -1) {
            System.out.println("[!] Buku tidak ditemukan!");
            return;
        }

        Buku buku = this.daftarBuku[index_buku];
        Mahasiswa mhs = this.daftarMahasiswa[index_mhs];

        if (buku.status) {
            System.out.printf("[-] Buku \"%s\" sudah dipinjam orang lain!\n", buku.judul);
            return;
        }

        if (!mhs.tambahBuku(buku)) {
            System.out.printf("[-] \"%s\" tidak bisa meminjam lebih dari 2 buku!\n", mhs.nama);
            return;
        }

        buku.status = true;
        System.out.println("[+] Buku berhasil dipinjam!");
    }

    void kembalikanBuku() {
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Kode Buku     : ");
        String kode = sc.nextLine();
        System.out.println();

        int index_mhs = cariIndexMahasiswa(nim);
        if (index_mhs == -1) {
            System.out.println("[!] Mahasiswa tidak ditemukan!");
            return;
        }

        int index_buku = cariIndexBuku(kode);
        if (index_buku == -1) {
            System.out.println("[!] Buku tidak ditemukan!");
            return;
        }

        Buku buku = this.daftarBuku[index_buku];
        Mahasiswa mhs = this.daftarMahasiswa[index_mhs];

        if (!buku.status) {
            System.out.printf("[-] Buku \"%s\" masih belum dipinjam!\n", buku.judul);
            return;
        }

        if (!mhs.hapusBuku(kode)) {
            System.out.printf("[-] \"%s\" tidak sedang meminjam buku \"%s\"!\n", mhs.nama, buku.judul);
            return;
        }

        buku.status = false;
        System.out.println("[+] Buku berhasil dikembalikan!");
    }

    void tampilkanDaftarPeminjaman() {
        for (int i = 0; i < this.daftarMahasiswa_index; i++) {
            Mahasiswa mhs = this.daftarMahasiswa[i];
            boolean cekStatusPeminjaman = false;

            for (Buku buku : mhs.bukuDipinjam) {
                if (buku != null) {
                    cekStatusPeminjaman = true;
                    break;
                }
            }

            if (cekStatusPeminjaman) {
                System.out.printf("%d. %s (nim: %s) \n", i+1, mhs.nama, mhs.nim);

                for (Buku buku : mhs.bukuDipinjam) {
                    if (buku != null) {
                        System.out.printf("  - %s : \"%s\"\n", buku.kode, buku.judul);
                    }
                }
            }
        }
    }
}
