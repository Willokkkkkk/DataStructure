package List;

import java.io.Serializable;

/**
 * Created by panchaoliang on 2017/7/19.
 * data structure
 * List
 * 2017/07/19
 */
class DlNode {
    Object data;
    DlNode nextNode,priorNode;
    public DlNode() {
        this(null);
    }
    public DlNode(Object data) {
        this.setData(data);   //数据元素
        this.setPriorNode(null);  //前驱结点
        this.setNextNode(null);   //后驱结点
    }
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public DlNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DlNode nextNode) {
        this.nextNode = nextNode;
    }

    public DlNode getPriorNode() {
        return priorNode;
    }

    public void setPriorNode(DlNode priorNode) {
        this.priorNode = priorNode;
    }
}
public class DoubleLinkList implements List,Serializable {
    private int size;
    DlNode headNode;
    public DoubleLinkList(){
        size =0;
        headNode = new DlNode();
        headNode.setNextNode(headNode);// this is a empty linkList.
        headNode.setPriorNode(headNode);
    }
//    public DoubleLinkList(Object[] datas) {
//
//    }
    @Override
    public void add(Object e) {
        DlNode p,p2 = new DlNode();   // p2 is a new Node.      p  p2  headNode
       p = size==0?headNode:index(size-1) ;
       p2.setData(e);
       p2.setNextNode(headNode);
       p2.setPriorNode(p);
       p.setNextNode(p2);
       headNode.setPriorNode(p2);
    }

    private DlNode index(int i) {
        DlNode p = null;
        if (i >= 0 && i < size) {
            p = headNode;
            for (int j = 0; j <= i; j++) {
                p = p.getNextNode();
            }
        } else {
            throw new RuntimeException("the index is error!");
        }
        return p;
    }

    @Override
    public void clear() {
        headNode.setPriorNode(headNode);
        headNode.setNextNode(headNode);
        size=0;
    }

    @Override
    public Object get(int index) {
        return index(index).getData();
    }

    @Override
    public int indexOf(Object e) {
        DlNode p = headNode;
        int index = 0;
        while (!e.equals(p.getData())) {
            p = p.getNextNode();
            index++;
            if (index>=size) {
                index = -1;
                break;      // not forever.
            }
        }
        return index<size?index:-1;
    }

    @Override
    public void insert(int i, Object e) {
        DlNode p = index(i);
        DlNode p1 = new DlNode(e);
        p1.setNextNode(p.getNextNode());
        p1.setPriorNode(p);
        p.setNextNode(p1);
        p.getNextNode().setPriorNode(p1);
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int lastIndexOf(Object e) {
        DlNode p = headNode.getPriorNode();
        int index = size-1;
        while (!e.equals(p.getData())) {
            p = p.getPriorNode();
            index--;
            if (index<0) {
                index = -1;
                break;      // not forever.
            }
        }
        return index<size?index:-1;
    }

    @Override
    public void remove(int i) {
        DlNode p2 = index(i);
        DlNode priorNode = p2.getPriorNode();
        DlNode nextNode = p2.getNextNode();
        priorNode.setNextNode(nextNode);
        nextNode.setPriorNode(priorNode);
        p2.setPriorNode(null);
        p2.setNextNode(null);
        size--;
    }

    @Override
    public void set(int i, Object e) {
        DlNode p = index(i);
        p.setData(e);
    }

    @Override
    public int size() {
        return size;
    }
}
