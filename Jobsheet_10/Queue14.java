public class Queue14 {
	int[] data;
	int front;
	int rear;
	int size;
	int max;

	Queue14(int n) {
		this.max = n;
		this.data = new int[max];
		this.size = 0;
		this.front = this.rear = -1;
	}

	boolean isFull() {
		return (this.size == this.max);
	}

	boolean isEmpty() {
		return (this.size == 0);
	}

	void enqueue(int dt) {
		if (isFull()) {
			System.out.println("Queue sudah penuh!");
			return;
		}

		if (isEmpty()) {
			this.front = this.rear = 0;
		} else {
			this.rear = (this.rear + 1) % this.max;
		}

		this.data[this.rear] = dt;
		this.size++;
	}

	int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue masih kosong!");
			return 0;
		}

		int dt = this.data[this.front];
		this.size--;

		if (isEmpty()) {
			this.front = this.rear = -1;
		} else {
			this.front = (this.front + 1) % this.max;
		}

		return dt;
	}

	void peek() {
		if (!isEmpty()) {
			System.out.println("Elemen terdepan: " + this.data[this.front]);
		} else {
			System.out.println("Queue masih kosong!");
		}
	}

	void print() {
		if (isEmpty()) {
			System.out.println("Queue masih kosong!");
		} else {
			int i = this.front;

			while (i != this.rear) {
				System.out.print(this.data[i] + " ");
				i = (i + 1) % this.max;
			}

			System.out.println(this.data[i] + " ");
			System.out.println("Jumlah elemen = " + this.size);
		}
	}

	void clear() {
		if (!isEmpty()) {
			this.front = this.rear = -1;
			this.size = 0;

			System.out.println("Queue berhasil dikosongkan!");
		} else {
			System.out.println("Queue masih kosong!");
		}
	}
}
