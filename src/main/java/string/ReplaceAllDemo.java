package string;

/**
 * String支持正则表达式的方法之三：
 * String replaceAll(String regex,String str)
 * 将当前字符串满足正则表达式的部分替换为给定内容
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str="abc123def456ghi";
        str=str.replaceAll("[0-9]+","#NUMBER#");
        System.out.println(str);

        String regex="(wqnmlgb|dsb|wrsndm|nc|cnm|mdzz|nmsl|djb)";
        String message="wrsndm!你个dsb,你怎么这么nc,你就一个djb!";
        message=message.replaceAll(regex,"***");
        System.out.println(message);
    }
}
