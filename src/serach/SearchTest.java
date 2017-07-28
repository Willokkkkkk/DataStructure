package serach;

/**
 * <pre>
 * ProjectName:  data structure
 * PackageName:  serach
 * CreateTime:   2017/07/28 15:47.
 * </pre>
 * Description:
 *
 * @author panchaoliang
 * @version Ver 1.0
 */
public class SearchTest {
    public static void main(String[] args) {
        int[]  s  = {1,2,3,4,5,6,7};
        int res = Serach.binSearch(s, 0, 6, 3);
        System.out.println("折半查找:"+res);

        System.out.println("顺序查找:"+Serach.arraySearch(s,3));
    }
}
