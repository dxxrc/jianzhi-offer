# jianzhi-offer
31天剑指Offer

## java中栈的实现

- ArrayDeque：底层基于数组实现，故随机访问元素性能较好
- LinkedList：底层基于链表实现，故插入、删除操作性能比较好

```java
class ListStack<T> {
    private LinkedList<T> ll = new LinkedList<>();
 
    //入栈
    public void push(T t) {
        ll.addFirst(t);
    }
 
    //出栈
    public T pop() {
        return ll.removeFirst();
    }
 
    //栈顶元素
    public T peek() {
        T t = null;
        //直接取元素会报异常，需要先判断是否为空
        if (!ll.isEmpty())
            t = ll.getFirst();
        return t;
    }
 
    //栈空
    public boolean isEmpty() {
        return ll.isEmpty();
    }
}
```

