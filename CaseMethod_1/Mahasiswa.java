public class Mahasiswa {
    String nim;
    String prodi;
    String nama;

    Mahasiswa(String nim, String prodi, String nama) {
        this.nim = nim;
        this.prodi = prodi;
        this.nama = nama;
    }

    void tampilMahasiswa() {
        System.out.printf("NIM: %s | Nama: %s | Prodi: %s\n", this.nim, this.nama, this.prodi);
    }
}