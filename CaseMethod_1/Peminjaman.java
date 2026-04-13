public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;
    
    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.hitungDenda();
    }

    int hitungDenda() {
        this.terlambat = (this.lamaPinjam > this.batasPinjam) ? 
            (this.lamaPinjam - this.batasPinjam) : 0;

        this.denda = this.terlambat * 2000;

        return this.denda;
    }

    void tampilPeminjaman() {
        System.out.printf("%s | %s | Lama: %d | Terlambat: %d | Denda: %d\n", 
            this.mhs.nama, 
            this.buku.judul, 
            this.lamaPinjam,
            this.terlambat,
            this.denda
        );
    }
}