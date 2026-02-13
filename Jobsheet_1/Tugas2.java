import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    static String[][] jadwal;
    static int current_index = 0;

    static void banner() {
        System.out.println("\n========= SISTEM MANAJEMEN JADWAL KULIAH =========");
        System.out.println("1. Tambah jadwal kuliah");
        System.out.println("2. Tampilkan jadwal kuliah");
        System.out.println("3. Tampilkan jadwal kuliah di hari tertentu");
        System.out.println("4. Cari jadwal kuliah berdasarkan nama");
        System.out.println("5. Exit");
        System.out.print("> ");
    }

    static boolean tambahData() {
        if (current_index >= jadwal.length) {
            System.out.printf("\n[!] Data mencapai batas maksimal (%d)\n\n", current_index);
            return false;
        }

        System.out.println("\n=============== TAMBAH DATA JADWAL ===============");

        System.out.print("Nama Matkul : ");
        jadwal[current_index][0] = sc.nextLine();
        
        System.out.print("Ruang : ");
        jadwal[current_index][1] = sc.nextLine();
        
        System.out.print("Hari : ");
        jadwal[current_index][2] = sc.nextLine();
        
        System.out.print("Mulai : ");
        String mulai = sc.nextLine();
        
        System.out.print("Selesai : ");
        String selesai = sc.nextLine();

        jadwal[current_index][3] = mulai+" - "+selesai;

        current_index++;

        System.out.printf("\n[+] Data berhasil ditambahkan, total data yang ada: %d\n\n", current_index);
        return true;
    }

    static void tampilData() {
        System.out.println("\n=============== TAMBAH DATA JADWAL ===============\n");

        System.out.println("┌────────────────────────────────┬──────────────────────┬──────────────┬─────────────────┐");
        System.out.printf("│ %-30s │ %-20s │ %-12s │ %-15s │\n", "Nama MK", "Ruang", "Hari Kuliah", "Jam Kuliah");
        for (String[] j : jadwal) {
            if (j[0] == null) continue;
            System.out.println("├────────────────────────────────┼──────────────────────┼──────────────┼─────────────────┤");
            System.out.printf("│ %-30s │ %-20s │ %-12s │ %-15s │\n", j[0], j[1], j[2], j[3]);
        }
        System.out.println("└────────────────────────────────┴──────────────────────┴──────────────┴─────────────────┘");

        System.out.printf("\n[i] Jumlah data: %d\n\n", current_index);
    }

    static void tampilJadwalBerdasarkanHari() {
        System.out.print("\nHari: ");
        String filter = sc.nextLine();

        System.out.printf("\n============== JADWAL DI HARI %s ==============\n\n", filter.toUpperCase());

        System.out.println("┌────────────────────────────────┬──────────────────────┬─────────────────┐");
        System.out.printf("│ %-30s │ %-20s │ %-15s │\n", "Nama MK", "Ruang", "Jam Kuliah");
        for (String[] j : jadwal) {
            if (j[0] == null || !filter.equalsIgnoreCase(j[2])) continue;
            System.out.println("├────────────────────────────────┼──────────────────────┼─────────────────┤");
            System.out.printf("│ %-30s │ %-20s │ %-15s │\n", j[0], j[1], j[3]);
        }
        System.out.println("└────────────────────────────────┴──────────────────────┴─────────────────┘");

        System.out.printf("\n[i] Jumlah data: %d\n\n", current_index);
    }

    static boolean cariMataKuliah() {
        System.out.print("\nNama MK: ");
        String filter = sc.nextLine();
        String[] data = null;

        for (String[] j : jadwal) {
            if (j[0].equalsIgnoreCase(filter)) {
                data = j;
                break;
            }
        }

        if (data == null) {
            System.out.printf("\n[!] Data \"%s\" tidak ditemukan!\n", filter);
            return false;
        }
        
        System.out.println("\n[i] Data ditemukan!\n");
        
        System.out.println("┌───────────────────┬────────────────────────────────┐");
        System.out.printf("│ %-15s : │ %-30s │\n", "Nama MK", data[0]);
        System.out.println("├───────────────────┼────────────────────────────────┤");
        System.out.printf("│ %-15s : │ %-30s │\n", "Ruang", data[1]);
        System.out.println("├───────────────────┼────────────────────────────────┤");
        System.out.printf("│ %-15s : │ %-30s │\n", "Hari", data[2]);
        System.out.println("├───────────────────┼────────────────────────────────┤");
        System.out.printf("│ %-15s : │ %-30s │\n", "Jam Kuliah", data[3]);
        System.out.println("└───────────────────┴────────────────────────────────┘");

        return true;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();

        jadwal = new String[n][4];
        
        while (true) {
            banner();
            n = sc.nextInt();
            sc.nextLine();
            
            if (n == 1) {
                tambahData();
            } else if (n == 2) {
                tampilData();
            } else if (n == 3) {
                tampilJadwalBerdasarkanHari();
            } else if (n == 4) {
                cariMataKuliah();
            } else if (n == 5) {
                System.out.println("Goodbye");
                break;
            } else  {
                System.out.println("Invalid input, try again!");
            }
        }
    }
}
