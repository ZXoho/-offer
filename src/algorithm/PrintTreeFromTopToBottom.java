package algorithm;

import DataStructure.TreeNode;

import java.util.*;

/**
 * Created by zxoho on 2020/3/10 0010
 * Description:从上往下打印出二叉树的每个节点，同层节点从左至右打印
 * 层次遍历
 */
public class PrintTreeFromTopToBottom {

    public ArrayList<Integer> function1(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            TreeNode temp = nodes.remove();
            result.add(temp.val);
            if(temp.left != null){
                nodes.add(temp.left);
            }
            if(temp.right !=null){
                nodes.add(temp.right);
            }
        }
        return result;
    }

}
