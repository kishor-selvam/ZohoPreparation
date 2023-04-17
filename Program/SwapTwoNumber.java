package Program;

public class SwapTwoNumber {
    public static void Swap(int a,int b){
        System.out.println("Before Swapping A :"+a+" | B :"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping A :"+a+" | B :"+b);
    }

    public static void main(String[] args) {
        int a=5,b=21;
        Swap(a,b);
    }
}
