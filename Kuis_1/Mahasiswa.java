public class Mahasiswa {
    String nim;
    String nama;
    Buku[] bukuDipinjam;
    
    Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.bukuDipinjam = new Buku[2];
    }

    boolean tambahBuku(Buku buku) {
        boolean found = false;
        for (int i = 0; i < 2; i++) {
            if (this.bukuDipinjam[i] == null) {
                found = true;
                this.bukuDipinjam[i] = buku;
                break;
            }
        }
        return found;
    }

    boolean hapusBuku(String kode) {
        boolean found = false;
        for (int i = 0; i < 2; i++) {
            if (this.bukuDipinjam[i].kode.equalsIgnoreCase(kode)) {
                found = true;
                this.bukuDipinjam[i] = null;
                break;
            }
        }
        return found;
    }
}