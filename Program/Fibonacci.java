package Program;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void FibonacciNum(int n) {
        int a=0;
        int b=1;
        int c=1;
        List<Boolean> s=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print(a+", ");
            a=b;
            b=c;
            c=a+b;
        }
    }
    public static void main(String[] args) {
        int num=10;
        FibonacciNum(num);
    }
}
