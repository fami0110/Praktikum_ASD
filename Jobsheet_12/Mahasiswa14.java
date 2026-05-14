public class Mahasiswa14 {
	String nim;
	String nama;
	String kelas;
	Double ipk;

	Mahasiswa14(String nim, String nama, String kelas, double IPK) {
		this.nim = nim;
		this.nama = nama;
		this.kelas = kelas;
		this.ipk = IPK;
	}

	void tampil() {
		System.out.println(
			"NIM : " + nim +
			"\nNama : " + nama +
			"\nKelas : " + kelas +
			"\nIPK : " + ipk
		);
	}
}