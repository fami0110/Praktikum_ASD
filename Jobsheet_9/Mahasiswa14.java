public class Mahasiswa14 {
    String nim;
    String nama;
    String kelas;
    int nilai = -1;

    Mahasiswa14() {

    }

    Mahasiswa14(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
