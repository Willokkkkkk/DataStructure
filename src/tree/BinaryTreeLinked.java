package tree;

/**
 * Created by panchaoliang on 2017/7/21.
 * data structure
 * 二叉链表的实现
 * tree
 * 2017/07/21
 */
public class BinaryTreeLinked implements BinTree {
    private Object data;
    private BinTree lChild;
    private BinTree rChild;

    public BinaryTreeLinked() {
        this.data = null;
        this.lChild = null;
        this.rChild = null;
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
            if (!btree.hasLeftTree()) {
                return size(btree.getRightChild()) + 1;
            }
            if (!btree.hasRightTree()) {
                return size(btree.getLeftChild()) + 1;
            } else {
                return size(btree.getRightChild()) + size(btree.getLeftChild()) + 1;
            }
        }
    }
    /***************************************order**********************************************/

}
