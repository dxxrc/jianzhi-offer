package day1;

import java.util.LinkedList;

class MinStack {
    LinkedList<Integer> stackOne;
    LinkedList<Integer> stackTwo;
    
    /** initialize your data structure here. */
    public MinStack() {
        stackOne = new LinkedList<>();
        stackTwo = new LinkedList<>();
    }

    public void push(int x) {
        stackOne.addFirst(x);

        if (stackTwo.isEmpty() || x <= stackTwo.peekFirst())
        {
            stackTwo.addFirst(x);
        }
    }

    public void pop() {
        int e = stackOne.removeFirst();
        if (stackTwo.peekFirst() != null && stackTwo.peekFirst() == e)
        {
            stackTwo.removeFirst();
        }
    }

    public int top() {
        return stackOne.peekFirst();
    }

    public int min() {
        return stackTwo.peekFirst();
    }
}

