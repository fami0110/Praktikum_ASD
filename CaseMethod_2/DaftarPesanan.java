public class DaftarPesanan {
	NodePesanan head;
	NodePesanan tail;

	DaftarPesanan() {
		this.head = null;
		this.tail = null;
	}

	boolean kosong() {
		return this.head == null;
	}

	void tambahPesanan(Pesanan data) {
		NodePesanan newNode = new NodePesanan(data);

		if (kosong()) {
			this.head = this.tail = newNode;
			return;
		}

		this.tail.next = newNode;
		newNode.prev = this.tail;
		this.tail = newNode;
	}

	void urutkanBerdasarkanNama() {
		if (this.head == this.tail) return;

		// Insertion Sort (ASC)
		NodePesanan i = this.head.next;

		while (i != null) {
			Pesanan currentData = i.data;
			NodePesanan j = i.prev;
			
			while (j != null && currentData.namaPesanan.compareToIgnoreCase(j.data.namaPesanan) < 0) {
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

	void laporanPesanan() {
		if (kosong()) {
			System.out.println("[-] Pesanan kosong!");
			return;
		}

		urutkanBerdasarkanNama();

		System.out.println("===========================================");
		System.out.println("    Laporan Pesanan (Urut Nama Pesanan)    ");
		System.out.println("===========================================");
		System.out.printf("%-15s %-20s %s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

		NodePesanan pointer = this.head;
		
		while (pointer != null) {
			System.out.printf("%-15s %-20s %s\n", 
				pointer.data.kodePesanan, 
				pointer.data.namaPesanan, 
				String.format("Rp %,d", pointer.data.harga)
			);
			pointer	= pointer.next;
		}
	}

	void hitungPendapatan() {
		int pendapatan = 0;
		NodePesanan pointer = this.head;
		
		while (pointer != null) {
			pendapatan += pointer.data.harga;
			pointer	= pointer.next;
		}

		System.out.printf("Total Pendapatan: Rp %,d\n", pendapatan);
	}

	void hapusPesanan(int kodePesanan) {
		if (kosong()) {
			System.out.println("\n[-] Antrian kosong!");
			return;
		}

		NodePesanan pointer = this.head;

		while (pointer != null) {
			if (pointer.data.kodePesanan == kodePesanan) break;
			pointer = pointer.next;
		}

		if (pointer == null) {
			System.out.println("\n[!] Kode pesanan tidak ditemukan");
			return;
		}
		
		if (pointer == this.head && pointer == this.tail) {
			this.head = null;
			this.tail = null;
		} else if (pointer == this.head) {
			this.head = pointer.next;
			this.head.prev = null;
		} else if (pointer == this.tail) { // Ini yang akan dijalankan
			this.tail = this.tail.prev;
			this.tail.next = null;
		} else {
			pointer.prev.next = pointer.next;
			pointer.next.prev = pointer.prev;
			pointer.next = null;
			pointer.prev = null;
		}
		
		System.out.printf("\n[-] Pesanan %d berhasil dihapus!\n", pointer.data.kodePesanan);
	}
}