public class DoubleLinkedList14 {
	Node14 head;
	Node14 tail;

	DoubleLinkedList14() {
		this.head = null;
		this.tail = null;
	}

	boolean isEmpty() {
		return this.head == null;
	}

	void addFirst(Mahasiswa14 data) {
		Node14 newNode = new Node14(data);

		if (isEmpty()) {
			head = tail = newNode;
			return;
		}

		newNode.next = this.head;
		this.head.prev = newNode;
		this.head = newNode;
	}

	void addLast(Mahasiswa14 data) {
		Node14 newNode = new Node14(data);

		if (isEmpty()) {
			head = tail = newNode;
			return;
		}

		this.tail.next = newNode;
		newNode.prev = this.tail;
		this.tail = newNode;
	}

	void insertAfter(String keyNim, Mahasiswa14 data) {
		Node14 current = this.head;

		while (current != null && !current.data.nim.equalsIgnoreCase(keyNim)) {
			current = current.next;
		}

		if (current == null) {
			System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
			return;
		}

		if (current == this.tail) {
			addLast(data);
		} else {
			Node14 newNode = new Node14(data);

			newNode.prev = current;
			newNode.next = current.next;
			current.next.prev = newNode;
			current.next = newNode;
		}
	}

	void print() {
		if (isEmpty()) {
			System.out.println("Linked List masih kosong!");
			return;
		}

		Node14 current = this.head;

		while (current != null) {
			current.data.tampil();
			current = current.next;
		}
	}

	void printReverse() {
		if (isEmpty()) {
			System.out.println("Linked List masih kosong!");
			return;
		}

		Node14 current = this.tail;

		while (current != null) {
			current.data.tampil();
			current = current.prev;
		}
	}

	void removeFirst() {
		if (isEmpty()) {
			System.out.println("Linked List kosong.");
			return;
		}

		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}
	}

	void removeLast() {
		if (isEmpty()) {
			System.out.println("Linked List kosong.");
			return;
		}

		if (head == tail) {
			head = tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
		}
	}

	void add(Mahasiswa14 data, int index) {
		return;
	}

	Mahasiswa14 search() {
		return null;
	}
}
