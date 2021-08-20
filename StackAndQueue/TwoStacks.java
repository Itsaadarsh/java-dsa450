package StackAndQueue;

class TwoStack {

    int size;
    int top1, top2;
    int arr[] = new int[100];

    TwoStack() {
        size = 100;
        top1 = -1;
        top2 = size;
    }
}

public class TwoStacks {
    void push1(int x, TwoStack sq) {
        sq.arr[++sq.top1] = x;
    }

    void push2(int x, TwoStack sq) {
        sq.arr[--sq.top2] = x;
    }

    int pop1(TwoStack sq) {
        if (sq.top1 == -1) {
            return -1;
        }
        return sq.arr[sq.top1--];
    }

    int pop2(TwoStack sq) {
        if (sq.top2 == sq.size) {
            return -1;
        }
        return sq.arr[sq.top2++];
    }

    public static void main(String[] args) {
        var sq = new TwoStack();
        var stack = new TwoStacks();
        stack.push1(1, sq);
        stack.push1(2, sq);
        stack.push2(11, sq);
        stack.push2(22, sq);
    }
}
