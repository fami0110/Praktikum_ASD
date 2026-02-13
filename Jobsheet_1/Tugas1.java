import java.util.Scanner;

public class Tugas1 {

    static Scanner sc = new Scanner(System.in);

    static char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

    static char[][] KOTA = {
        {'B','A','N','T','E','N',' ',' ',' ',' ',' ',' '},
        {'J','A','K','A','R','T','A',' ',' ',' ',' ',' '},
        {'B','A','N','D','U','N','G',' ',' ',' ',' ',' '},
        {'C','I','R','E','B','O','N',' ',' ',' ',' ',' '},
        {'B','O','G','O','R',' ',' ',' ',' ',' ',' ',' '},
        {'P','E','K','A','L','O','N','G','A','N',' ',' '},
        {'S','E','M','A','R','A','N','G',' ',' ',' ',' '},
        {'S','U','R','A','B','A','Y','A',' ',' ',' ',' '},
        {'M','A','L','A','N','G',' ',' ',' ',' ',' ',' '},
        {'T','E','G','A','L',' ',' ',' ',' ',' ',' ',' '}
    };

    static int findIndex(char c) {
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == c) return i;
        }
        return -1;
    }

    static String displayKota(int idx) {
        return (new String(KOTA[idx])).trim();
    }

    public static void main(String[] args) {
        char kode;
        System.out.print("Masukkan Kode : ");
        kode = sc.next().charAt(0);

        int idx = findIndex(kode);

        if (idx == -1) {
            System.out.println("kode kota tidak ditemukan!");
        } else {
            System.out.println("Nama Kota     : " + displayKota(idx));
        }

    }
}
