package string;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * String常量池
 * 常量池是虚拟机在堆内存中开辟的一段空间，用来缓存所有使用字符串字面量形式创建的字符串对象，
 * 当再次使用相同字面量创建字符串时会重用对象减少内存开销
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1="123abc";
        String s2="123abc";
        System.out.println(s1==s2);
        String s3="123abc";
        System.out.println(s2==s3);
        s1=s1+"!";
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1==s2);
        System.out.println(s3==s2);
        //new一定会创建新字符串对象，java不建议这样创建字符串，因为不会重用对象
        String s4=new String("123abc");
        System.out.println("s4:"+s4);
        System.out.println(s2==s4);
        //字符串比较内容都要使用equals方法，几乎不会用到“==”
        System.out.println(s2.equals(s4));
        /**
         * 这里出发了编译器的一个特性：编译器在编译期间如果能确定一个计算表达式的结果时就会进行
         * 计算并将结果编译到class文件中
         * 下面的代码会被编译为：
         * String s5="123abc"
         */
        String s5="123"+"abc";
        System.out.println("s5:"+s5);
        System.out.println(s2==s5);
        String s="123";
        String s6=s+"abc";
        System.out.println("s6:"+s6);
        System.out.println(s2==s6);




    }

}
