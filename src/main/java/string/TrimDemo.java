package string;

/**
 * String trim()
 * 去除字符串两端的空白字符
 */
public class TrimDemo {
    public static void main(String[] args) {
        String str="    hello    ";
        str=str.trim();
        System.out.println(str);
    }
}
