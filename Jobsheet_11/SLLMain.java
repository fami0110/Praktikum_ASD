import java.util.Scanner;

public class SLLMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SingleLinkedList14 sll = new SingleLinkedList14();
		
		Mahasiswa14 mhs[] = new Mahasiswa14[4];
		String nim, nama, kelas;
		double ipk;

		for (int i = 0; i < 4; i++) {
			System.out.println("==============================");
			System.out.println("Masukkan data mahasiswa ke-" + (i+1));
			System.out.print("Nama	: ");
			nama = sc.nextLine();
			System.out.print("NIM	: ");
			nim = sc.nextLine();
			System.out.print("Kelas	: ");
			kelas = sc.nextLine();
			System.out.print("IPK	: ");
			ipk = sc.nextDouble();
			sc.nextLine();
			mhs[i] = new Mahasiswa14(nim, nama, kelas, ipk);
		}

		System.out.println("");

		sll.print();
		sll.addFirst(mhs[3]);
		sll.print();
		sll.addLast(mhs[0]);
		sll.print();
		sll.insertAfter("Dirga", mhs[2]);
		sll.insertAt(2, mhs[1]);
		sll.print();
	}
}
