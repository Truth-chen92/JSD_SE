package string;

/**
 * int indexOf(String str)
 * 返回给定字符串在当前字符串中的位置，如果当前字符串不包含给定内容则返回值为-1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        String str="thinking in java";
        int index=str.indexOf("in");
        System.out.println(index);

        index=str.indexOf("in",3);
        System.out.println(index);

        index=str.lastIndexOf("in");
        System.out.println(index);


    }
}
