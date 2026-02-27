import java.util.Scanner;

public class DosenDemo14 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {      
        System.out.print("Masukkan Jumlah Data: ");
        int ln = sc.nextInt();
        sc.nextLine();

        Dosen14[] arrayOfDosen = new Dosen14[ln];
        String kode, nama, tmp;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("[+] Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            tmp = sc.nextLine();
            jenisKelamin = tmp.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            System.out.println("---------------------------------");
            sc.nextLine();

            arrayOfDosen[i] = new Dosen14(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n");

        int i = 0;
        for (Dosen14 dosen : arrayOfDosen) {
            System.out.println("[i] Data Dosen ke-" + (++i));
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("---------------------------------");
        }

        DataDosen14.dataSemuaDosen(arrayOfDosen);
        DataDosen14.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen14.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen14.infoDosenPalingTua(arrayOfDosen);
        DataDosen14.infoDosenPalingMuda(arrayOfDosen);
    }
}
