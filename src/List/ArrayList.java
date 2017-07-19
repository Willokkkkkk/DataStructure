package List;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by panchaoliang on 2017/7/18.
 * shujujiegou
 * List
 * 2017/07/18
 */
public class ArrayList implements List,Serializable {

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
        if (size+1 > maxLen) {
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
        System.arraycopy(array, 0, newArray, 0, this.size);
        array = newArray;
    }

    @Override
    public void clear() {
//        Object[] newArray = new Object[size];
//        System.arraycopy(array, 0, newArray, 0, this.size);
//        array = newArray;
//        size = 0;
        //将数组全部填充为null
        Arrays.fill(array, null);
        //将元素个数改为0
        size = 0;
    }

    @Override
    public Object get(int i) {
        return (i >= 0 && i < size) ? array[i] : null;
    }

    @Override
    public int indexOf(Object e) {
        int i = 0;
        while (i < size && !array[i].equals(e)) {
            i++;//不相等 继续往后遍历
        }
        return i < size ? i : -1;
    }

    @Override
    public void insert(int i, Object e) {
        // 1  xxxxx
        // 2  xxx xx
        // 3  xxx0xx
        if (i >= size && i < 0) {
            throw new RuntimeException(" the index is error!");
        }
        if (i + 1 > maxLen) expand();
        System.arraycopy(array, i, array, i + 1, size - i);
        array[i] = e;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int lastIndexOf(Object e) {
        int i = size - 1;
        while (i > -1 && !array[i].equals(e)) {
            i--;//不相等 继续往前遍历
        }
        return i > -1 ? i : -1;
    }

    @Override
    public void remove(int i) {
        if (i < size || i >= 0) {
            if (size == i + 1) {  // if you wanna remove last number
                array[i] = null;
                size--;
            } else {
                System.arraycopy(array, i + 1, array, i, size - i);
                size--;
            }
        } else {
            throw new RuntimeException("the index is error!");
        }
    }

    @Override
    public void set(int i, Object e) {
        if (i < size) array[i] = e;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
