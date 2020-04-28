package algorithm;

import java.util.Scanner;

/**
 * 有序的N个正整数中取3个，最大最小差值小于等于D的排列组合个数
 */
public class MaxSubMinLessThanN {

    final long mod = 99997867;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int [] dest = new int[N];

        for (int i = 0; i < N; i++) {
            dest[i] = scanner.nextInt();
        }
        System.out.println(new MaxSubMinLessThanN().function(dest, D));
    }

    public  long function(int[] dest, int D){

        long result = 0;
        int j = 0;
        for (int i = 0; i < dest.length; i++) {

            while(i>=2 && dest[i] - dest[i]>D ) {
                j++;
            }
            //i-j个数排列组合
            result += (i-j)*(i-j-1)/2;
        }
        //防止结果溢出，取模
        return result % mod;
    }
}
