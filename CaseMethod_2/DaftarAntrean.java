public class DaftarAntrean {
	NodeAntrean head;
	NodeAntrean tail;
	int counter;

	DaftarAntrean() {
		this.head = null;
		this.tail = null;
		this.counter = 0;
	}

	boolean kosong() {
		return this.head == null;
	}

	int tambahAntrian(Pembeli data) {
		NodeAntrean newNode = new NodeAntrean(++this.counter, data);

		if (kosong()) {
			this.head = this.tail = newNode;
			return this.counter;
		}

		this.tail.next = newNode;
		newNode.prev = this.tail;
		this.tail = newNode;

		return this.counter;
	}

	void cetakAntrian() {
		if (kosong()) {
			System.out.println("[-] Antrian kosong!");
			return;
		}

		System.out.println("============================================");
		System.out.println("           Daftar Antrian Pembeli           ");
		System.out.println("============================================");
		System.out.printf("%-12s %-20s %s\n", "No Antrian", "Nama", "No HP");

		NodeAntrean pointer = this.head;
		
		while (pointer != null) {
			System.out.printf("%-12s %-20s %s\n", 
				pointer.id, 
				pointer.data.namaPembeli, 
				pointer.data.noHp
			);
			pointer = pointer.next;
		}
	}

	Pembeli hapusAntrean() {
		if (kosong()) {
			System.out.println("[-] Antrian kosong!");
			return null;
		}

		NodeAntrean tmp = this.head;

		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}

		return tmp.data;
	}
}
