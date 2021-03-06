package tree;

import com.sun.jmx.remote.internal.ArrayQueue;
import queue.CircularQueue;
import queue.Queue;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by panchaoliang on 2017/7/21.
 * data structure
 * 3叉链表实现的二叉树
 * 所畏的三叉链表示是指二叉树由指向左孩子结点、右孩子结点、父亲结点【三叉】的引用（指针）数据和数据组成。
 * * 所有的遍历都有 递归实现 和 非递归实现
 * tree
 * 2017/07/21
 */
public class BinaryTreeLinked2 implements Serializable {
    private Object data; // 数据域
    private BinaryTreeLinked2 parent; // 父节点
    private BinaryTreeLinked2 lChild; // 左孩子
    private BinaryTreeLinked2 rChild; // 右孩子
    private int height; // 以该节点为根的子树的高度
    private int size; // 该节点子孙数（包括结点本身）

    public BinaryTreeLinked2() {
        this(null);
    }

    public BinaryTreeLinked2(Object e) {
        data = e;
        height = 0;
        size = 1;
        parent = lChild = rChild = null;
    }
    //************ Node接口方法 *************/

    /**
     * 获得结点的数据
     */
    public Object getData() {
        return data;
    }

    public void setData(Object obj) {
        data = obj;
    }
    //-------------辅助方法，判断当前结点位置的情况------------

    /**
     * 判断是否有父亲
     */
    public boolean hasParent() {
        return parent != null;
    }

    /**
     * 判断是否有左孩子
     * 如果有左孩子结点返回true,否则返回false
     */
    public boolean hasLChild() {
        return null != lChild;
    }

    /**
     * 判断是否有右孩子
     */
    public boolean hasRChild() {
        return null != rChild;
    }

    /**
     * 判断是否为叶子结点
     */
    public boolean isLeaf() {
        return (!hasLChild() && !hasRChild());
    }

    /**
     * 判断是否为某节点的左孩子
     */
    public boolean isLChild() {
        return hasParent() && this == this.parent.lChild;
    }

    /**
     * 判断是否为某结点的右孩子
     */
    public boolean isRChild() {
        return (hasParent()) && this == this.parent.rChild;
    }
    //-------------- 与height相关的方法-----------------

    /**
     * 取结点的高度，即以该节点为根的树的高度
     *
     * @return
     */
    public int getHeight() {
        return height;
    }

    /**
     * 更新当前结点及其祖先的高度
     */
    public void updateHeight() {
        int newH = 0;// 新高度初始化为0，高度等于左右子树加1中的较大值
        if (hasLChild())
            newH = Math.max(newH, (lChild.getHeight() + 1));// //////////////???
        if (hasRChild())
            newH = Math.max(newH, (rChild.getHeight() + 1));// 先0和左孩子的高度加1进行比较，后左孩子高度加1和右孩子高度加1进行比较
        if (newH == height)
            return; // 高度没有发生变化则直接返回
        height = newH; // 否则，更新高度
        if (hasParent()) // 递归更新祖先的高度
            parent.updateHeight();
    }
    /********* 与size相关的方法 **********/
    /**
     * 取以该节点为根的树的结点数
     */
    public int getSize() {
        return size;
    }

    /**
     * 更新当前结点及祖先的子孙数
     */
    public void updateSize() {
        size = 1; // 初始化为1，结点本身
        if (hasLChild())
            size = size + lChild.getSize(); // 加上左子树的规模
        if (hasRChild())
            size = size + rChild.getSize(); // 加上右子树的规模
        if (hasParent())
            parent.updateSize();
    }
    /********** 与parent相关的方法 **********/
    /**
     * 取父节点
     */
    public BinaryTreeLinked2 getParent() {
        return parent;
    }

    /**
     * 断开与父亲的关系
     */
    public void sever() {
        if (!hasParent()) {
            return;
        }
        if (isLChild()) {
            parent.lChild = null;
        } else {
            parent.rChild = null;
        }
        parent.updateHeight();
        parent.updateSize();
        parent = null;
    }
    //********** 与lChild相关的方法 ********/

    /**
     * 取左孩子
     */
    public BinaryTreeLinked2 getLChild() {
        return lChild;
    }

    /**
     * 设置当前结点的左孩子，返回原左孩子
     *
     * @param lc
     */
    public BinaryTreeLinked2 setLChild(BinaryTreeLinked2 lc) {
        BinaryTreeLinked2 oldLC = this.lChild;
        if (hasLChild()) {
            lChild.sever();
        } // 断开当前左孩子与结点的关系
        if (null != lc) {
            lc.sever(); // 判断lc与其父节点的关系
            this.lChild = lc; // 确定父子关系
            lc.parent = this;
            this.updateHeight(); // 更新当前结点及其祖先的高度
            this.updateSize(); // 更新当前结点及其祖先的规模
        }
        return oldLC; // 返回原左孩子
    }
    //********** 与rChild相关的方法 *********/

    /**
     * 取右孩子
     */
    public BinaryTreeLinked2 getRChild() {
        return rChild;
    }

    /**
     * 设置当前结点为右孩子，返回原右孩子
     *
     * @param rc
     */
    public BinaryTreeLinked2 setRChild(BinaryTreeLinked2 rc) {
        BinaryTreeLinked2 oldRC = this.rChild;
        if (hasRChild()) {
            rChild.sever();
        } // 断开当前右孩子与结点的关系
        if (null != rc) {
            rc.sever(); // 断开rc与其父节点的关系
            this.rChild = rc; // 确定父子关系
            rc.parent = this;
            this.updateHeight(); // 更新当前结点及其祖先的高度
            this.updateSize(); // 更新当前结点及其祖先的规模
        }
        return oldRC; // 返回原右孩子
    }

    /**
     * 重写toString方法
     */
    public String toString() {
        return "" + data;
    }

    /********** 遍历的方法 **********/
    /**
     * 前序遍历
     *
     * @return 返回一个Iterator容器
     */
    public Iterator preOrder() {
        List<BinaryTreeLinked2> list = new LinkedList<>();
        preOrderRecursion(this.getParent(), list);
        return list.iterator();
    }

    private void preOrderRecursion(BinaryTreeLinked2 parent, List<BinaryTreeLinked2> list) {
        if (null == parent) {
            return; // 递归基，空树直接返回
        }
        list.add(parent);// 遍历根节点
        preOrderRecursion(parent.getLChild(), list);// 遍历左子树
        preOrderRecursion(parent.getRChild(), list);// 遍历右子树
    }

    /**
     * 中序遍历
     */
    public Iterator inOrder() {
        List<BinaryTreeLinked2> list = new LinkedList<>();
        inOrderRecursion(this.getParent(), list);
        return list.iterator();
    }

    private void inOrderRecursion(BinaryTreeLinked2 parent, List<BinaryTreeLinked2> list) {
        if (null == parent) {
            return; // 递归基，空树直接返回
        }
        preOrderRecursion(parent.getLChild(), list);// 遍历左子树
        list.add(parent);// 遍历根节点
        preOrderRecursion(parent.getRChild(), list);// 遍历右子树
    }

    /**
     * 后序遍历
     */
    public Iterator postOrder() {
        List<BinaryTreeLinked2> list = new LinkedList<>();
        postOrderRecursion(this.getParent(), list);
        return list.iterator();
    }

    private void postOrderRecursion(BinaryTreeLinked2 parent, List<BinaryTreeLinked2> list) {
        if (null == parent) {
            return; // 递归基，空树直接返回
        }
        preOrderRecursion(parent.getLChild(), list);// 遍历左子树
        preOrderRecursion(parent.getRChild(), list);// 遍历右子树
        list.add(parent);// 遍历根节点
    }

    /**
     * 按层遍历
     */
    private Iterator levelOrder() {
        List<BinaryTreeLinked2> list = new LinkedList();
        levelOrderTraverse(this.parent, list);
        return list.iterator();
    }

    private void levelOrderTraverse(BinaryTreeLinked2 parent, List<BinaryTreeLinked2> list) {
        if (null == parent)
            return;
        Queue q = new CircularQueue();
        q.enQueue(parent);// 根节点入队列
        while (!q.isEmpty()) {
            BinaryTreeLinked2 p = (BinaryTreeLinked2) q.deQueue(); // 取出队首节点p并访问
            list.add(p);
            if (p.hasLChild())
                q.enQueue(p.getLChild()); // 将p的非空左右孩子依次入队列
            if (p.hasRChild())
                q.enQueue(p.getRChild());
        }
    }

    public static void main(String[] args) {
        //构造二叉树
        BinaryTreeLinked2 roots = new BinaryTreeLinked2();
        BinaryTreeLinked2 node = new BinaryTreeLinked2();
        roots.setData('A');
        roots.setLChild(new BinaryTreeLinked2('B'));
        roots.setRChild(new BinaryTreeLinked2('C'));
        node = roots.getLChild();
        node.setLChild(new BinaryTreeLinked2('D'));
        node.setRChild(new BinaryTreeLinked2('E'));
        node = roots.getRChild();
        node.setLChild(new BinaryTreeLinked2('F'));

        //------遍历--------
        Iterator<BinaryTreeLinked2> iter1 = node.preOrder();
        System.out.print("前序遍历：");
        printIterator(iter1);

        Iterator<BinaryTreeLinked2> iter2 = node.inOrder();
        System.out.print("中序遍历：");
        printIterator(iter2);

        Iterator<BinaryTreeLinked2> iter3 = node.postOrder();
        System.out.print("后序遍历：");
        printIterator(iter3);

        Iterator<BinaryTreeLinked2> iter4 = node.levelOrder();
        System.out.print("层次遍历：");
        printIterator(iter4);

    }

    public static void printIterator(Iterator<BinaryTreeLinked2> iter) {
        while (iter.hasNext()) {
            System.out.print("\t" + iter.next().getData());
        }
        System.out.println();
    }
}
