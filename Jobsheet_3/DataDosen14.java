public class DataDosen14 {
    public static void dataSemuaDosen(Dosen14[] arrayOfDosen) {
        System.out.println("\n[i] Data Semua Dosen");
        
        System.out.println("┌──────────────┬───────────────────────────┬─────────────────┬───────┐");
        System.out.printf("│ %-12s │ %-25s │ %-15s │ %-5s │\n", "Kode", "Nama", "Jenis Kelamin", "Usia");
        for (Dosen14 dosen : arrayOfDosen) {
            System.out.println("├──────────────┼───────────────────────────┼─────────────────┼───────┤");
            System.out.printf("│ %-12s │ %-25s │ %-15s │ %-5d │\n", dosen.kode, dosen.nama, (dosen.jenisKelamin ? "Pria" : "Wanita"), dosen.usia);
        }
        System.out.println("└──────────────┴───────────────────────────┴─────────────────┴───────┘");
    }
    public static void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
        int jmlPria = 0;
        int jmlWanita = 0;

        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jmlPria++;
            } else {
                jmlWanita++;
            }
        }
        
        System.out.println("\n[i] Jumlah Dosen Berdasarkan Kelamin");

        System.out.println("┌─────────────────┬────────┐");
        System.out.printf("│ %-15s │ %-6s │\n", "Jenis Kelamin", "Jumlah");
        System.out.println("├─────────────────┼────────┤");
        System.out.printf("│ %-15s │ %-6d │\n", "Pria", jmlPria);
        System.out.println("├─────────────────┼────────┤");
        System.out.printf("│ %-15s │ %-6d │\n", "Wanita", jmlWanita);
        System.out.println("└─────────────────┴────────┘");
    }
    
    public static void rerataUsiaDosenPerJenisKelamin(Dosen14[] arrayOfDosen) {
        int jmlPria = 0, jmlWanita = 0;
        double avgPria = 0, avgWanita = 0;

        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jmlPria++;
                avgPria += dosen.usia;
            } else {
                jmlWanita++;
                avgWanita += dosen.usia;
            }
        }
        avgPria /= jmlPria;
        avgWanita /= jmlWanita;
        
        System.out.println("\n[i] Rerata Usia Dosen Berdasarkan Kelamin");

        System.out.println("┌─────────────────┬────────────┐");
        System.out.printf("│ %-15s │ %-10s │\n", "Jenis Kelamin", "Rata-rata");
        System.out.println("├─────────────────┼────────────┤");
        System.out.printf("│ %-15s │ %-10s │\n", "Pria", String.format("%.0f", avgPria) + " tahun");
        System.out.println("├─────────────────┼────────────┤");
        System.out.printf("│ %-15s │ %-10s │\n", "Wanita", String.format("%.0f", avgWanita) + " tahun");
        System.out.println("└─────────────────┴────────────┘");
    }

    public static void infoDosenPalingTua(Dosen14[] arrayOfDosen) {
        Dosen14 selectedDosen = arrayOfDosen[0];

        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.usia > selectedDosen.usia)
                selectedDosen = dosen;
        }

        System.out.println("\n[i] Info Dosen Paling Tua");

        System.out.println("┌──────────────┬───────────────────────────┬─────────────────┬───────┐");
        System.out.printf("│ %-12s │ %-25s │ %-15s │ %-5s │\n", "Kode", "Nama", "Jenis Kelamin", "Usia");
        System.out.println("├──────────────┼───────────────────────────┼─────────────────┼───────┤");
        System.out.printf("│ %-12s │ %-25s │ %-15s │ %-5d │\n", selectedDosen.kode, selectedDosen.nama, (selectedDosen.jenisKelamin ? "Pria" : "Wanita"), selectedDosen.usia);
        System.out.println("└──────────────┴───────────────────────────┴─────────────────┴───────┘");
    }

    public static void infoDosenPalingMuda(Dosen14[] arrayOfDosen) {
        Dosen14 selectedDosen = arrayOfDosen[0];

        for (Dosen14 dosen : arrayOfDosen) {
            if (dosen.usia < selectedDosen.usia)
                selectedDosen = dosen;
        }

        System.out.println("\n[i] Info Dosen Paling Muda");

        System.out.println("┌──────────────┬───────────────────────────┬─────────────────┬───────┐");
        System.out.printf("│ %-12s │ %-25s │ %-15s │ %-5s │\n", "Kode", "Nama", "Jenis Kelamin", "Usia");
        System.out.println("├──────────────┼───────────────────────────┼─────────────────┼───────┤");
        System.out.printf("│ %-12s │ %-25s │ %-15s │ %-5d │\n", selectedDosen.kode, selectedDosen.nama, (selectedDosen.jenisKelamin ? "Pria" : "Wanita"), selectedDosen.usia);
        System.out.println("└──────────────┴───────────────────────────┴─────────────────┴───────┘");
    }
}
