package queue;

import java.io.Serializable;
/**
 * 链队列的结点
 * @author luoweifu
 *
 */
class Node{
    Object data;    //数据元素
    Node nextNode;      //后驱结点
    public Node() {
        this(null);
    }
    public Node(Object data) {
        this.data = data;
        this.nextNode = null;
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
 * Created by panchaoliang on 2017/7/19.
 * data structure
 * queue
 * 2017/07/19
 */
public class LinkQueue implements Queue,Serializable {
    private Node front,rear;    //队头指针和队尾指针
    private int size;

    public LinkQueue() {
        front = new Node();
        rear = front;
        size = 0;
    }

    @Override
    public void clear() {
        front.setNextNode(null);
        rear.setNextNode(null);
        front.setData(null);
        rear.setData(null);
        size = 0;
    }

    @Override
    public Object deQueue() {
        if(isEmpty()) throw new RuntimeException("the queue is empty!");
        front.setNextNode(front.getNextNode().getNextNode());
        size--;
        if (size<1)   rear = front;
        return front.getNextNode().getData();
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public Object peek() {
        if(isEmpty()) throw new RuntimeException("the queue is empty!");
        return front.getNextNode().getData();
    }

    @Override
    public void enQueue(Object obj) { //linkQueue can be added forever
        Node newNode = new Node(obj);
        rear.setNextNode(newNode);
        rear = newNode;
        size++;

    }

    @Override
    public int size() {
        return size;
    }
}
