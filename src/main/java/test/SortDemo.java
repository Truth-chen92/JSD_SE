package test;
import java.util.*;
public class SortDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入员工信息：");
        String str=scanner.nextLine();
        String[]info=str.split(";");
        Emp[]emp=new Emp[info.length];
        for(int i=0;i<info.length;i++){
            String[]mes = info[i].split(",");
            String name=mes[0];
            int age=Integer.parseInt(mes[1]);
            String gender=mes[2];
            double salary=Double.parseDouble(mes[3]);
            emp[i]=new Emp(name,age,gender,salary);
        }
        List<Emp> list=new ArrayList<>();
        for (int i=0;i<emp.length;i++){
            list.add(emp[i]);
        }
        System.out.println(list);
        for(Emp e:list){
            System.out.println(e);
        }
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,(o1, o2) -> (int)(o1.getSalary()-o2.getSalary()));
        System.out.println(list);
    }
}
