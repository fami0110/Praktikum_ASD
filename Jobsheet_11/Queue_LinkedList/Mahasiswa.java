public class Mahasiswa {
	String nim;
	String nama;
	String kelas;
	String ukm;

	Mahasiswa(String nm, String name, String kls, String ukm) {
		this.nim = nm;
		this.nama = name;
		this.kelas = kls;
		this.ukm = ukm;
	}

	void tampilInformasi() {
		System.out.printf("%s • %s • %s • %s\n", 
			this.nama, 
			this.nim, 
			this.kelas, 
			this.ukm
		);
	}
	
}