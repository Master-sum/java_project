import java.io.Console;
import java.util.*;
public class out_in {
    public static void main(String[] args){
//       //创建控制台输入对象
//        Scanner in = new Scanner(System.in);
//        System.out.println("请输入名字：");
////      从控制台读取数据
//        String name = in.nextLine();
//        System.out.println("输入数字");
////       从控制台读取数据int
//        int age = in.nextInt();

//明文输入使用Scanner，密码输入Console
        Console n = System.console();
        String username = n.readLine("user name:");
        char[] pas = n.readPassword("user pass");

//        System.out.println(name+" "+age);
    }
}
