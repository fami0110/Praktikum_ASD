public class MahasiswaMain14 {
    public static void main(String[] args) {
        Mahasiswa14 mhs1 = new Mahasiswa14();
        mhs1.nama = "Masando Fami Ramadhan";
        mhs1.nim = "254107060011";
        mhs1.kelas = "SIB 1B";
        mhs1.ipk = 3.0;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB 2B");
        mhs1.updateIpk(3.86);
        mhs1.tampilkanInformasi();

        Mahasiswa14 mhs2 = new Mahasiswa14("Dian Nisa", "254107060036", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa14 mhsMasando = new Mahasiswa14("Fami", "254107060011", 4.0, "SIB 2B");
        mhsMasando.tampilkanInformasi();
    }
}
