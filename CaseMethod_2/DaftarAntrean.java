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

		if (head == tail) { // Kondisi jika hanya 1 item
			head = tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}

		return tmp.data;
	}

	void cariPembeli(String nama) {
		NodeAntrean pointer = this.head;

		while (pointer != null) {
			if (pointer.data.namaPembeli.equalsIgnoreCase(nama)) {
				System.out.println("\n[+] Data ditemukan!");
				System.out.printf("\n%-12s %-20s %s\n", "No Antrian", "Nama", "No HP");
				System.out.printf("%-12s %-20s %s\n", 
					pointer.id, 
					pointer.data.namaPembeli, 
					pointer.data.noHp
				);
				return;
			}
			pointer = pointer.next;
		}

		System.out.println("\n[-] Pembeli tidak ditemukan");
	}

	void sortAntrian() {
		if (this.head == this.tail) return;

		// Insertion Sort (ASC)
		NodeAntrean i = this.head.next;

		while (i != null) {
			Pembeli currentData = i.data;
			NodeAntrean j = i.prev;
			
			while (j != null && currentData.namaPembeli.compareToIgnoreCase(j.data.namaPembeli) < 0) {
				j.next.data = j.data;
				j = j.prev;
			}
			
			if (j == null) {
				this.head.data = currentData;
			} else {
				j.next.data = currentData;
			}
			
			i = i.next;
		}
	}
}