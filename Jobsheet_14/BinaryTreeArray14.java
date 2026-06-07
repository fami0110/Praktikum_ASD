public class BinaryTreeArray14 {
	Mahasiswa14[] dataMahasiswa;
	int idxLast;

	public BinaryTreeArray14() {
		this.dataMahasiswa = new Mahasiswa14[10];
	}

	void populateData(Mahasiswa14 dataMhs[], int idxLast) {
		this.dataMahasiswa = dataMhs;
		this.idxLast = idxLast;
	}

	public int add(Mahasiswa14 data) {
		if (this.idxLast == -1) {
			this.dataMahasiswa[0] = data;
			this.idxLast = 0;
			return 0;
		}

		int current = 0;

		while (true) {
			if (data.ipk < this.dataMahasiswa[current].ipk) {
				int leftChild = 2 * current + 1;
				current = leftChild;

				if (leftChild >= this.dataMahasiswa.length) {
					System.out.println("Array BST sudah penuh!");
					return -1;
				}
				if (this.dataMahasiswa[leftChild] == null) {
					this.dataMahasiswa[leftChild] = data;
					if (leftChild > this.idxLast)
						this.idxLast = leftChild;
					break;
				}
			} else {
				int rightChild = 2 * current + 2;
				current = rightChild;

				if (rightChild >= this.dataMahasiswa.length) {
					System.out.println("Array BST sudah penuh!");
					return -1;
				}

				if (this.dataMahasiswa[rightChild] == null) {
					this.dataMahasiswa[rightChild] = data;
					if (rightChild > this.idxLast)
						this.idxLast = rightChild;
					break;
				}
			}
		}

		return current;
	}

	void traverseInOrder(int idxStart) {
		if (idxStart <= idxLast) {
			if (dataMahasiswa[idxStart] != null) {
				traverseInOrder(2 * idxStart + 1);
				dataMahasiswa[idxStart].tampilInformasi();
				traverseInOrder(2 * idxStart + 2);
			}
		}
	}

	void traversePreOrder(int idxStart) {
		if (idxStart <= idxLast && idxStart < dataMahasiswa.length) {
			if (dataMahasiswa[idxStart] != null) {
				dataMahasiswa[idxStart].tampilInformasi();
				traversePreOrder(2 * idxStart + 1);
				traversePreOrder(2 * idxStart + 2);
			}
		}
	}
}