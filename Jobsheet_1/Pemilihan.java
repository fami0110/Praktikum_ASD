import java.util.Scanner;

public class Pemilihan {
    static Scanner sc = new Scanner(System.in);

    public static boolean validate(int... nilai) {
        for (int n : nilai) {
            if (!(n >= 0 && n <= 100)) 
                return false;
        }
        return true;
    }

    public static boolean cekAkumulasi(double n) {
        if (80 < n && n <= 100) {
            System.out.println("Nilai Huruf: A");
            return true;
        } else if (73 < n && n <= 80) {
            System.out.println("Nilai Huruf: B+");
            return true;
        } else if (65 < n && n <= 73) {
            System.out.println("Nilai Huruf: B");
            return true;
        } else if (60 < n && n <= 65) {
            System.out.println("Nilai Huruf: C+");
            return true;
        } else if (50 < n && n <= 60) {
            System.out.println("Nilai Huruf: C");
            return true;
        } else if (39 < n && n <= 50) {
            System.out.println("Nilai Huruf: D");
            return false;
        } else {
            System.out.println("Nilai Huruf: E");
            return false;
        }
    }

    public static void main(String[] args) {
        int tugas, kuis, uas, uts;
        double akumulasi;
        boolean lulus = false;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = sc.nextInt();

        System.out.print("Masukkan Nilai Kuis  : ");
        kuis = sc.nextInt();
        
        System.out.print("Masukkan Nilai UAS   : ");
        uas = sc.nextInt();
        
        System.out.print("Masukkan Nilai UTS   : ");
        uts = sc.nextInt(); 

        System.out.println("==============================");
        System.out.println("==============================");

        if (!validate(tugas, kuis, uas, uts)) {
            System.out.println("Nilai tidak valid!");
        } else {
            akumulasi = (0.2*tugas) + (0.2*kuis) + (0.3*uas) + (0.3*uts);
            System.out.println("Nilai Akhir: "+akumulasi);
            lulus = cekAkumulasi(akumulasi);
        }

        System.out.println("==============================");
        System.out.println("==============================");

        if (lulus)
            System.out.println("SELAMAT ANDA LULUS!");
    }
}