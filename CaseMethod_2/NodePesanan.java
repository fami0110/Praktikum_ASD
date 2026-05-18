public class NodePesanan {
	Pesanan data;
	NodePesanan next;
	NodePesanan prev;
	
	NodePesanan(Pesanan d) {
		this.data = d;
		this.next = null;
		this.prev = null;
	}
}
