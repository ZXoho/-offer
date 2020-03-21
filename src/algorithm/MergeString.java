package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zxoho on 2020/3/21 0021
 * Description:合并两个内容流，实现隔4个插入1个
 * 如果合并完还有剩下，则加内容流尾部
 */
public class MergeString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        List<String> a = function(str1.trim().split(" "), str2.trim().split(" "));
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    public static List<String> function(String[] str1, String[] str2) {
        int j = 0;
        int count = 0;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str1.length; i++) {
            result.add(str1[i]);
            count++;
            if(count == 4 && j < str2.length){
                result.add(str2[j++]);
                count = 4;
            }
        }
        while(j < str2.length)
            result.add(str2[j++]);
        return result;
    }
}
