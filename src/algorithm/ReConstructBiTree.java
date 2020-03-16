package algorithm;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zxoho on 2020/3/4 0004
 * Description: 根据先序遍历和中序遍历数组构造二叉树
 * 运行时间：305ms
 * 占用内存：22504k
 */
public class ReConstructBiTree {
    public List<Integer> result = new ArrayList<>();

    public TreeNode function(int[] pre, int[] mid){
        if(pre == null || mid == null)
            return null;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<mid.length; i++)
            map.put(mid[i],i);
        return ConstructBiTree(pre, 0, pre.length-1, mid, 0, mid.length-1, map);

    }
    public TreeNode ConstructBiTree(int[] p, int pi, int pj, int[] n, int ni, int nj, HashMap<Integer,Integer> map){
        if(pi>pj)
            return null;
        TreeNode head = new TreeNode(p[pi]);
        int index = map.get(p[pi]);
        head.left = ConstructBiTree(p, pi+1, pi+index-ni, n, ni, index-1, map);
        head.right = ConstructBiTree(p, pi+index-ni+1, pj, n, index+1, nj, map);
        return head;

    }

    /*
    二叉树先序遍历
     */
    public List<Integer> preOrder(TreeNode node){
        if(node != null){
            result.add(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }
        return result;
    }

    /*
    后序遍历
    非递归
    使用栈
     */
    public List<Integer> postOrderStack(TreeNode root) {

        return result;
    }
}
