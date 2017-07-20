package queue;

import java.io.Serializable;

/**
 * Created by panchaoliang on 2017/7/19.
 * data structure
 * queue
 * 顺序循环队列
 * 为充分利用向量空间，克服"假上溢"现象的方法是：将向量空间想象为一个首尾相接的圆环，
 * 并称这种向量为循环向量。存储在其中的队列称为循环队列（Circular Queue）。
 *
 * 循环队列中进行出队、入队操作时，头尾指针仍要加1，
 * 朝前移动。只不过当头尾指针指向向量上界（QueueSize-1）时，其加1操作的结果是指向向量的下界0。
 * 2017/07/19
 */
public class CircularQueue implements Queue,Serializable {
    private static  int  maxSize = 10;
    private Object[] array = null;
    private int front, rear, size; //队首，队尾标注和队列的大小

    public CircularQueue() {
        array = new Object[maxSize];
        front=rear=size= 0;
    }

    @Override
    public void clear() {
        for(int i=0; i<maxSize; i++) {
            array[i] = null;
        }
        front=rear=size= 0;
    }

    @Override
    public Object deQueue() {
        if (size == 0) {
            throw new RuntimeException("queue is empty.");
        }
        Object res = array[front];
        front = (front + 1) % maxSize;
        size--;
        return res;
    }

    @Override
    public boolean isEmpty() {
        return rear==front && size ==0;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty.");
        }
        return array[front];
    }

    @Override
    public void enQueue(Object obj) {
        if (size == 0) {
            throw new RuntimeException("queue is empty.");
        }
        rear = (rear+1)%maxSize;
        array[rear] = obj;
        size++;
    }

    @Override
    public int size() {
        return size;
    }
    @Override
    public String toString() {
        StringBuilder str= new StringBuilder("[");
        for(int i=0; i<size; i++) {
            str.append(array[(front + i) % maxSize]+",  ");
        }
        str.append("]");
        return str.toString();
    }
}
