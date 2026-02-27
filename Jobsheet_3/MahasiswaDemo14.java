import java.util.Scanner;

public class MahasiswaDemo14 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Mahasiswa14[] arrayOfMahasiswa = new Mahasiswa14[3];

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa14();
            System.out.println("[+] Masukkan Data Mahasiswa ke-"+(i+1));
            
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            arrayOfMahasiswa[i].ipk = sc.nextFloat();
            System.out.println("---------------------------------");
            sc.nextLine();
        }

        System.out.println("\n");

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("[i] Data Mahasiswa ke-"+(i+1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("---------------------------------");
        }

        Mahasiswa14[] myArrayOfMahasiswa = new Mahasiswa14[3];
        myArrayOfMahasiswa[0].nim = "244107060033";
        myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas = "SIB-1E";
        myArrayOfMahasiswa[0].ipk = (float) 3.75;
    }
}
