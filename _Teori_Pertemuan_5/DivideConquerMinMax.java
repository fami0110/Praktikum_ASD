public class DivideConquerMinMax {
    public static MinMax divideConquerMinMax(int[] A, int low, int high) {

        // Kasus Dasar 1: satu elemen
        if (low == high) {
            return new MinMax(A[low], A[low]);
        }

        // Kasus Dasar 2: dua elemen
        if (high == low + 1) {
            if (A[low] < A[high]) {
                return new MinMax(A[low], A[high]);
            } else {
                return new MinMax(A[high], A[low]);
            }
        }

        // Kasus Rekursif
        int mid = (low + high) / 2;

        // kiri
        MinMax left = divideConquerMinMax(A, low, mid);

        // kanan
        MinMax right = divideConquerMinMax(A, mid + 1, high);

        int finalMin = Math.min(left.min, right.min);
        int finalMax = Math.max(left.max, right.max);

        return new MinMax(finalMin, finalMax);
    }

    public static void main(String[] args) {

        int[] A = { 12, 5, 8, 20, 3, 15, 7 };

        MinMax result = divideConquerMinMax(A, 0, A.length - 1);

        System.out.println("Minimum: " + result.min);
        System.out.println("Maximum: " + result.max);
    }
}
