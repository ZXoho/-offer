package algorithm;

import DataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by zxoho on 2020/3/4 0004
 * Description: 从尾到头输出一个链表
 */
public class ListPrintTail2Head {

    public ArrayList<Integer> function(ListNode listNode){
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode temp = listNode;
        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
}
