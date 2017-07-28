package queue;


/**
 * Created by panchaoliang on 2017/7/20.
 * data structure
 * queueTest
 * 2017/07/20
 */
public class Test {

        /**
         * 测试队列
         * 测试结果：各项功能正确无误
         * @param args
         */
        public static void main(String[] args) {
            Queue queue = new LinkQueue();
//            Queue queue = new CircularQueue();
            for(int i=0; i<10; i++) {
                queue.enQueue(i);
            }
            System.out.println(queue);
            Object obj1 = queue.deQueue();
            Object obj2 = queue.deQueue();
            System.out.println("count:" + queue.size() + "  obj1:" + obj1 + "  obj2:" + obj2);
            System.out.println(queue);
            System.out.println("peek:" + queue.peek());
            //System.out.println(test.toString());

            for(int i=0; i<12; i++) {
                queue.enQueue(i+10);
            }
        }

}
