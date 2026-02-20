public class DosenMain14 {
    public static void main(String[] args) {
        Dosen14 dosen1 = new Dosen14();
        dosen1.nama = "Pasupeso";
        dosen1.idDosen = "21884387647";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1998;
        dosen1.bidangKeahlian = "Matematika";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Teknik Pensiun");
        dosen1.tampilInformasi();
        
        Dosen14 dosen2 = new Dosen14("Bambang Yudhoyono", "218932176", false, 2006, "Aerodinamika");
        dosen2.tampilInformasi();
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Keselamatan Lingkungan Kerja");
        dosen2.tampilInformasi();
    }
}
