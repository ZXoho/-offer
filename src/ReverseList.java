import DataStructure.ListNode;


/**
 * Created by zxoho on 2020/3/9 0009
 * Description:翻转链表并返回新表头
 */
public class ReverseList {

    public ListNode function(ListNode root){
        if(root==null || root.next==null)
            return root;

        //递归至尾节点,再依次反转节点
        ListNode newRoot = function(root.next);
        root.next.next = root;
        root.next = null;

        return newRoot;
    }
}
