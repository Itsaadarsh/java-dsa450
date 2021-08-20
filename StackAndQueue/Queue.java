package StackAndQueue;

public class Queue {
    private int[] queueList;
    private int front, rear, max;

    public Queue(int size) {
        max = size;
        queueList = new int[size];
        front = rear = -1;
    }

    public void enqueue(int item) {
        if (rear == max - 1) {
            System.out.println("OVERFLOW");
            return;
        }

        if (front == -1) {
            front = 0;
        }
        queueList[++rear] = item;
    }

    public int dequeue() {
        return queueList[++front];
    }

    public int front() {
        return queueList[front];
    }

    public int rear() {
        return queueList[rear];
    }

    public void display() {
        for (int i = front; i < rear + 1; i++) {
            System.out.println(queueList[i]);
        }
    }

    public static void main(String[] args) {
        var queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();

    }
}
