public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Mahasiswa14[] arrayOfMahasiswa = new Mahasiswa14[3];

        arrayOfMahasiswa[0] = new Mahasiswa14();
        arrayOfMahasiswa[0].nim = "254107060023";
        arrayOfMahasiswa[0].nama = "FULAN BIN FULAN";
        arrayOfMahasiswa[0].kelas = "SIB 1B";
        arrayOfMahasiswa[0].ipk = 3.75f;

        arrayOfMahasiswa[1] = new Mahasiswa14();
        arrayOfMahasiswa[1].nim = "254107060063";
        arrayOfMahasiswa[1].nama = "FULAN BIN RAUL";
        arrayOfMahasiswa[1].kelas = "TI 2A";
        arrayOfMahasiswa[1].ipk = 3.36f;

        arrayOfMahasiswa[2] = new Mahasiswa14();
        arrayOfMahasiswa[2].nim = "254107060023";
        arrayOfMahasiswa[2].nama = "FULAN BIN ASEP";
        arrayOfMahasiswa[2].kelas = "SIB 1E";
        arrayOfMahasiswa[2].ipk = 3.80f;

        System.out.println("NIM   : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa[0].ipk);
        System.out.println("---------------------------------");
        System.out.println("NIM   : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa[1].ipk);
        System.out.println("---------------------------------");
        System.out.println("NIM   : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama  : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK   : " + arrayOfMahasiswa[2].ipk);
    }
}
