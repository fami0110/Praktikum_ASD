public class MainNilaiMahasiswa14 {
    static String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
    static long[] nim = {220101001L, 220101002L, 220101003L, 220101004L, 220101005L, 220101006L, 220101007L, 220101008L};
    static int[] tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
    static int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
    static int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};
    
    static void tampilkanDataMhs(int index) {
        System.out.println("Nama        : " + nama[index]);
        System.out.println("NIM         : " + nim[index]);
        System.out.println("Tahun Masuk : " + tahunMasuk[index]);
        System.out.println("Nilai UTS   : " + nilaiUTS[index]);
        System.out.println("Nilai UAS   : " + nilaiUAS[index]);
    }

    public static void main(String[] args) {
        NilaiMahasiswa14 obj = new NilaiMahasiswa14();
        int idx_tertinggi, idx_terendah;
        double rataUAS; 

        idx_tertinggi = obj.cariIndexUTSTertinggi(nilaiUTS, 0, nilaiUTS.length-1);
        System.out.println("\nMahasiswa dengan nilai UTS tertinggi:");
        tampilkanDataMhs(idx_tertinggi);
        
        idx_terendah = obj.cariIndexUTSTerendah(nilaiUTS, 0, nilaiUTS.length-1);
        System.out.println("\nMahasiswa dengan nilai UTS terendah:");
        tampilkanDataMhs(idx_terendah);

        rataUAS = obj.hitungRataUAS(nilaiUAS);
        System.out.print("\nRata-rata nilai UAS: " + String.format("%.2f", rataUAS) + "\n");
    }
}
