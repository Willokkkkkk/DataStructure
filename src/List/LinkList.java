package List;

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
}

/**
 * 带头结点的链式链表,下标从0开始;
 * @author Administrator
 *
 */
public class LinkList implements List {
    private Node headNode;  //头结点
    private int size;   //链表的大小

    public LinkList() {
        this.headNode = new Node();
        size = 0;
    }
    public LinkList(Object[] datas) {
        size = datas.length;
        for (int i = 0; i < size; i++) {

        }
    }
    @Override
    public void add(Object e) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void insert(int i, Object e) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int lastIndexOf(Object e) {
        return 0;
    }

    @Override
    public void remove(int i) {

    }

    @Override
    public void set(int i, Object e) {

    }

    @Override
    public int size() {
        return 0;
    }
}
