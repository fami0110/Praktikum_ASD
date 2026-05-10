public class Mahasiswa14 {
	String nim;
	String nama;
	String prodi;
	String kelas;

	Mahasiswa14(String nim, String nama, String prodi, String kelas) {
		this.nim = nim;
		this.nama = nama;
		this.prodi = prodi;
		this.kelas = kelas;
	}

	void tampilkanData() {
		System.out.printf("%s - %s - %s - %s\n",
			this.nim,
			this.nama,
			this.prodi,
			this.kelas
		);
	}
}
