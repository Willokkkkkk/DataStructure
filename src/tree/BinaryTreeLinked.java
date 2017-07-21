package tree;

/**
 * Created by panchaoliang on 2017/7/21.
 * data structure
 * 二叉链表的实现
 * tree
 * 完全二叉树：叶节点只能出现在最下层和次下层，并且最下面一层的结点都集中在该层最左边的若干位置的二叉树
 * 2017/07/21
 */
public class BinaryTreeLinked implements BinTree {
    private Object data;
    private BinTree lChild;
    private BinTree rChild;

    public BinaryTreeLinked() {
        clearTree();
    }

    public BinaryTreeLinked(Object data) {
        this.data = data;
        this.lChild = null;
        this.rChild = null;
    }

    @Override
    public void addLeftTree(BinTree lChild) {
        this.lChild = lChild;
    }

    @Override
    public void addRightTree(BinTree rchild) {
        this.rChild = rchild;

    }

    @Override
    public void clearTree() {
        this.data = null;
        this.lChild = null;
        this.rChild = null;
    }

    @Override
    public int dept() {
        return dept(this);
    }

    private int dept(BinTree btree) {
        if (btree.isEmpty()) {
            return 0;
        } else if (btree.isLeaf()) {
            return 1;
        } else {
            if (!btree.hasLeftTree()) {
                return dept(btree.getRightChild()) + 1;
            } else if (!btree.hasRightTree()) {
                return dept(btree.getLeftChild()) + 1;
            } else {
                return Math.max(dept(btree.getLeftChild()), dept(btree.getRightChild()));
            }
        }
    }

    @Override
    public BinTree getLeftChild() {
        return lChild;
    }

    @Override
    public BinTree getRightChild() {
        return rChild;
    }

    @Override
    public Object getRootData() {
        return data;
    }

    @Override
    public boolean hasLeftTree() {

        return lChild.isEmpty();
    }

    @Override
    public boolean hasRightTree() {
        return rChild.isEmpty();
    }

    @Override
    public boolean isEmpty() {
        if ((lChild == null && rChild == null && data == null)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isLeaf() {
        return lChild == null && rChild == null;
    }

    @Override
    public void removeLeftChild() {
        lChild = null;
    }

    @Override
    public void removeRightChild() {
        rChild = null;
    }

    @Override
    public BinTree root() {
        return this;
    }

    @Override
    public void setRootData(Object data) {
        this.data = data;
    }

    @Override//求结点数
    public int size() {
        return size(this);
    }

    private int size(BinTree btree) {
        if (btree.isEmpty()) {
            return 0;
        } else if (btree.isLeaf()) {
            return 1;
        } else {
            if (btree.getLeftChild() == null) {
                return size(btree.getRightChild()) + 1;
            } else if (btree.getRightChild() == null) {
                return size(btree.getLeftChild()) + 1;
            } else {
                return size(btree.getLeftChild()) + size(btree.getRightChild()) + 1;
            }
        }
    }
    /***************************************order**********************************************/
    /**
     * 前序遍历 递归实现
     * 根 左 右
     *
     * @param root 根结点
     */
    public static void preOrder(BinTree root) {
        if (root.isEmpty()) {
            return;
        }
        System.out.print(root.getRootData() + "\t");

        if (root.getLeftChild() != null) {
            preOrder(root.getLeftChild());
        }

        if (root.getRightChild() != null) {
            preOrder(root.getRightChild());
        }
    }

    /**
     * 中序遍历  递归实现
     * 左 根 右
     *
     * @param root 根结点
     */
    public static void inOrder(BinTree root) {
        if (root.isEmpty()) {
            return;
        }
        if (root.getLeftChild() != null)
            inOrder(root.getLeftChild());

        System.out.print(root.getRootData() + "\t");

        if (root.getRightChild() != null) {
            inOrder(root.getRightChild());
        }
    }

    /**
     * 后序遍历 递归实现
     * 左 右 根
     *
     * @param root 根结点
     */
    public static void postOrder(BinTree root) {
        if (root.isEmpty()) {
            return;
        }
        if (root.getLeftChild() != null)
            postOrder(root.getLeftChild());

        if (root.getRightChild() != null)
            postOrder(root.getRightChild());

        System.out.print(root.getRootData() + "\t");
    }

    //递归算法简洁明了、可读性好，但与非递归算法相比要消耗更多的时间和存储空间。
    //
    public static void main(String[] args) {
        BinTree btree = new BinaryTreeLinked('A');
        BinTree bt1, bt2, bt3, bt4;
        bt1 = new BinaryTreeLinked('B');
        btree.addLeftTree(bt1);
        bt2 = new BinaryTreeLinked('D');
        bt1.addLeftTree(bt2);

        bt3 = new BinaryTreeLinked('C');
        btree.addRightTree(bt3);
        bt4 = new BinaryTreeLinked('E');
        bt3.addLeftTree(bt4);
        bt4 = new BinaryTreeLinked('F');
        bt3.addRightTree(bt4);

        System.out.println("树的深度：" + btree.dept());
        System.out.println("树的结点数：" + btree.size());
        System.out.println("是否为空树：" + btree.isEmpty());
        System.out.println("是否为叶子结点：" + btree.isLeaf());
        System.out.println("最左下边结点是否为叶子结点：" + btree.getRightChild().getRightChild().isLeaf());
        System.out.println("root结点：" + btree.root());


        System.out.println("\n前序遍历：");
        preOrder(btree);
        System.out.println("\n中序遍历：");
        inOrder(btree);
        System.out.println("\n后序遍历：");
        postOrder(btree);

        btree.removeLeftChild();
        System.out.println("\n删除左子树后中序遍历为：");
        inOrder(btree);
    }

}
