package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zxoho on 2020/3/4 0004
 * Description:输入两个字符串，从第一字符串中删除第二个字符串中所有的字符
 * 使用Map,<key,value>均为字符串字符
 */
public class SameStringDel {
    public static void main(String[] args) {
        SameStringDel sameStringDel = new SameStringDel();
        sameStringDel.function1("asdfghj", "sdf");
    }

    public void function1(String str1, String str2){
        Map<Character, Character> str1Map = new HashMap<>() ;
        for(int i = 0; i<str1.length(); i++)
           str1Map.put(str1.charAt(i), str1.charAt(i));
        for(int j = 0; j < str2.length(); j++)
            if(str1Map.get(str2.charAt(j)) == str2.charAt(j))
                str1Map.remove(str2.charAt(j));
        for(Map.Entry<Character, Character> entry : str1Map.entrySet())
            System.out.print(entry.getValue());
        }

    }

