package string;

/**
 * String toLowerCase()
 * String toUpperCase()
 * 将当前字符串中的英文部分转换为全小写或全大写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str="我爱Java";
        System.out.println(str);
        String a=str.toUpperCase();
        System.out.println(a);
        String b=str.toLowerCase();
        System.out.println(b);
    }
}
