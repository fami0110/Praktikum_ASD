public class NilaiMahasiswa14 {
    int cariIndexUTSTertinggi(int[] nilaiUTS, int l, int r) {
        if (l == r) {
            return l;
        }

        int mid = (l + r) / 2;

        int idxKiri = cariIndexUTSTertinggi(nilaiUTS, l, mid);
        int idxKanan = cariIndexUTSTertinggi(nilaiUTS, mid + 1, r);

        if (nilaiUTS[idxKiri] > nilaiUTS[idxKanan]) {
            return idxKiri;
        } else {
            return idxKanan;
        }
    }

    int cariIndexUTSTerendah(int[] nilaiUTS, int l, int r) {
        if (l == r) {
            return l;
        }

        int mid = (l + r) / 2;

        int idxKiri = cariIndexUTSTerendah(nilaiUTS, l, mid);
        int idxKanan = cariIndexUTSTerendah(nilaiUTS, mid + 1, r);

        if (nilaiUTS[idxKiri] < nilaiUTS[idxKanan]) {
            return idxKiri;
        } else {
            return idxKanan;
        }
    }

    double hitungRataUAS(int[] nilaiUAS) {
        double total = 0;
        for (int nilai : nilaiUAS) {
            total += nilai;
        }
        return total / nilaiUAS.length;
    }
}
