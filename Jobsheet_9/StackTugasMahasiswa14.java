public class StackTugasMahasiswa14 {
    Mahasiswa14[] stack;
    int size;
    int top;

    StackTugasMahasiswa14(int size) {
        this.size = size;
        this.stack = new Mahasiswa14[size];
        this.top = -1;
    }

    boolean isFull() {
        return (this.top == this.size - 1);
    }

    boolean isEmpty() {
        return (this.top == -1);
    }

    void push(Mahasiswa14 mhs) {
        if (this.isFull()) {
            System.out.println("STACK PENUH WOIIII");
            return;
        }

        this.top++;
        this.stack[this.top] = mhs;
    }

    Mahasiswa14 pop() {
        if (this.isEmpty()) {
            System.out.println("STACK KOSONG WOIII");
            return null;
        }

        Mahasiswa14 m = this.stack[this.top];
        this.top--;
        return m;
    }

    Mahasiswa14 peek() {
        if (this.isEmpty()) {
            System.out.println("STACK KOSONG WOIII. GAADA TUGAS YANG DIKUMPULIN!!");
            return null;
        }

        return this.stack[this.top];
    }

    void print() {
        for (int i = this.top; i >= 0; i--) {
            System.out.printf(
                "nama: %s | nim: %s | kelas: %s\n", 
                this.stack[i].nama,
                this.stack[i].nim,
                this.stack[i].kelas
            );
        }
    }
}
