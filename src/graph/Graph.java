package graph;

/**
 * <pre>
 * ProjectName:  data structure
 * PackageName:  graph
 * CreateTime:   2017/07/28 13:08.
 * </pre>
 * Description:
 *  图(Graph)是一种比线性表和树更为复杂的数据结构。
 * @author panchaoliang
 * @version Ver 1.0
 */
/**
 * 图的接口 
 * @author luoweifu
 *
 */
public interface Graph {
    /**
     * 添加顶点 
     * @param v
     */
     void addVex(Object v);
    /**
     * 添加边 
     * @param v1 第一个顶点 
     * @param v2 第二个顶点 
     * @param weight 权值 
     */
     void addEdge(Object v1, Object v2, double weight);
    /**
     * 添加边 
     * @param v1 第一个顶点 
     * @param v2 第二个顶点 
     * @param info 边信息 
     * @param weight 权值 
     */
     void addEdge(Object v1, Object v2, Object info, double weight);
    /**
     * 置空图 
     */
     void clear();
    /**
     * 获得顶点v的第一个邻接结点 
     * @param v 顶点 
     * @return 顶点v的第一个邻接结点
     */
     Object getFirstVertex(Object v);
    /**
     * 在图G中寻找v1结点的邻接结点v2的下一个邻接结点 
     * @param v1 顶点 
     * @param v2 v1的一个邻接结点 
     * @return 邻接v1的在v2后的一个结点
     */
     Object getNextVertex(Object v1, Object v2);
    /**
     * 获得顶点的个数 
     * @return
     */
     int getVertexSize();
    /**
     *获得边的条数 
     * @return
     */
     int getEdgeSize();
    /**
     * 移除顶点 
     * @param v 顶点 
     */
     void removeVex(Object v);
    /**
     * 移除边 
     * @param v1 顶点1 
     * @param v2 顶点2 
     */
     void removeEdge(Object v1, Object v2);
    /**
     * 深度优先遍历 
     * @param o 遍历的初始顶点 
     * @return 遍历的结果
     */
     String dfs(Object o);
    /**
     * 深度优先遍历 
     * @param o 遍历的初始顶点 
     * @return 遍历的结果
     */
     String bfs(Object o);
    /**
     * 打印图的各顶点 
     * @return
     */
     String printGraph();
}  