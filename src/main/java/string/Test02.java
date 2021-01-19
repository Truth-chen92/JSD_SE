package string;
/**
 * 要求用户在控制台输入自己的用户名。
 * 然后要求做如下验证工作:
 * 1:用户名不能为空(只要有一个字符)
 * 2:用户名必须在20个字以内
 * @author Xiloer
 *
 */
import java.util.Scanner;
public class Test02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入名字：");
        String name=scan.nextLine().trim();


        if(name.length()<=20&&name.length()!=0){
            System.out.println(name);
        }else{
            System.out.println("违法");
        }

    }


}
