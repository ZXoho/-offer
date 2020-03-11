package algorithm;

import DataStructure.TreeNode;

import java.util.ArrayList;

/**
 * Created by zxoho on 2020/3/11 0011
 * Description:输入一颗二叉树的根节点和一个整数
 * 打印出二叉树中结点值的和为输入整数的所有路径
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径
 */
public class FindPath {

    private ArrayList<Integer> list = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> allList = new ArrayList<>();

    public ArrayList function(TreeNode root, int target){
        if(root == null)
            return allList;
        list.add(root.val);
        target -= root.val;
        if(target==0 && root.right==null && root.left==null)
            allList.add(list);
        function(root.left, target);
        function(root.right, target);
        list.remove(list.size()-1);
        return allList;
    }

}
