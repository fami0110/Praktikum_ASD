public class StackKonversi14 {
    int[] tumpukanBiner;
    int size;
    int top;

    StackKonversi14() {
        this.size = 100;
        this.tumpukanBiner = new int[this.size];
        this.top = -1;
    }
    
    boolean isEmpty() {
        return this.top == -1;
    }

    boolean isFull() {
        return this.top == this.size - 1;
    }

    void push(int data) {
        if (this.isFull()) {
            System.out.println("Stack Biner Penuh Hehe");
            return;
        }

        this.top++;
        this.tumpukanBiner[this.top] = data;
    }

    int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack Biner Kosong Hehe");
            return -1;
        }

        int data = this.tumpukanBiner[this.top];
        this.top--;
        return data;
    }
}
