package algorithm;

/**
 * Created by zxoho on 2020/3/7 0007
 * Description:
 * 斐波那契数列
 */
public class JumpFloor {

    public static void main(String[] args) {
        JumpFloor jumpFloor = new JumpFloor();
        System.out.println(jumpFloor.JumpFloorI(6));
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
     * @param target
     * @return
     */
    public int JumpFloorI(int target){
        if(target <= 0) return 0;
        if(target == 1) return 1;
        if(target == 2) return 2;
        int one = 1;
        int two = 2;
        int result = 0;
        for(int i = 2; i < target; i++){
            result = one+ two;
            one = two;
            two = result;
        }
        return result;
        }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if(target <= 0)
            return 0;
        if(target == 1)
            return 1;
        int a = 1;
        int result = 2;
        for(int i = 2; i <= target; i++){
            result = a * 2;
            a = result;
        }
        return result;
    }

    }

