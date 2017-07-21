package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panchaoliang on 2017/7/20.
 * data structure
 * tree  最普通的树的实现
 * 2017/07/20
 * 线性表是一头一尾 , 典型的一对一
 * 树，非线性结构的典型例子，不再是一对一，而变成了一对多（而图则可以是 多对多）
 * 树是一种递归结构
 * 1个根节点
 * 根节点生出多个孩子节点，每个孩子节点只有一个父节点，每个孩子节点又生出多个孩子
 * 父亲节点 (parent) 和孩子节点 (child) 是相对的
 * 没有孩子节点的节点成为叶子节点 (leaf)
 */
public class Tree {
    private Object data; //root data
    private List<Tree> childs;

    public Tree() {
        this.data = null;
        this.childs = new ArrayList<>();
        childs.clear();
    }

    public Tree(Object data) {
        this.data = data;
        this.childs = new ArrayList<>();
        childs.clear();
    }

    /**
     * 添加子树
     *
     * @param tree 子树
     */
    public void addNode(Tree tree) {
        childs.add(tree);
    }

    /**
     * 置空树
     */
    public void clearTree() {
        data = null;
        childs.clear();
    }


    /**
     * 返回递i个子树
     *
     * @param i
     * @return
     */
    public Tree getChild(int i) {
        return childs.get(i);
    }

    /**
     * 求第一个孩子 结点
     *
     * @return
     */
    public Tree getFirstChild() {
        return childs.get(0);
    }

    /**
     * 求最后 一个孩子结点
     *
     * @return
     */
    public Tree getLastChild() {
        return childs.get(childs.size() - 1);
    }

    /**
     * 获得根结点的数据
     *
     * @return
     */
    public Object getRootData() {
        return data;
    }

    /**
     * 判断是否为空树
     *
     * @return 如果为空，返回true,否则返回false
     */
    public boolean isEmpty() {
        return childs.size() == 0 && data == null;
    }

    /**
     * 判断是否为叶子结点
     *
     * @return
     */
    public boolean isLeaf() {
        return childs.size() == 0;
    }

    /**
     * 获得树根
     *
     * @return 树的根
     */
    public Tree root() {
        return this;
    }

    /**
     * 设置根结点的数据
     */
    public void setRootData(Object data) {
        this.data = data;
    }

    /**
     * 求树的深度  //todo 暂未实现
     *
     * @param tree
     * @return int
     */
    private int dept(Tree tree) {
        return Integer.parseInt(null);
    }

    /**
     * 求结点数
     * 这方法还有点问题，有待完善 //todo 暂未实现
     *
     * @param tree
     * @return
     */
    private int size(Tree tree) {
        return 0;
    }

}