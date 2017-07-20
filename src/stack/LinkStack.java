package stack;

import java.io.Serializable;

/**
 * Created by panchaoliang on 2017/7/20.
 * data structure
 * stack
 * 2017/07/20
 */
class Node {
    Object data; //数据元素
    Node nextNode;  //后驱结点

    public Node(Object data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node() {
        this(null);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}

/**
 * @Description: 链式(堆)栈
 * @author: panchaoliang
 */
public class LinkStack implements Stack, Serializable {
    private Node top;
    private int size;

    public LinkStack() {
        top = null;
        size = 0;
    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }

    @Override
    public void push(Object obj) {
        Node newNode = new Node(obj);
        if (size == 0) {
            top = newNode;
        } else {
            newNode.setNextNode(top);
            top = newNode;
        }
        size++;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("the stack is empty.");
        }
        Node res = top.getNextNode();

        Node p = top.getNextNode().getNextNode();
        top.getNextNode().setNextNode(null);
        top.setNextNode(p);

        return res.getData();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object peek() {
        return top.getData(); //if size == 0 ,maybe null
    }
}
