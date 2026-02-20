public class Dosen14 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    Dosen14() {
        
    }

    Dosen14(String nama, String idDosen, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

   void tampilInformasi() {
        System.out.println();
        System.out.println("Nama            : " + nama);
        System.out.println("ID              : " + idDosen);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.printf("[+] Status dosen \"%s\": %s \n", nama, (statusAktif ? "Aktif" : "Tidak Aktif"));
    }
    
    void hitungMasaKerja(int thnSkrg) {
        int selisih = thnSkrg - tahunBergabung;
        System.out.printf("[i] Masa kerja dosen \"%s\": %d tahun \n", nama, selisih);
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.printf("[+] Bidang keahlian dosen \"%s\" telah diubah menjadi \"%s\" \n", nama, bidangKeahlian);
    }
}
