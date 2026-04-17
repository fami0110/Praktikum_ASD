public class LaporanMahasiswa {
    Mahasiswa mahasiswa;
    int totalPinjam;
    int totalDenda;
    int totalTerlambat;

    LaporanMahasiswa(Mahasiswa mhs) {
        this.mahasiswa = mhs;
        this.totalPinjam = 0;
        this.totalDenda = 0;
        this.totalTerlambat = 0;
    }

    void hitungLaporan(Peminjaman[] pinjam) {
        for (Peminjaman pnj : pinjam) {
            if (pnj.mhs.nim.equalsIgnoreCase(mahasiswa.nim)) {
                if (pnj.terlambat > 0) this.totalTerlambat++;
                this.totalDenda += pnj.denda;
                this.totalPinjam++;
            }
        }
    }

    void tampilLaporan() {
        System.out.printf(
            "NIM: %s | Nama: %s | Total Pinjam: %d | Total Denda: %d | Terlambat: %dx\n", 
            this.mahasiswa.nim, this.mahasiswa.nama, this.totalPinjam, this.totalDenda, this.totalTerlambat
        );
    }
}
