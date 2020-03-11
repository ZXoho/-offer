package algorithm;

/**
 * Created by zxoho on 2020/3/11 0011
 * Description:输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果
 * 假设输入的数组的任意两个数字都互不相同
 */
public class VerifySquenceOfBST {

    public boolean function(int [] sequence){
        if(sequence.length == 0)
            return false;
        return IsTreeBST(sequence, 0, sequence.length-1);
    }

    public boolean IsTreeBST(int [] sequence,int start,int end ){
        if(end<=start)
            return true;
        int i = start;
        //找出左右子树分界点
        for (; i < end; i++) {
            if(sequence[i] >sequence[end]) break;
        }
        //判断右子树节点是否都大于根节点
        for (int j = i; j < end; j++) {
            if(sequence[j] < sequence[end])
                return false;
        }
        //递归遍历所有左右子树
        return IsTreeBST(sequence, start, i-1)&&IsTreeBST(sequence, i, end-1);

    }

}
