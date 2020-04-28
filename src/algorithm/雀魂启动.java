package algorithm;

import java.util.Arrays;

/**
 * 顺子的意思是递增的连续3个数字牌（例如234,567等），刻子的意思是相同数字的3个数字牌（例如111,777）
 * 从36张牌中抽取了13张牌，他想知道在剩下的23张牌中，再取一张牌，取到哪几种数字牌可以和牌
 */
public class 雀魂启动 {

    public static void main(String[] args) {

    }

    public static boolean isHu(int[] cardList){
        int lenth = cardList.length;
        if(lenth == 0)
            return true;
        Arrays.sort(cardList);
        int count0 = count(cardList);

        //第一种情况：第一个数出现>=2, 去掉雀首仍可胡牌
        if(lenth % 3 != 0 && count0 >=2 && isHu(Arrays.copyOfRange(cardList, 2, lenth)))
            return true;
        //第二种情况：第一个数出现>=3（刻子），去掉刻子仍可胡牌
        if(count0 >= 3 && isHu(Arrays.copyOfRange(cardList, 3, lenth)))
            return true;
        //第三种情况：出现顺子，去掉顺子仍可胡牌
        if(contians(cardList, cardList[0]+1) && contians(cardList, cardList[0]+2)){
            int[] c_cardList = Arrays.copyOfRange(cardList, 1, lenth);
            int[] last = remove(c_cardList, cardList[0] + 1, cardList[0] + 2);
            if (isHu(last) == true)
                return true;
        }
        return false;
    }

    /**
     * 数组第一个数出现次数
     * @param cardList
     * @return
     */
    public static int count(int[] cardList){
        int res = 1;
        for (int i = 1; i < cardList.length; i++) {
            if(cardList[1]==cardList[i])
                res++;
        }
        return res;
    }

    /**
     * 判断数组是否存在某数
     * @param cardList
     * @param n
     * @return
     */
    public static boolean contians(int[] cardList, int n){
        for (int i = 0; i < cardList.length; i++) {
            if(cardList[i] == n)
                return true;
        }
        return false;
    }

    /**
     * 查找数组中某数出现次数
     * @param cardList
     * @param n
     * @return
     */
    public static int timesOfN(int[] cardList, int n){
        int res = 0;
        for (int i = 0; i < cardList.length; i++) {
            if(cardList[i] == n)
                res++;
        }
        return res;
    }

    /**
     * 去除数组中制定两个数
     * @param cardList
     * @param i
     * @param i2
     * @return
     */
    private static int[] remove(int[] cardList, int i, int i2) {
        int[] res = new int[cardList.length - 2];
        int x = 0, times1 = 0, times2 = 0;
        for (int j = 0; j < cardList.length; j++) {
            if (cardList[j] == i && times1 == 0) {
                times1++;
                continue;
            } else if (cardList[j] == i2 && times2 == 0) {
                times2++;
                continue;
            }
            res[x++] = cardList[j];
        }
        return res;
    }
}
