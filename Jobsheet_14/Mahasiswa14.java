public class Mahasiswa14 {
	String nim;
	String nama;
	String kelas;
	double ipk;

	Mahasiswa14() {
	}

	Mahasiswa14(String nim, String nama, String kelas, double ipk) {
		this.nim = nim;
		this.nama = nama;
		this.kelas = kelas;
		this.ipk = ipk;
	}

	public void tampilInformasi() {
		System.out.printf("NIM   : %s\n", this.nim);
		System.out.printf("Nama  : %s\n", this.nama);
		System.out.printf("Kelas : %s\n", this.kelas);
		System.out.printf("IPK   : %.2f\n", this.ipk);
	}
}
