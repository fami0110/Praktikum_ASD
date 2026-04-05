public class Dosen14 {
	String kode, nama;
	boolean jenisKelamin;
	int usia;

	Dosen14(String kd, String nm, boolean jk, int age) {
		this.kode = kd;
		this.nama = nm;
		this.jenisKelamin = jk;
		this.usia = age;
	}

	void tampil() {
		System.out.println("Kode          : " + this.kode);
		System.out.println("Nama          : " + this.nama);
		System.out.println("Jenis Kelamin : " + this.jenisKelamin);
		System.out.println("Usia          : " + this.usia);
	}
}
