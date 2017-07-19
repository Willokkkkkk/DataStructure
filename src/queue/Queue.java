package queue;

/**
 * Created by panchaoliang on 2017/7/19.
 * data structure
 * queue
 * 2017/07/19
 */
public interface Queue {
    /**
     * 清空队列
     */
    public void clear();
    /**
     * 出队列
     * 
     */
    public Object deQueue();
    /**
     * 判断是否为空
     * 
     */
    public boolean isEmpty();
    /**
     * 取对头元素
     * 
     */
    public Object peek();
    /**
     * 入队列
     * @param obj
     */
    public void push(Object obj);
    /**
     * 元素的个数
     * 
     */
    public int size();
}
