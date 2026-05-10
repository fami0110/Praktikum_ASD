import java.util.Scanner;

public class QueueMain14 {
	public static void menu() {
		System.out.println("\nMasukkan operasi yang diinginkan:");
		System.out.println("1. Enqueue");
		System.out.println("2. Dequeue");
		System.out.println("3. Print");
		System.out.println("4. Peak");
		System.out.println("5. Clear");
		System.out.println("0. Keluar");
		System.out.println("--------------------------------");
		System.out.print("> ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pilih, tmp;

		System.out.print("Masukkan kapasitas queue: ");
		int n = sc.nextInt();

		Queue14 Q = new Queue14(n);

		do {
			menu();
			pilih = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (pilih) {
				case 1:
					System.out.print("Masukkan data baru: ");
					tmp = sc.nextInt();
					sc.nextLine();

					Q.enqueue(tmp);

					break;
				case 2:
					tmp = Q.dequeue();

					if (tmp != 0) 
						System.out.println("data yang dikeluarkan: " + tmp);

					break;
				case 3:
					Q.print();
					break;
				case 4:
					Q.peek();
					break;
				case 5:
					Q.clear();
					break;
				case 0:
					System.out.println("Keluar...");
					break;
				default:
					System.out.println("Pilihan tidak valid. Coba lagi!");
					break;
			}
		} while (pilih != 0);
	}
}
