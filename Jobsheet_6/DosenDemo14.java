public class DosenDemo14 {
	public static void main(String[] args) {
		System.out.println("SISTEM MANAJEMEN DATA DOSEN");

		DataDosen14 data = new DataDosen14();

		// 1. Menambahkan data dosen
		data.tambah(new Dosen14("D01", "Dr. Zidan", true, 45));
		data.tambah(new Dosen14("D02", "Ayu, M.Kom", false, 30));
		data.tambah(new Dosen14("D03", "Sofi, Ph.D", false, 35));
		data.tambah(new Dosen14("D04", "Sita, M.T", false, 28));
		data.tambah(new Dosen14("D05", "Miki, M.Sc", true, 40));
		data.tambah(new Dosen14("D06", "Dr. Aris", true, 52));
		data.tambah(new Dosen14("D07", "Lina, M.T", false, 29));
		data.tambah(new Dosen14("D08", "Budi, Ph.D", true, 48));
		data.tambah(new Dosen14("D09", "Sari, M.Kom", false, 33));
		data.tambah(new Dosen14("D10", "Eko, M.Sc", true, 37));

		System.out.println("\nData dosen sebelum sorting:\n");
		data.tampil();

		System.out.println("\nData dosen setelah sorting berdasarkan USIA (ASC):\n");
		data.sortingASC();
		data.tampil();

		System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (DSC):\n");
		data.sortingDSC();
		data.tampil();

		System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC)\n");
		data.insertionSort();
		data.tampil();
	}
}
