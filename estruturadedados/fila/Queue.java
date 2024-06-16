package estruturadedados.fila;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;

        }

        public int getValue() {
            return this.value;
        }
    }

    Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length++;
    }

    public void getFirst() {
        if (first != null) {
            System.out.println("Primeiro: " + first.value);
        } else {
            System.out.println("Fila vazia.");
        }
    }

    public void getLast() {
        if (last != null) {
            System.out.println("Último: " + last.value);
        } else {
            System.out.println("Fila vazia.");
        }
    }

    public void getLength() {
        System.out.println("Tamanho: " + length);
    }

    public void print() {
        System.out.println("##################");
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("##################");
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if (length == 0) {
            System.out.println("Fila vazia.");
        }
        Node temp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(1);

        queue.getFirst();
        queue.getLast();
        queue.getLength();

        queue.print();

        queue.enqueue(2);
        queue.enqueue(3);

        queue.getFirst();
        queue.getLast();
        queue.getLength();
        queue.print();

        queue.dequeue();
        queue.print();
    }
}
