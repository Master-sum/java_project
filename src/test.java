
public class test {
    int [] a ;
    public int [] num(){
        for(int i = 0;i<10;i++) {
            a[i] = i;
            System.out.println(a);
        }
        return a;
    }
    public static void main(String[] args){
        test r = new test();
        r.num();
        System.out.println("hello for mac");
    }
}
