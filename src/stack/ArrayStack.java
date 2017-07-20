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
        array[top] = obj;
        top++;
    }

    private void expand() {
        maxSize *= 2;
    }

    @Override
    public Object pop() {
        return null;
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
        return null;
    }
}
