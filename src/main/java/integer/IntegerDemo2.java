package integer;

/**
 * 包装类提供的一些功能
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        //数字类型的包装类提供了两个常量用于获取对应的基本类型的取值范围
//        int imax=Integer.MAX_VALUE;
//        System.out.println(imax);
//        int imin=Integer.MIN_VALUE;
//        System.out.println(imin);
//        long lmax=Long.MAX_VALUE;
//        System.out.println(lmax);
        String str="123";
        int i=Integer.parseInt(str);
        System.out.println(i);
        double dou=Double.parseDouble(str);
        System.out.println(dou);

    }
}
