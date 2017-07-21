package tree;

/**
 * Created by panchaoliang on 2017/7/21.
 * data structure
 * tree
 * 最多有两棵子树的有序树，称为二叉树。二叉树是一种特殊的树。
 * 递归定义：二叉树是n(n>=0)个有限结点构成的集合。N=0称为空二叉树；n>0的二叉树由一个根结点和两互不相交的，分别称为左子树和右子树的二叉树构成。
 * 2017/07/21
 */
public interface BinTree {
    /**
     * 添加左子树
     *
     * @param lChild 左子树
     */
    void addLeftTree(BinTree lChild);

    /**
     * 添加右子树
     *
     * @param rchild 右子树
     */
    void addRightTree(BinTree rchild);

    /**
     * 置空树
     */
    void clearTree();

    /**
     * 求树的深度
     *
     * @return 树的深度
     */
    int dept();

    /**
     * 求左孩子 结点
     *
     * @return
     */
    BinTree getLeftChild();

    /**
     * 求右孩子结点
     *
     * @return
     */
    BinTree getRightChild();

    /**
     * 获得根结点的数据
     *
     * @return
     */
    Object getRootData();

    /**
     * 是否有左子树
     *
     * @return
     */
    boolean hasLeftTree();

    /**
     * 是否有右子树
     *
     * @return
     */
    boolean hasRightTree();

    /**
     * 判断是否为空树
     *
     * @return 如果为空，返回true,否则返回false
     */
    boolean isEmpty();

    /**
     * 判断是否为叶子结点
     *
     * @return
     */
    boolean isLeaf();

    /**
     * 删除左子树
     */
    void removeLeftChild();

    /**
     * 删除右子树
     */
    void removeRightChild();

    /**
     * 获得树根
     *
     * @return 树的根
     */
    BinTree root();

    /**
     * 设置根结点的数据
     */
    void setRootData(Object data);

    /**
     * 求结点数
     *
     * @return 结点的个数
     */
    int size();
}
