import java.util.Scanner;

public class MataKuliah14 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah14(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public static MataKuliah14 tambahData(Scanner sc) {
        String kode, nama;
        int sks, jumlahJam;
        
        System.out.print("Kode       : ");
        kode = sc.nextLine();
        System.out.print("Nama       : ");
        nama = sc.nextLine();
        System.out.print("SKS        : ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam : ");
        jumlahJam = sc.nextInt();
        sc.nextLine();

        return new MataKuliah14(kode, nama, sks, jumlahJam);
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + this.kode);
        System.out.println("Nama       : " + this.nama);
        System.out.println("SKS        : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
    }
}
