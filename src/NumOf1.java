/**
 * Created by zxoho on 2020/3/8 0008
 * Description:输入一个整数，输出该数二进制表示中1的个数。
 * 其中负数用补码表示
 */
public class NumOf1 {

    public static void main(String[] args) {
        NumOf1 test = new NumOf1();
        System.out.println(test.function1(15));
    }

    public int function1(int n){
        int count = 0;
        if(n == 0)
            return count;
        while (n!=0){
            count++;
            n = n & (n-1); //抵消二进制最右一位1
        }
        return count;
    }
}
