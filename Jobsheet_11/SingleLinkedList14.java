public class SingleLinkedList14 {
	NodeMahasiswa14 head;
	NodeMahasiswa14 tail;

	SingleLinkedList14() {

	}

	boolean isEmpty() {
		return (head == null);
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("Linked list kosong\n");
			return;
		}

		NodeMahasiswa14 tmp = this.head;

		System.out.println("Isi linked list:");
		while (tmp != null) {
			tmp.data.tampilInformasi();
			tmp = tmp.next;
		}

		System.out.println("");
	}

	public void addFirst(Mahasiswa14 input) {
		NodeMahasiswa14 ndInput = new NodeMahasiswa14(input, null);

		if (isEmpty()) {
			this.head = ndInput;
			this.tail = ndInput;
		} else {
			ndInput.next = this.head;
			this.head = ndInput;
		}
	}

	public void addLast(Mahasiswa14 input) {
		NodeMahasiswa14 ndInput = new NodeMahasiswa14(input, null);

		if (isEmpty()) {
			this.head = ndInput;
			this.tail = ndInput;
		} else {
			this.tail.next = ndInput;
			this.tail = ndInput;
		}
	}

	public void insertAfter(String key, Mahasiswa14 input) {
		NodeMahasiswa14 ndInput = new NodeMahasiswa14(input, null);
		NodeMahasiswa14 tmp = this.head;

		do {
			if (tmp.data.nama.equalsIgnoreCase(key)) {
				ndInput.next = tmp.next;
				tmp.next = ndInput;

				if (ndInput.next == null) {
					this.tail = ndInput;
				}

				break;
			}

			tmp = tmp.next;
		} while (tmp != null);
	}

	public void insertAt(int index, Mahasiswa14 input) {
		if (index < 0) {
			System.out.println("Indeks tidak valid!");
		} else if (index == 0) {
			addFirst(input);
		} else {
			NodeMahasiswa14 tmp = this.head;

			for (int i = 0; i < index - 1; i++) {
				tmp = tmp.next;
			}

			tmp.next = new NodeMahasiswa14(input, tmp.next);

			if (tmp.next.next == null) {
				this.tail = tmp.next;
			}
		}
	}

	public void getData(int index) {
		NodeMahasiswa14 tmp = this.head;

		for (int i = 0; i < index; i++) {
			tmp = tmp.next;
		}

		tmp.data.tampilInformasi();
	}

	public int indexOf(String key) {
		NodeMahasiswa14 tmp = this.head;
		int index = 0;

		while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
			tmp = tmp.next;
			index++;
		}

		if (tmp == null) {
			return -1;
		}

		return index;
	}

	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("Linked list masih kosong, tidak dapat dihapus!");
		} else if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}
	}
	
	public void removeLast() {
		if (isEmpty()) {
			System.out.println("Linked list masih kosong, tidak dapat dihapus!");
		} else if (head == tail) {
			head = tail = null;
		} else {
			NodeMahasiswa14 tmp = this.head;

			while (tmp.next != this.tail) {
				tmp = tmp.next;
			}

			tmp.next = null;
			this.tail = tmp;
		}
	}

	public void remove(String key) {
		if (isEmpty()) {
			System.out.println("Linked list masih kosong, tidak dapat dihapus!");
		} else {
			NodeMahasiswa14 tmp = this.head;
			
			while (tmp != null) {
				if (tmp.data.nama.equalsIgnoreCase(key)) {
					if (tmp == this.head) {
						this.removeFirst();
					} else {
						tmp.next = tmp.next.next;
						if (tmp.next == null) {
							this.tail = tmp;
						}
					}
					break;
				}

				tmp = tmp.next;
			}
		}
	}

	public void removeAt(int index) {
		if (index == 0) {
			removeFirst();
		} else {
			NodeMahasiswa14 tmp = head;

			for (int i = 0; i < index-1; i++) {
				tmp = tmp.next;
			}

			tmp.next = tmp.next.next;
			if (tmp.next == null) {
				this.tail = tmp;
			}
		}
	}
}
