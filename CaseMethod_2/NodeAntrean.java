public class NodeAntrean {
	int id;
	Pembeli data;
	NodeAntrean next;
	NodeAntrean prev;

	NodeAntrean(int id, Pembeli d) {
		this.id = id;
		this.data = d;
		this.next = null;
		this.prev = null;
	}
}
