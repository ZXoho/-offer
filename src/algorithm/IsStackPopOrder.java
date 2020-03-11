package algorithm;

import java.util.Stack;

/**
 * Created by zxoho on 2020/3/10 0010
 * Description:输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序
 */
public class IsStackPopOrder {

    public boolean function(int [] pushA, int [] popA){
        if(pushA==null || popA==null)
            return false;

        Stack<Integer> order = new Stack<Integer>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            order.push(pushA[i]);
            while(!order.isEmpty() && order.peek()==popA[index]){
                order.pop();
                index++;
            }
        }
        return order.isEmpty();
    }
}
