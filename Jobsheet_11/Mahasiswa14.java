public class Mahasiswa14 {
	String nim;
	String nama;
	String kelas;
	double ipk;

	Mahasiswa14() {

	}

	Mahasiswa14(String nm, String name, String kls, double ip) {
		this.nim = nm;
		this.nama = name;
		this.kelas = kls;
		this.ipk = ip;
	}

	void tampilInformasi() {
		System.out.printf("%-20s %-20s %-15s %s\n", this.nama, this.nim, this.kelas, this.ipk);
	}
}