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

		int pendapatan = 0;
		NodePesanan pointer = this.head;
		
		while (pointer != null) {
			System.out.printf("%-15s %-20s %s\n", 
				pointer.data.kodePesanan, 
				pointer.data.namaPesanan, 
				String.format("Rp %,d", pointer.data.harga)
			);
			pendapatan += pointer.data.harga;
			pointer	= pointer.next;
		}

		System.out.printf("%36s %s\n", 
			"Total Pendapatan:   ", 
			String.format("Rp %,d", pendapatan)
		);
	}
}