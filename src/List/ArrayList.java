package List;

/**
 * Created by panchaoliang on 2017/7/18.
 * shujujiegou
 * List
 * 2017/07/18
 */
public class ArrayList implements List {

    public static final int defLen = 10;//初始化默认的最大长度
    private int maxLen;//最大长度
    private Object[] array;
    private int size;//大小

    public ArrayList() {
        size = 0;
        maxLen = defLen;
        array = new Object[defLen];
    }

    @Override
    public void add(Object e) {
        if (size > maxLen) {
            expand();
        }
        array[size] = e;
        size++;
    }

    /**
     * 当顺序表的大小不够时，扩充顺序表的大小
     */
    private void expand() {
        maxLen *= 2;
        Object[] newArray = new Object[maxLen];
        for(int i=0;i<this.size;i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public void clear() {

        size = 0;
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
