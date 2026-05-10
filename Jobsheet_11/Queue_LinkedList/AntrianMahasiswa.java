public class AntrianMahasiswa {
	int size;
	int max;
	NodeMahasiswa front;
	NodeMahasiswa rear;

	AntrianMahasiswa(int max) {
		this.max = max;
		this.front = this.rear = null;
		this.size = 0;
	}

	boolean penuh() {
		return (this.size == this.max);
	}

	boolean kosong() {
		return (this.size == 0);
	}

	public void kosongkanAntrian() {
		this.front = this.rear = null;
		this.size = 0;

		System.out.println("[v] Antrian telah dikosongkan!");
	}

	public void tambahAntrian(Mahasiswa mhs) {
		if (penuh()) {
			System.out.println("[!] Antrian penuh!");
			return;
		}

		NodeMahasiswa newNode = new NodeMahasiswa(mhs, null);

		if (kosong()) {
			this.front = newNode;
			this.rear = newNode;
		} else {
			this.rear.next = newNode;
			this.rear = newNode;
		}

		this.size++;
		System.out.println("[+] Antrian telah ditambahkan!");
	}

	public Mahasiswa panggilAntrian() {
		if (kosong()) {
			System.out.println("[!] Antrian kosong!");
			return null;
		}

		Mahasiswa mhs = this.front.data;
		System.out.println("[.] Memanggil antrian: ");
		mhs.tampilInformasi();
		
		if (this.front == this.rear) {
			this.front = this.rear = null;
		} else {
			this.front = this.front.next;
		}
		
		this.size--;
		System.out.println("\n[v] Antrian telah diproses!");
		return mhs;
	}

	public void tampilkanAntrian() {
		if (kosong()) {
			System.out.println("[!] Antrian kosong!");
			return;
		}

		System.out.println("[+] Daftar Antrian:");

		NodeMahasiswa pointer = this.front;
		int i = 1;

		while (pointer != null) {
			System.out.printf(" %d) ", i);
			pointer.data.tampilInformasi();
			pointer = pointer.next;
			i++;
		}
	}

	public void lihatDepan() {
		if (kosong()) {
			System.out.println("[!] Antrian kosong!");
			return;
		}

		System.out.println("[+] Antrian paling depan: ");
		this.front.data.tampilInformasi();
	}

	public void lihatBelakang() {
		if (kosong()) {
			System.out.println("[!] Antrian kosong!");
			return;
		}

		System.out.println("[+] Antrian paling belakang: ");
		this.rear.data.tampilInformasi();
	}

	public int jumlahAntrian() {
		return this.size;
	}
}
