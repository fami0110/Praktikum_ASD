public class MahasiswaDemo14 {
	public static void main(String[] args) {
		MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14();
		Mahasiswa14 m1 = new Mahasiswa14("123", "Zidan", "2A", 3.2);
		Mahasiswa14 m2 = new Mahasiswa14("124", "Ayu", "2A", 3.5);
		Mahasiswa14 m3 = new Mahasiswa14("125", "Sofi", "2A", 3.1);
		Mahasiswa14 m4 = new Mahasiswa14("126", "Sita", "2A", 3.9);
		Mahasiswa14 m5 = new Mahasiswa14("127", "Miki", "2A", 3.7);

		list.tambah(m1);
		list.tambah(m2);
		list.tambah(m3);
		list.tambah(m4);
		list.tambah(m5);

		System.out.println("Data mahasiswa sebelum sorting: ");
		list.tampil();

		System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
		list.bubbleSort();
		list.tampil();
	}
}