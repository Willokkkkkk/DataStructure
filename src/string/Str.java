package string;

/**
 * <pre>
 * ProjectName:  data structure
 * PackageName:  string
 * CreateTime:   2017/07/28 17:01.
 * </pre>
 * Description:
 *
 * @author panchaoliang
 * @version Ver 1.0
 */
public interface Str extends Comparable {
    /**
     * 求字符串的升长度
     *
     * @return
     */
     int length();

    /**
     * 返回指定索引处的 char 值
     *
     * @param index char值的索引
     * @return 此字符串指定索引处的 char 值。第一个 char 值在索引 0 处。
     */
     char charAt(int index);

    /**
     * 返回指定字符在此字符串中第一次出现处的索引
     *
     * @param c 一个字符（Unicode 代码点）
     * @return 在该对象表示的字符序列中第一次出现该字符的索引，如果未出现该字符，则返回 -1
     */
     int indexOf(char c);

    /**
     * @param c    一个字符（Unicode 代码点）
     * @param from 开始搜索的索引
     * @return 在此对象表示的字符序列中第一次出现的大于或等于 fromIndex 的字符的索引，如果未出现该字符，则返回 -1
     */
     int indexOf(char c, int from);

    /**
     * 返回第一次出现的指定子字符串在此字符串中的索引
     *
     * @param str 任意字符串
     * @return 返回第一次出现的指定子字符串在此字符串中的索引；如果它不作为一个子字符串出现，则返回 -1
     */
     int indexOf(Str str);

    /**
     * 从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引
     *
     * @param str  要搜索的子字符串
     * @param from 开始搜索的索引位置
     * @return 从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引
     */
     int indexOf(Str str, int from);

    /**
     * 求子串
     *
     * @param strartIndex 开始处的索引（包括）
     * @return 返回一个从beginIndex到末尾的新字符串，它是此字符串的一个子字符串
     */
     Str substring(int strartIndex);

    /**
     * 求子串
     *
     * @param beginIndex 开始处的索引（包括）
     * @param endIndex   结束处的索引（不包括）
     * @return 返回一个从beginIndex到endIndex-1的新字符串，它是此字符串的一个子字符串
     */
     Str substring(int beginIndex, int endIndex);

    /**
     * 插入字符串
     *
     * @param posit
     * @param str
     * @return
     */
     Str insert(int posit, Str str);

    /**
     * 删除子串
     *
     * @return
     */
     Str delete(int begin, int end);

    /**
     * 替换子串
     *
     * @param target      要被替换的子串
     * @param replacement 要替换的子串
     * @return
     */
     Str replace(Str target, Str replacement);

    /**
     * 替换子串
     *
     * @param target      要被替换的子串
     * @param replacement 要替换的子串
     * @param from        开始查找的位置
     * @return
     */
     Str replace(Str target, Str replacement, int from);

    /**
     * 连接字符串
     *
     * @param str
     * @return
     */
     Str concat(Str str);

    /**
     * 转化成数组
     *
     * @return
     */
     char[] toCharArray();
}
