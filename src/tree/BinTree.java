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
     * @param lChild 左子树
     */
    public void addLeftTree(BinTree lChild);
    /**
     * 添加右子树
     * @param rchild 右子树
     */
    public void addRightTree(BinTree rchild) ;
    /**
     * 置空树
     */
    public void clearTree();
    /**
     * 求树的深度
     * @return 树的深度
     */
    public int dept();
    /**
     * 求左孩子 结点
     * @return
     */
    public BinTree getLeftChild();

    /**
     * 求右孩子结点
     * @return
     */
    public BinTree getRightChild();
    /**
     * 获得根结点的数据
     * @return
     */
    public Object getRootData();
    /**
     * 是否有左子树
     * @return
     */
    public boolean hasLeftTree();
    /**
     * 是否有右子树
     * @return
     */
    public boolean hasRightTree();
    /**
     * 判断是否为空树
     * @return 如果为空，返回true,否则返回false
     */
    public boolean isEmpty();
    /**
     * 判断是否为叶子结点
     * @return
     */
    public boolean isLeaf();
    /**
     * 删除左子树
     */
    public void removeLeftChild();
    /**
     * 删除右子树
     */
    public void removeRightChild();
    /**
     * 获得树根
     * @return 树的根
     */
    public BinTree root();
    /**
     * 设置根结点的数据
     */
    public void setRootData(Object data);
    /**
     * 求结点数
     * @return 结点的个数
     */
    public int size();
}
