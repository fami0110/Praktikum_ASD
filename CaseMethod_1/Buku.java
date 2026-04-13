public class Buku {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    void tampilBuku() {
        System.out.printf("Kode: %s | Judul: %s | Tahun: %d\n", this.kodeBuku, this.judul, this.tahunTerbit);
    }
}
