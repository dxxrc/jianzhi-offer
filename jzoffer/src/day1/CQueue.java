package day1;

import java.util.LinkedList;

// CQueue类
class CQueue {
    // 用两个栈实现CQueue队列
    LinkedList<Integer> stackOne;
    LinkedList<Integer> stackTwo;

    // CQueue构造器，构造两个栈
    public CQueue() {
        stackOne = new LinkedList<>();
        stackTwo = new LinkedList<>();
    }

    public void appendTail(int value) {
        stackOne.addFirst(value);
    }

    public int deleteHead() {
        if (stackTwo.isEmpty())
        {
            if (stackOne.isEmpty())
            {
                return -1;
            }
            while (!stackOne.isEmpty())
            {
                stackTwo.addFirst(stackOne.removeFirst());
            }
        }
        return stackTwo.removeFirst();
    }
}