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
    }
}
