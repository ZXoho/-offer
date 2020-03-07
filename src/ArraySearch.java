/**
 * Created by zxoho on 2020/3/4 0004
 * Description:在一个二维数组中（每个一维数组的长度相同）
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class ArraySearch {

    public static void main(String[] args) {

    }

    /**
     *对数组每一行进行二分遍历
     * O(nlogn)
     */
    public boolean function(int [][] array, int target){
        for(int i=0; i<array.length; i++){
            int low = 0;
            int high = array[i].length - 1;
            while(low<=high){
               int mid = (low + high)/2;
               if(target>array[i][mid])
                   low = mid + 1;
               else if(target<array[i][mid])
                   high = mid -1;
               else
                   return true;
               }
            }
        return false;
        }


    }

