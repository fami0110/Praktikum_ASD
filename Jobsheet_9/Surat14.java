public class Surat14 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat14() {

    }

    Surat14(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    void tampil() {
        System.out.printf("ID Surat         : %s\n", this.idSurat);
        System.out.printf("Nama Mahasiswa   : %s\n", this.namaMahasiswa);
        System.out.printf("Kelas            : %s\n", this.kelas);
        System.out.printf("Jenis Izin       : %c\n", this.jenisIzin);
        System.out.printf("Durasi           : %d jam\n", this.durasi);
    }
}
