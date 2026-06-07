public class BinaryTree14 {
	Node14 root;

	BinaryTree14() {
		this.root = null;
	}

	boolean isEmpty() {
		return this.root == null;
	}

	public void add(Mahasiswa14 mahasiswa) {
		Node14 newNode = new Node14(mahasiswa);
		if (isEmpty()) {
			root = newNode;
		} else {
			Node14 current = root;
			Node14 parent = null;
			while (true) {
				parent = current;
				if (mahasiswa.ipk < current.mahasiswa.ipk) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public Node14 addRekursif(Mahasiswa14 mahasiswa, Node14 current) {
		if (current == null) {
			return new Node14(mahasiswa);
		}

		if (mahasiswa.ipk < current.mahasiswa.ipk) {
			current.left = addRekursif(mahasiswa, current.left);
		} else {
			current.right = addRekursif(mahasiswa, current.right);
		}

		return current;
	}

	public boolean find(double ipk) {
		boolean result = false;
		Node14 current = root;
		while (current != null) {
			if (current.mahasiswa.ipk == ipk) {
				result = true;
				break;
			} else if (ipk > current.mahasiswa.ipk) {
				current = current.right;
			} else {
				current = current.left;
			}
		}
		return result;
	}

	public void traversePreOrder(Node14 node) {
		if (node != null) {
			node.mahasiswa.tampilInformasi();
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	public void traverseInOrder(Node14 node) {
		if (node != null) {
			traverseInOrder(node.left);
			node.mahasiswa.tampilInformasi();
			traverseInOrder(node.right);
		}
	}

	public void traversePostOrder(Node14 node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			node.mahasiswa.tampilInformasi();
		}
	}

	public Node14 getSuccessor(Node14 del) {
		Node14 successor = del.right;
		Node14 successorParent = del;
		while (successor.left != null) {
			successorParent = successor;
			successor = successor.left;
		}
		if (successor != del.right) {
			successorParent.left = successor.right;
			successor.right = del.right;
		}
		return successor;
	}

	public void delete(double ipk) {
		if (isEmpty()) {
			System.out.println("Binary tree kosong");
			return;
		}
		Node14 parent = root;
		Node14 current = root;
		boolean isLeftChild = false;
		while (current != null) {
			if (current.mahasiswa.ipk == ipk) {
				break;
			} else if (ipk < current.mahasiswa.ipk) {
				parent = current;
				current = current.left;
				isLeftChild = true;
			} else if (ipk > current.mahasiswa.ipk) {
				parent = current;
				current = current.right;
				isLeftChild = false;
			}
		}

		if (current == null) {
			System.out.println("Data tidak ditemukan!");
			return;
		}

		if (current.left == null && current.right == null) {
			if (current == root) {
				root = null;
			} else if (isLeftChild) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		} else if (current.left == null) {
			if (current == root) {
				root = current.right;
			} else if (isLeftChild) {
				parent.left = current.right;
			} else {
				parent.right = current.right;
			}
		} else if (current.right == null) {
			if (current == root) {
				root = current.left;
			} else if (isLeftChild) {
				parent.left = current.left;
			} else {
				parent.right = current.left;
			}
		} else {
			Node14 successor = getSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.left = successor;
			} else {
				parent.right = successor;
			}
			successor.left = current.left;
		}
	}

}
