package day1;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MinStack ms = new MinStack();

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.min();
        minStack.pop();
        minStack.top();
        minStack.min();
    }
}
