package stack;

/**
 * Created by panchaoliang on 2017/7/20.
 * data structure
 * stack
 * 2017/07/20
 * 栈是一种特殊的线性表，是操作受限的线性表
 * 栈的定义和特点
 •定义：限定仅在表尾进行插入或删除操作的线性表，
        表尾—栈顶，表头—栈底，不含元素的空表称空栈
 •特点：先进后出（FILO）或后进先出（LIFO）
 */
/**
 * (堆)栈
 * @author Administrator
 *
 */
public interface Stack {
    /**
     * 清空堆栈
     */
     void clear();
    /**
     * 入栈
     * @param obj 入栈的元素
     */
     void push(Object obj);
    /**
     * 出栈
     * @return 出栈的结果
     */
     Object pop();
    /**
     * 判断是否为空
     * @return
     */
     boolean isEmpty();
    /**
     * 求元素的个数
     * @return 元素的个数
     */
     int size();
    /**
     * 取栈顶元素
     * @return 栈顶元素
     */
     Object peek();

}  