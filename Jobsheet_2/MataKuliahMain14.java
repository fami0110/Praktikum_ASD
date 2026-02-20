public class MataKuliahMain14 {
    public static void main(String[] args) {
        // Objek dnegan konstruktor default
        MataKuliah14 mk1 = new MataKuliah14();
        mk1.nama = "Algoritma & Struktur Data";
        mk1.kodeMK = "328237466";
        mk1.sks = 25;
        mk1.jumlahJam = 6;
        
        mk1.tampilInformasi();
        mk1.ubahSKS(32);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();
        
        
        // Objek dnegan konstruktor berparameter
        MataKuliah14 mk2 = new MataKuliah14("Basis Data", "18243721647", 20, 4);
        
        mk2.tampilInformasi();
        mk2.ubahSKS(43);
        mk2.kurangiJam(1);
        mk2.kurangiJam(6);
        mk2.tampilInformasi();
    }
}
