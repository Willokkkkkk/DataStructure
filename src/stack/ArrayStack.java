package stack;

/**
 * Created by panchaoliang on 2017/7/20.
 * data structure
 * stack
 * 2017/07/20
 */

import java.io.Serializable;
import java.util.Arrays;

/**
 * 顺序(堆)栈
 * 特别注意 top 是指在 最上方元素的 上面
 * @author Administrator
 *
 */
public class ArrayStack implements Stack,Serializable{
    private static int maxSize = 100;
    private int top;
    Object[]  array;

    public ArrayStack() {
        array = new Object[maxSize];
        top = 0 ;
    }

    @Override
    public void clear() {
        top =  0 ;
        Arrays.fill(array,null);
    }

    @Override
    public void push(Object obj) {
        if (size()==maxSize) {
            expand();
        }
        array[top] = obj; // 0 ,1 ,2 ...
        top++;
    }

    private void expand() {
        Object[] newArray = new Object[2 * maxSize];
        System.arraycopy(array,0,newArray,0,top);
        array = newArray;
    }

    @Override
    public Object pop() {
        if (size()== 0) {
            throw new RuntimeException("stack is empty.");
        }
        Object res = array[top-1];
        array[top - 1] = null;
        top --;
        return res;
    }

    @Override
    public boolean isEmpty() {
        return top==0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public Object peek() {
//        if (size()== 0) {
//            throw new RuntimeException("stack is empty.");
//        }
        return array[top - 1];// //if size == 0 ,maybe null
    }
}
