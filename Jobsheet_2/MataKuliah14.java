public class MataKuliah14 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    MataKuliah14() {
        
    }
    
    MataKuliah14(String nama, String kodeMK, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println();
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        int sksLama = sks;
        sks = sksBaru;
        System.out.printf("[+] SKS \"%s\" telah diubah dari %d -> %d\n", nama, sksLama, sksBaru);
    }
    
    void tambahJam(int jam) {
        int jumlahJamLama = jumlahJam;
        jumlahJam += jam;
        System.out.printf("[+] Jumlah jam \"%s\" telah ditambah %d jam, dari %d jam -> %d jam\n", nama, jam, jumlahJamLama, jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jam <= jumlahJam) {
            int jumlahJamLama = jumlahJam;
            jumlahJam -= jam;
            System.out.printf("[-] Jumlah jam \"%s\" telah ditambah %d jam, dari %d jam -> %d jam\n", nama, jam, jumlahJamLama, jumlahJam);
        } else {
            System.out.printf("[!] Gagal melakukan pengurangan jam! Maksimal: %d jam\n", jumlahJam);
        }
    }
}
