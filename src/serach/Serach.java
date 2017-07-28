package serach;

/**
 * <pre>
 * ProjectName:  data structure
 * PackageName:  serach
 * CreateTime:   2017/07/28 15:25.
 * </pre>
 * Description:  也叫检索，是根据给定的某个值，在表中确定一个关键字等于给定值的记录或数据元素
 *  顺序查找
 *  折半查找
 *  分块查找
 *  哈希查找
 *  二叉查找
 * @author panchaoliang
 * @version Ver 1.0
 */
public class Serach {
    /**
     * 顺序查找  比较简单从0开始找 , 也比较蠢
     *
     * @param s 要排序的数组
     * @param key 关键字
     * @return 查找到的下标
     */
    public static int arraySearch(int[] s,int key){
        for (int i = 0; i < s.length; i++) {
            if (s[i]==key) {
                return i;
            }
        }
        return -1;
    }
    /**
     * 折半查找
     l 查找过程：每次将待查记录所在区间缩小一半
     l 适用条件：必须采用顺序存储结构的有序表
     * 折半查找的非递归实现
     * @param s 要排序的数组
     * @param low 最低点
     * @param high 最高点
     * @param key 关键字
     * @return 查找到的下标
     */
    public static int binSearch(int[] s, int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = s[mid];
            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
