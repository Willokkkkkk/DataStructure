package List;

import java.io.Serializable;

/**
 * Created by panchaoliang on 2017/7/18.
 * data structure
 * List
 * 2017/07/18
 */
class Node {

    private Object data;
    private Node nextNode;

    public Node() {
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
 * 带头结点的链式链表,下标从0开始;
 * 　链表（Chain本文所说链表均为单向链表，以下均简称单向链表）实际上是由节点（Node）组成的，一个链表拥有不定数量的节点。而向外暴露的只有一个头节点（Head），我们对链表的所有操作，都是直接或者间接地通过其头节点来进行的。

 　　节点（Node）是由一个需要储存的对象及对下一个节点的引用组成的。也就是说，节点拥有两个成员：储存的对象、对下一个节点的引用。
 * @author Administrator
 *
 */
public class LinkList implements List ,Serializable{
    Node headNode ;  //头结点
    private int size;    //链表的大小

    public LinkList() {
        this.headNode = new Node();
        size = 0;
    }
   /* public LinkList(Object[] datas) {
        size = datas.length;
        for (int i = 0; i < size; i++) {

        }
    }*/
    @Override
    public void add(Object e) {
        Node currentNode = this.headNode;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(new Node(e));
        size++;
    }

    @Override
    public void clear() {
        headNode.setNextNode(null);
        size=0;
    }

    @Override
    public Object get(int index) {
        Node res = index(index);
        return res.getData();
    }

    private Node index(int index) {
        // foreach
        Node res = null ;
        if (index < size && index >= 0) {
            res = headNode;
            for (int j = 0; j <= index; j++) {
                res = res.getNextNode();
            }
        } else {
            throw new RuntimeException("the index is error!");
        }
        return res;
    }

    @Override
    public int indexOf(Object e) {
        Node res = headNode;
        int index = 0;
        while (!e.equals(res.getData())) {
            res = res.getNextNode();
            index++;
        }
        if(index<size)
            return index;
        else
            return -1;
    }

    @Override
    public void insert(int index, Object e) {
        if (index >= this.size() || index<0) {
            throw new RuntimeException("the index is error !");
        }
        Node p = index(index);
        Node p2 = new Node(e);
        p.setNextNode(p2);
        p2.setNextNode(p.getNextNode());
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int lastIndexOf(Object e) {
        int index = size - 1;
        while (!get(index).equals(e)) {
            index--;
        }
        return index>=0?index:-1;
    }

    @Override
    public void remove(int i) {
        Node p1 = index(i-1);
        Node p2 = index(i);
        Node p3 = index(i+1);
        p1.setNextNode(p3);
        p2.setNextNode(null);
    }

    @Override
    public void set(int i, Object e) {
        Node p = index(i);
        p.setData(e);
    }

    @Override
    public int size() {
        return this.size;
    }
}
