package DataStructure;

/**
 * Created by zxoho on 2020/3/10 0010
 * Description:操作给定的二叉树，将其变换为源二叉树的镜像
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 */
public class MirrorTree {

    /**
     * 递归遍历
     * @param root
     */
    public void function1(BiTree root){
        if(root == null)
            return;

        BiTree temp = new BiTree(-1);
        temp = root.right ;
        root.right =root.left;
        root.left = temp;

        if(root.left != null)
            function1(root.left);
        if(root.right != null)
            function1(root.right);
    }
}
