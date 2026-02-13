import java.util.Scanner;

public class Fungsi {
    public static void hitungDanRekap(int[][] data_penjualan, int[] harga_bunga) {
        int pendapatan;
        
        System.out.printf("%-15s %-15s %-20s\n", "Cabang", "Pendapatan", "Status");
        for (int i = 0; i < data_penjualan.length; i++) {
            pendapatan = 0;
            
            for (int j = 0; j < data_penjualan[i].length; j++) {
                pendapatan += (data_penjualan[i][j] * harga_bunga[j]);
            }

            System.out.printf("%-15s %-15s %-20s\n", 
                "RoyalGarden "+i, 
                "Rp "+String.format("%,d", pendapatan).replace(",", "."), 
                (pendapatan > 1_500_000) ? "Sangat Baik" : "Perlu Evaluasi"
            );
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] data_penjualan = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9},
        };
    
        int[] harga_bunga = {75_000, 50_000, 60_000, 10_000};

        hitungDanRekap(data_penjualan, harga_bunga);

        sc.close();
    }
}
