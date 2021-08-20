package StackAndQueue;

public class Stack {

    private int[] stackList;
    private int count;
    private int max;

    public Stack(int size) {
        count = -1;
        max = size;
        stackList = new int[size];
    }

    public void push(int item) {
        stackList[++count] = item;
    }

    public int pop() {
        return stackList[count--];
    }

    public int peak() {
        return stackList[count];
    }

    public boolean isEmpty() {
        return (count == -1);
    }

    public boolean isFull() {
        return (count == max - 1);
    }

    public void display() {
        for (int i = 0; i < count + 1; i++) {
            System.out.println(stackList[i]);
        }
    }

    public static void main(String[] args) {
        var stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.display();
        stack.push(0);
        System.out.println(stack.isFull());
    }
}
