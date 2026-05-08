public class StackSurat14 {
    Surat14[] stack;
    int size;
    int top;

    StackSurat14(int size) {
        this.size = size;
        this.stack = new Surat14[size];
        this.top = -1;
    }

    boolean isFull() {
        return (this.top == this.size - 1);
    }

    boolean isEmpty() {
        return (this.top == -1);
    }

    Surat14 push(Surat14 mhs) {
        if (this.isFull()) {
            System.out.println("Stack Surat Penuh!");
            return null;
        }

        this.top++;
        this.stack[this.top] = mhs;
        return mhs;
    }

    Surat14 pop() {
        if (this.isEmpty()) {
            System.out.println("Stack Surat Kosong!");
            return null;
        }

        Surat14 m = this.stack[this.top];
        this.top--;
        return m;
    }

    Surat14 peek() {
        if (this.isEmpty()) {
            System.out.println("Stack Surat Kosong!");
            return null;
        }

        return this.stack[this.top];
    }

    Surat14 search(String namaMahasiswa) {
        for (int i = this.top; i >= 0; i--) {
            if (this.stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return this.stack[i];
            }
        }

        return null;
    }
}