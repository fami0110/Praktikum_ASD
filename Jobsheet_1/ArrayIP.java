import java.util.Scanner;

public class ArrayIP {
    static Scanner sc = new Scanner(System.in);

    static String[] krs = {
        "Critical Thinking and Problem Solving",
        "Matematika Dasar",
        "Dasar Pemrograman",
        "Praktikum Dasar Pemrograman",
        "Konsep Teknologi Informasi",
        "Pengantar Akuntansi, Manajemen, dan Bisnis",
        "Bahasa Indonesia",
        "Bahasa Inggris Dasar",
    };

    static int[] nilai = new int[krs.length];

    static String dapatkanNilaiHuruf(double n) {
        if (80 < n && n <= 100) {
            return "A";
        } else if (73 < n && n <= 80) {
            return "B+";
        } else if (65 < n && n <= 73) {
            return "B";
        } else if (60 < n && n <= 65) {
            return "C+";
        } else if (50 < n && n <= 60) {
            return "C";
        } else if (39 < n && n <= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    static double dapatkanBobotNilai(String s) {
        switch (s) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0;
        }
    }

    static double rekap() {
        double kumulatif = 0;
        String nilai_huruf;
        double bobot_nilai;

        System.out.printf("%-45s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        for (int i = 0; i < krs.length; i++) {
            nilai_huruf = dapatkanNilaiHuruf(nilai[i]);
            bobot_nilai = dapatkanBobotNilai(nilai_huruf);
            kumulatif += bobot_nilai;

            System.out.printf("%-45s %-15.2f %-15s %-15.2f\n", krs[i], (double) nilai[i], nilai_huruf, (double) bobot_nilai);
        }

        return kumulatif / krs.length;
    }

    static void inputNilai() {
        for (int i = 0; i < krs.length; i++) {
            System.out.printf("Masukkan nilai Angka untuk MK %s\n> ", krs[i]);
            nilai[i] = sc.nextInt();

            if (nilai[i] < 0 && nilai[i] > 100) {
                System.out.println("Masukkan input sesuai rentang nilai!");
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        double ipk = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        
        inputNilai();

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        
        ipk = rekap();

        System.out.println("==============================");
        System.out.printf("IP: %.2f\n", ipk);
    }
}
