import java.util.Scanner;

public class Perulangan {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input NIM: ");
        long n = sc.nextLong() % 100;

        if (n < 10) n += 10;

        System.out.println("\nn = " + n);
        System.out.println();

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            } else if ((i % 3) == 0) {
                System.out.print("# ");
            } else if ((i % 2) != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i+" ");
            }
        }
    }   
}
