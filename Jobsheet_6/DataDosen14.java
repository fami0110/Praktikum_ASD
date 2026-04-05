public class DataDosen14 {
	Dosen14 dataDosen[] = new Dosen14[10];
	int idx = 0;

	void tambah(Dosen14 d) {
		if (idx < dataDosen.length) {
			dataDosen[idx] = d;
			idx++;
		} else {
			System.out.println("data sudah penuh");
		}
	}

	void tampil() {
		for (Dosen14 d : dataDosen) {
			d.tampil();
			System.out.println("-------------------------");
		}
	}

	void sortingASC() {
		for (int i = 0; i < dataDosen.length - 1; i++) {
			for (int j = 1; j < dataDosen.length - i; j++) {
				if (dataDosen[j].usia < dataDosen[j - 1].usia) {
					Dosen14 tmp = dataDosen[j];
					dataDosen[j] = dataDosen[j - 1];
					dataDosen[j - 1] = tmp;
				}
			}
		}
	}

	void sortingDSC() {
		int idxMax;
		for (int i = 0; i < dataDosen.length - 1; i++) {
			idxMax = i;
			for (int j = i + 1; j < dataDosen.length; j++) {
				if (dataDosen[j].usia > dataDosen[idxMax].usia) {
					idxMax = j;
				}
			}
			Dosen14 tmp = dataDosen[idxMax];
			dataDosen[idxMax] = dataDosen[i];
			dataDosen[i] = tmp;
		}
	}

	void insertionSort() {
		for (int i = 1; i < dataDosen.length; i++) {
			Dosen14 temp = dataDosen[i];
			int j = i;
			while (j > 0 && dataDosen[j - 1].usia > temp.usia) {
				dataDosen[j] = dataDosen[j - 1];
				j--;
			}
			dataDosen[j] = temp;
		}
	}
}
