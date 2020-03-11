package algorithm;

import DataStructure.TreeNode;

/**
 * Created by zxoho on 2020/3/9 0009
 * Description:输入两棵二叉树A，B，判断B是不是A的子结构。（ps：约定空树不是任意一个树的子结构）
 */
public class HascommenTree {

    public boolean function(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if(root2 == null || root1 == null)
            return false;
        if(root1.val == root2.val)
            result = DoesTree1HaveTree2(root1, root2);
        if(!result)
            result = DoesTree1HaveTree2(root1.left, root2);
        if(!result)
            result = DoesTree1HaveTree2(root1.right, root2);
        return result;
    }
    public boolean DoesTree1HaveTree2(TreeNode root1, TreeNode root2){
        //已遍历完，都能对应上
        if(root2 == null)
            return true;
        //如果Tree2还没有遍历完，Tree1却遍历完了。返回false
        if(root1 == null)
            return false;
        //如果其中有一个点没有对应上，返回false
        if (root1.val != root2.val) {
            return false;
        }
        return DoesTree1HaveTree2(root1.left, root2.left) &&
                DoesTree1HaveTree2(root1.right, root2.right);
    }
}
