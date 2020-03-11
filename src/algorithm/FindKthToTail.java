package algorithm;

import DataStructure.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zxoho on 2020/3/8 0008
 * Description:
 */
public class FindKthToTail {

    public ListNode function(ListNode head, int k) {
        int len = 0;
        Map<Integer, ListNode> nodes = new HashMap<>();
        while(head!=null){
            nodes.put(len, head);
            head = head.next;
            len++;
        }
        return nodes.get(len-k);

    }
}
