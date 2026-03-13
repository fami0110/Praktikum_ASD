public class DivideConquerFib {
    public static long calculateFibonacci(int n) {
        // Kasus Dasar (Base Case)
        if (n <= 1) {
            return n;
        }

        // Divide: Memecah n menjadi (n-1) dan (n-2)
        // Conquer: Menyelesaikan secara rekursif
        // Combine: Menjumlahkan hasil dari kedua cabang
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Divide and Conquer Fibonacci ke-" + n + ": " + calculateFibonacci(n));
    }
}
