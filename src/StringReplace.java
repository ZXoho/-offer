/**
 * Created by zxoho on 2020/3/4 0004
 * Description:将一个字符串中的每个空格替换成“%20
 */
public class StringReplace {

    /**
     *运行时间：16ms
     *占用内存：9556k
     */
    public String stringReplace1(StringBuffer str) {
        if (str == null)
            return null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                str.replace(i, i + 1, "%20");
        }
        String result = str.toString();
        return result;
    }

    /**
     运行时间：19ms
     占用内存：9636k
     */
    public String stringReplace2(StringBuffer str){
        StringBuilder result = new StringBuilder();
        if(str==null)
            return null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result.append('%');
                result.append('2');
                result.append('0');
            }
            else
                result.append(str.charAt(i));
        }
        return result.toString();
    }
}
