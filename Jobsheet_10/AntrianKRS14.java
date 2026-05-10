public class AntrianKRS14 {
	Mahasiswa14[] data;
	int front;
	int rear;
	int size;
	int max;

	String subject;
	int completed;
	int target;

	AntrianKRS14(int max, int target, String namaDosen) {
		this.max = max;
		this.data = new Mahasiswa14[max];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
		this.target = target;
		this.subject = namaDosen;
	}

	boolean isFull() {
		return (this.size == this.max);
	}

	boolean isEmpty() {
		return (this.size == 0);
	}

	public void clear() {
		this.front = 0;
		this.rear = -1;
		this.size = 0;
		System.out.println("[-] Antrian berhasil dikosongkan!");
	}

	public void tambahAntrian(Mahasiswa14 mhs) {
		if (isFull()) {
			System.out.println("[!] Antrian penuh!");
			return;
		}
		
		this.rear = (this.rear + 1) % this.max;
		this.data[this.rear] = mhs;
		this.size++;

		System.out.println("[+] Antrian berhasil ditambahkan!");
	}

	public int memanggilAntrian() {
		if (isEmpty()) {
			System.out.println("[!] Antrian kosong!");
			return 0;
		}

		Mahasiswa14 mhs1 = this.data[this.front];
		Mahasiswa14 mhs2 = this.data[(this.front + 1) % this.max];
		
		System.out.println("[i] Memanggil antrian:");
		System.out.print(" 1. ");
		mhs1.tampilkanData();
		System.out.print(" 2. ");
		mhs2.tampilkanData();
		
		this.front = (this.front + 2) % this.max;
		this.size -= 2;

		if (this.completed < this.target) {
			this.completed += 2;
			System.out.println("\n[v] Antrian telah diproses!");
		} else {
			System.out.println("\n[v] Antrian telah diproses! (Dosen telah memenuhi target)");
		}
		
		return 2;
	}

	public void lihat2Terdepan() {
		if (isEmpty()) {
			System.out.println("[!] Antrian kosong!");
		} else {
			System.out.println("[i] Mahasiswa terdepan: ");

			Mahasiswa14 mhs1 = this.data[this.front];
			Mahasiswa14 mhs2 = this.data[(this.front + 1) % this.max];

			System.out.print(" 1. ");
			mhs1.tampilkanData();
			System.out.print(" 2. ");
			mhs2.tampilkanData();
		}
	}

	public void lihatAkhir() {
		if (isEmpty()) {
			System.out.println("[!] Antrian kosong!");
		} else {
			System.out.print("[i] Mahasiswa terakhir: ");
			this.data[this.rear].tampilkanData();
		}
	}

	public void lihatSemua() {
		int idx;

		if (isEmpty()) {
			System.out.println("[!] Antrian kosong!");
			return;
		}

		System.out.println("[i] Daftar Antrian KRS: ");

		for (int i = 0; i < this.size; i++) {
			idx = (this.front + i) % this.max;
			System.out.printf(" %d. ", (i+1));
			this.data[idx].tampilkanData();
		}
	}
	
	public int getJumlahAntrian() {
		return this.size;
	}

	public int getYangSudahDiproses() {
		return this.completed;
	}

	public int getYangBelumDiproses() {
		return this.target - this.completed;
	}
}
