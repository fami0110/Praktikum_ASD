import java.util.Scanner;

public class MataKuliahDemo14 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {      
        MataKuliah14[] arrayOfMataKuliah = new MataKuliah14[3];
        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("[+] Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            sks = sc.nextInt();
            System.out.print("Jumlah Jam : ");
            jumlahJam = sc.nextInt();
            System.out.println("---------------------------------");
            sc.nextLine();

            arrayOfMataKuliah[i] = new MataKuliah14(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n");

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("[i] Data Matakuliah ke-"+(i+1));
            System.out.println("Kode       : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS        : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("---------------------------------");
        }

    }
}
