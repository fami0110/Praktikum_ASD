import java.util.Scanner;

public class MahasiswaDemo14 {

    static void banner() {
        System.out.println("\nMenu:");
        System.out.println("1. Mengumpulkan Tugas");
        System.out.println("2. Menilai Tugas");
        System.out.println("3. Melihat Tugas Teratas");
        System.out.println("4. Melihat Daftar Tugas");
        System.out.println("5. Melihat Tugas Pertama");
        System.out.println("6. Hitung Banyak Tugas Saat ini");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }

    static void kumpulkanTugas(StackTugasMahasiswa14 stack, Scanner sc) {
        String nama, nim, kelas;
        
        System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("NIM: ");
        nim = sc.nextLine();
        System.out.print("Kelas: ");
        kelas = sc.nextLine();

        Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas);

        stack.push(mhs);

        System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
    }

    static void menilaiTugas(StackTugasMahasiswa14 stack, Scanner sc) {
        Mahasiswa14 dinilai = stack.pop();
        
        System.out.printf("Menilai Tugas Dari %s\n", dinilai.nama);
        System.out.print("Masukkan nilai (0-100): ");
        
        short nilai = sc.nextShort();

        dinilai.tugasDinilai(nilai);

        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
		
		String biner = stack.konversiDesimalKeBiner(nilai);
		
        System.out.printf("Nilai biner tugas: %s\n", biner);
    }

    static void lihatTugasPalingAtas(StackTugasMahasiswa14 stack) {
        Mahasiswa14 lihat = stack.peek();

        if (lihat != null) {
            System.out.printf("Tugas terakhir dikumpulkan oleh %s\n", lihat.nama);
        }
    }

    static void lihatDaftarTugas(StackTugasMahasiswa14 stack) {
        System.out.println("Daftar Semua Tugas:");
        stack.print();
    }

	static void lihatTugasPertama(StackTugasMahasiswa14 stack) {
		Mahasiswa14 lihat = stack.bottom();

        if (lihat != null) {
            System.out.printf("Tugas pertama dikumpulkan oleh %s\n", lihat.nama);
        }
	}

	static void hitungBanyakTugas(StackTugasMahasiswa14 stack) {
		System.out.printf("Banyak tugas yang sudah dikumpulkan: %d\n", stack.top+1);
	}

    public static void main(String[] args) {
        StackTugasMahasiswa14 stack = new StackTugasMahasiswa14(5);
        Scanner sc = new Scanner(System.in);
        short opt;

        do {
            banner();
            opt = sc.nextShort();
            sc.nextLine();
            System.out.println();

            switch (opt) {
                case 1:
                    kumpulkanTugas(stack, sc);
                    break;
                case 2:
                    menilaiTugas(stack, sc);
                    break;
                case 3:
                    lihatTugasPalingAtas(stack);
                    break;
                case 4:
                    lihatDaftarTugas(stack);
                    break;
                case 5:
                    lihatTugasPertama(stack);
                    break;
                case 6:
                    hitungBanyakTugas(stack);
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (opt != 0);
    }
}
