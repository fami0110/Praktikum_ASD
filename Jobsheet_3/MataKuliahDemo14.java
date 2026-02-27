import java.util.Scanner;

public class MataKuliahDemo14 {    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {   
        System.out.print("Masukkan jumlah elemen: ");   
        int ln = sc.nextInt();
        sc.nextLine();

        MataKuliah14[] arrayOfMataKuliah = new MataKuliah14[ln];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("[+] Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i] = MataKuliah14.tambahData(sc);
            System.out.println("---------------------------------");
        }

        System.out.println("\n");

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("[i] Data Matakuliah ke-"+(i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("---------------------------------");
        }

    }
}
