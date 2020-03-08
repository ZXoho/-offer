import static java.lang.Math.abs;

/**
 * Created by zxoho on 2020/3/8 0008
 * Description:给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 */
public class Power {

    public static void main(String[] args) {
        Power test = new Power();
        System.out.println(test.function(2.5, -1));

    }

    /**
     * 举例:10^1101 = 10^0001*10^0100*10^1000。
     * 通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。
     * @param base
     * @param exponent
     * @return
     */
    public double function(double base, int exponent){
        double res = 1;
        double curr = base;
        int exp = abs(exponent);
        if(exponent < 0){
            if(base == 0)
                throw new RuntimeException("分母不能为0");
        }else if(exponent == 0) {
            if(base == 0)
                return 0;
            else
                return 1;
        }
        while(exp!=0){
            if((exp&1) == 1)
                res *= curr;
            exp >>=1;
            curr *= curr;
        }
        return exponent > 0 ? res : 1/res;
    }
}
