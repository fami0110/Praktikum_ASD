public class Soal_2 {
    public static void main(String[] args) {
        int rating[][] = {
            {4, 3, 4, 4},
            {1, 1, 2, 3},
            {1, 2, 3, 4},
        };

        double rataFilm[] = new double[rating[0].length];

        for (int i = 0; i < rating[0].length; i++) {
            rataFilm[i] = hitungRataFilm(rating, i);
            System.out.printf("Rata-rata film %d: %.2f\n", i+1, rataFilm[i]);
        }

        System.out.println();

        double rataPenonton[] = new double[rating.length];

        for (int i = 0; i < rating.length; i++) {
            rataPenonton[i] = hitungRataPenonton(rating, i);
            System.out.printf("Rata-rata penonton %d: %.2f\n", i+1, rataPenonton[i]);
        }

        System.out.printf("\n[+] Film dengan rata-rata tertinggi\n  - Film ke-%d\n", findMaxIndex(rataFilm)+1);
        System.out.printf("\n[+] Penonton dengan rata-rata tertinggi\n  - Penonton ke-%d\n", findMaxIndex(rataPenonton)+1);
    }
    
    public static double hitungRataFilm(int rating[][], int indeksFilm) {
        double total = 0;

        for (int[] penonton : rating) {
            total += penonton[indeksFilm];
        }
        
        return total / rating.length;   
    }

    public static double hitungRataPenonton(int rating[][], int indeksPenonton) {
        double total = 0;

        for (int film : rating[indeksPenonton]) {
            total += film;
        }
        
        return total / rating[indeksPenonton].length;  
    }

    public static int findMaxIndex(double rata[]) {
        int currentIndex = 0;

        for (int j = 0; j < rata.length; j++) {
            if (rata[j] > rata[currentIndex]) {
                currentIndex = j;
            }
        }

        return currentIndex;
    }
}
