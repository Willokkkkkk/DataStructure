package recursion;

/**
 * Created by panchaoliang on 2017/7/20.
 * data structure
 * recursion
 * 2017/07/20
 * 概述
 * 程序调用自身的编程技巧称为递归（ recursion）。递归做为一种算法在程序设计语言中广泛应用。递归有直接递归和间接递归
 * •直接递归：函数在执行过程中调用本身。
 * •间接递归：函数在执行过程中调用其它函数再经过这些函数调用本身。
 * •递归算法有四个特性：
 * （1）必须有可最终达到的终止条件，否则程序将陷入无穷循环；
 * （2）子问题在规模上比原问题小，或更接近终止条件；
 * （3）子问题可通过再次递归调用求解或因满足终止条件而直接求解；
 * （4）子问题的解应能组合为整个问题的解
 */
public class recursion {
    /**
     * 汉诺塔问题
     * 汉诺塔问题是指有三根杆子A,B,C。C杆上有若干碟子，
     * 把所有碟子从A杆上移到C杆上，每次只能移动一个碟子，
     * 大的碟子不能叠在小的碟子上面。求最少要移动多少次？
     * 当n=1时：
     * Move  1  from  A  to  C
     * 当n=2时：
     * Move  1  from  A  to  B
     * Move  2  from  A  to  C
     * Move  1  from  B  to  C
     * 当n=3时：
     * Move  1  from  A  to  C
     * Move  2  from  A  to  B
     * Move  1  from  C  to  B
     * Move  3  from  A  to  C
     * Move  1  from  B  to  A
     * Move  2  from  B  to  C
     * Move  1  from  A  to  C
     */
    static StringBuffer str = new StringBuffer();
//TODO not understand

    /**
     * //汉诺塔问题
     *
     * @param n 盘子的个数
     * @param x 将要移动盘子柱子
     * @param y 要借用的柱子
     * @param z 要移动到的柱子
     * @return
     */
    public static String hanio(int n, Object x, Object y, Object z) {
        //String str ="";
        if (1 == n)
            str.append(move(x, n, z) + "\n");
        else {
            hanio(n - 1, x, z, y);
            str.append(move(x, n, z) + "\n");
            hanio(n - 1, y, x, z);
        }
        return str.toString();
    }

    private static String move(Object x, int n, Object y) {
        //System.out.println("Move  " + n + "  from  " + x + "  to  " + y);
        return "Move  " + n + "  from  " + x + "  to  " + y;
    }
    /**********************************************************************/
    /**
     * fibonacci数列
     * 斐波纳契数列，又称黄金分割数列，指的是这样一个数列：1、1、2、3、5、8、13、21、……
     * 在数学上，斐波纳契数列以如下被以递归的方法定义：F0=0，F1=1，Fn=F(n-1)+F(n-2)（n>=2，n∈N*）
     *
     * @param n
     * @return
     */
    public static long fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * 1加到n累加
     * 用递归实现从1加到n，即1+2+3+4+...+n。
     */
    public static long total(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + total(n - 1);
        }
    }

    /**
     * 数字塔问题
     * 用递归算法求解数字塔问题。
     * n=1时
     * 1
     * n=2时
     * 1
     * 2      2
     * n=3时
     * 1
     * 2      2
     * 3      3      3
     */
    public static String tourData(int n) {
        String str    ;
        if(1 == n) {
            str = rowData(1) + "\n";
            return str;
        }
        else {
            str = tourData(n-1) + rowData(n) + "\n";
        }
        return str;
    }

    private static String rowData(int n) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<n; i++) {
            str.append(n).append("      ");
        }
        return str.toString();
    }
}