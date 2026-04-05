public class MahasiswaBerprestasi14 {
	Mahasiswa14[] listMhs = new Mahasiswa14[5];
	int idx;

	void tambah(Mahasiswa14 m) {
		if (idx < listMhs.length) {
			listMhs[idx] = m;
			idx++;
		} else {
			System.out.println("data sudah penuh");
		}
	}

	void tampil() {
		for (Mahasiswa14 m : listMhs) {
			m.tampilInformasi();
			System.out.println("-------------------------");
		}
	}

	void bubbleSort() {
		for (int i = 0; i < listMhs.length - 1; i++) {
			for (int j = 1; j < listMhs.length - i; j++) {
				if (listMhs[j].ipk > listMhs[j - 1].ipk) {
					Mahasiswa14 tmp = listMhs[j];
					listMhs[j] = listMhs[j - 1];
					listMhs[j - 1] = tmp;
				}
			}
		}
	}

	void selectionSort() {
		int idxmin;
		for (int i = 0; i < listMhs.length - 1; i++) {
			idxmin = i;
			for (int j = i + 1; j < listMhs.length; j++) {
				if (listMhs[j].ipk < listMhs[idxmin].ipk) {
					idxmin = j;
				}
			}
			Mahasiswa14 tmp = listMhs[idxmin];
			listMhs[idxmin] = listMhs[i];
			listMhs[i] = tmp;
		}
	}

	void insertionSort() {
		for (int i = 1; i < listMhs.length; i++) {
			Mahasiswa14 temp = listMhs[i];
			int j = i;
			while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
				listMhs[j] = listMhs[j-1];
				j--;
			}
			listMhs[j] = temp;
		}
	}
}