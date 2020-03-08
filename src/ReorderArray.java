/**
 * Created by zxoho on 2020/3/8 0008
 * Description:输入一个整数数组，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReorderArray {

    public static void main(String[] args) {
        ReorderArray test = new ReorderArray();
        int []array = new int[]{1,3,4,5,6,7,10};
        System.out.println(test.function(array));
    }

    public int [] function(int[] array){
        int[] odd = new int[array.length];
        int[] even = new int[array.length];
        int m = 0, n = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0)
                even[m++] = array[i];
            else
                odd[n++] = array[i];
        }
        int key = 0;
        int [] result = new int[array.length];
        for (int i = 0; i < n; i++)
            result[key++] = odd[i];
        for (int i = 0; i < m; i++)
            result[key++] = even[i];
        return result;




    }

}

