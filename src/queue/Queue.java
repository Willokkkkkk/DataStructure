package queue;

/**
 * Created by panchaoliang on 2017/7/19.
 * data structure
 * queue
 * 2017/07/19
 * 队列是一种特殊的线性表，它只允许在表的前端（front）进行删除操作，而在表的后端（rear）进行插入操作。进行插入操作的端称为队尾，进行删除操作的端称为队头。队列中没有元素时，称为空队列。
 –队尾(rear)——允许插入的一端
 –队头(front)——允许删除的一端
 队列特点：先进先出(FIFO)
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
    public Object outQueue();
    /**
     * 判断是否为空
     * 
     */
    public boolean isEmpty();
    /**
     * 获取front对应的元素
     * 
     */
    public Object peek();
    /**
     * 入队列
     * @param obj
     */
    public void intoQueue(Object obj);
    /**
     * 元素的个数
     * 
     */
    public int size();
}
