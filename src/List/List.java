package List;

/**
 * Created by panchaoliang on 2017/7/18.
 * 线性表的adt
 * 2017/07/18
 * 线性表分为静态线性表和动态线性表，常见的有顺序表(静态的)、单向链表(动态的)和双向链表(动态的)。
 * 线性表的操作主要包括：
 （1）计算表的长度n。
 （2）线性表是否为空
 （3）将元素添加到线性表的末尾
 （4）获取第i个元素，0≤i < n。
 （5）清除线性表
 （6）返回列表中首次出现指定元素的索引，如果列表不包含此元素，则返回 -1。
 （7）返回列表中最后一次出现指定元素的索引，如果列表不包含此元素，则返回 -1。
 （8）将新元素插入第i个位置，0≤i < n，使原来的第i，i+1，…，n–1个元素变为第i+1，i+2，…，n个元素。
 （9）更改第i个元素
 （10）删除第i个元素，0≤i < n，使原来的第i+1，i+2，…，n–1个元素变为第i，i+1，…，n–2个元素
 */
 public interface List {
    /**
     * 将元素添加到线性表的末尾
     */
     void add(Object e);

    /**
     * 清除线性表
     */
     void clear();
    /**
     * 获取i位置的元素
     *
     * 
     */
     Object get(int i);
    /**
     * 返回列表中首次出现指定元素的索引，如果列表不包含此元素，则返回 -1。
     *
     * 
     */
     int indexOf(Object e);
    /**
     * 在i后面插入一个元素e
     *
     *
     */
     void insert(int i, Object e);
    /**
     * 判断线性表是否为空
     * 
     */
     boolean isEmpty();
    /**
     * 返回列表中最后出现指定元素的索引，如果列表不包含此元素，则返回 -1。
     *
     * 
     */
     int lastIndexOf(Object e);
    /**
     *  移除列表中指定位置的元素
     *
     */
     void remove(int i);
    /**
     * 用指定元素替换列表中指定位置的元素（可选操作）。
     *
     *
     */
     void set(int i, Object e);
    /**
     * 返回线性表的大小
     * 
     */
     int size();
}
