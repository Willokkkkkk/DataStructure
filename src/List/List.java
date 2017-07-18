package List;

/**
 * Created by panchaoliang on 2017/7/18.
 * shujujiegou
 * 线性表的adt
 * 2017/07/18
 */
 interface List {
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
     * @param i
     * @return
     */
     Object get(int i);
    /**
     * 返回列表中首次出现指定元素的索引，如果列表不包含此元素，则返回 -1。
     * @param e
     * @return
     */
     int indexOf(Object e);
    /**
     * 在i后面插入一个元素e
     * @param i
     * @param e
     */
     void insert(int i, Object e);
    /**
     * 判断线性表是否为空
     * @return
     */
     boolean isEmpty();
    /**
     * 回列表中最后出现指定元素的索引，如果列表不包含此元素，则返回 -1。
     * @param e
     * @return
     */
     int lastIndexOf(Object e);
    /**
     *  移除列表中指定位置的元素
     * @param i
     */
     void remove(int i);
    /**
     * 用指定元素替换列表中指定位置的元素（可选操作）。
     * @param i
     * @param e
     */
     void set(int i, Object e);
    /**
     * 返回线性表的大小
     * @return
     */
     int size();
}  
