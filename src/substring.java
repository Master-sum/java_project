public class substring {


    public static void main(String[] args){
        su();//调用函数
        pin();//调用函数
        eq();
    }
//定义一个静态函数
    private static void su() {
        String gree = "hello world java";
        String sg = gree.substring(0,5);
        System.out.println(sg);
    }
    //函数拼接
    public static void pin(){
        String p = "hello";
        String o = "world";
        String po = p+"\t"+o;
        System.out.println(po);
    }
    //检查字符串是否相等,equals和==区别，==是指需要地址和值都相等才可以
    public static void eq(){
        String p = "hello";
        //区分大小写
        System.out.println("Hello".equals(p));
        //不区分大小写
        System.out.println("Hello".equalsIgnoreCase(p));

    }

}
