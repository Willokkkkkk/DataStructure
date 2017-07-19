package ListTest;

import List.*;

/**
 * Created by panchaoliang on 2017/7/19.
 * data structure
 * List
 * 2017/07/19
 */
public class ListTest {

    /**
     * 测试线性表
     * @param args
     */
    public static void main(String args[]) {
//        List list = new ArrayList();
        List list = new LinkList();
        //List list = new DoubleLinkList();
        for(int i=0; i<10; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
        list.remove(9);
        System.out.print("size;" + list.size() + "\n");
        System.out.println("isEmpty:" + list.isEmpty());
        System.out.print("第7个位置的元素：" + list.get(7) + "\n");
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + "    ");
        }
        System.out.println("size :"+list.size());
        list.add(21);
        list.add(22);
        list.insert(3, 5);
        System.out.println(list.toString());
        System.out.print("size:" + list.size() + "\n");
        System.out.print("第一次出现5的索引：" + list.indexOf(5) + "\n");
        System.out.print("最后一次出现5的索引：" + list.lastIndexOf(5) + "\n");
        list.set(0, 30);
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + "    ");
        }
    }
}