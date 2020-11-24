import java.util.*;
public class switch_c {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入：1，2，3，4");
        int ch = in.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("我是一号");
                break;
            case 2:
                System.out.println("我是er号");
                break;
//                默认
            default:
                System.out.println("122");
        }
    }
}
/*
case标签：
1、类型为char、byte、short或int的常量表达式
2、枚举常量
3、Java7开始，case标签还可以是字符字面量
 */
