package algorithm;

import DataStructure.ListNode;

/**
 * Created by zxoho on 2020/3/9 0009
 * Description:输入两个单调递增的链表，输出两个链表合成后的链表
 * 合成后的链表满足单调不减规则
 */
public class MergeList {

    public ListNode function(ListNode list1,ListNode list2){
        ListNode resultNode = new ListNode(-1);
        ListNode root = resultNode;
        while(list1!=null && list2!=null){
            if(list1.data < list2.data){
                resultNode.next = list1;
                resultNode = list1;
                list1 = list1.next;
            }else {
                resultNode.next = list2;
                resultNode = list2;
                list2 = list2.next;
            }
        }
        while(list1!=null){
            resultNode.next = list1;
            resultNode = list1;
            list1 = list1.next;
        }
        while(list2!=null){
            resultNode.next = list2;
            resultNode = list2;
            list2 = list2.next;
        }
        return root.next;
    }
}
