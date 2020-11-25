import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("输入数字:");
        int k = in.nextInt();
        int[] h = new int[k];
//        for (int i=0;i<h.length;i++){
//            h[i] = i+1;
//        }
//        for (int i=0;i<h.length;i++){
//            int r = (int) (Math.random()*k);
//            h[i] =
//        }
        System.out.println(h);
        Arrays.sort(h);
        for(int r: h){
            System.out.println(r);
        }
    }
}
