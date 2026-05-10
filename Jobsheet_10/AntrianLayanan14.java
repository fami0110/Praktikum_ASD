public class AntrianLayanan14 {
	Mahasiswa14[] data;
	int front;
	int rear;
	int size;
	int max;

	AntrianLayanan14(int n) {
		this.max = n;
		this.data = new Mahasiswa14[max];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	boolean isFull() {
		return (this.size == this.max);
	}

	boolean isEmpty() {
		return (this.size == 0);
	}

	public void tambahAntrian(Mahasiswa14 mhs) {
		if (isFull()) {
			System.out.println("Antrian penuh, tidak dapat menambah mahasiswa!");
			return;
		}
		
		this.rear = (this.rear + 1) % this.max;
		this.data[this.rear] = mhs;
		this.size++;

		System.out.println(mhs.nama + " berhasil masuk ke antrian!");
	}

	public Mahasiswa14 layaniMahasiswa() {
		if (isEmpty()) {
			System.out.println("Antrian kosong!");
			return null;
		}

		Mahasiswa14 mhs = this.data[this.front];
		this.front = (this.front + 1) % this.max;
		this.size--;

		return mhs;
	}

	public void lihatTerdepan() {
		if (isEmpty()) {
			System.out.println("Antrian kosong!");
		} else {
			System.out.println("Mahasiswa terdepan: ");
			this.data[this.front].tampilkanData();
		}
	}

	public void tampilkanSemua() {
		int idx;

		if (isEmpty()) {
			System.out.println("Antrian masih kosong!");
			return;
		}

		System.out.println("Daftar Mahasiswa dalam Antrian: ");

		for (int i = 0; i < this.size; i++) {
			idx = (this.front + i) % this.max;
			System.out.print((i+1) + ". ");
			this.data[idx].tampilkanData();
		}
	}
	
	public int getJumlahAntrian() {
		return this.size;
	}
}
