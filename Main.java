import java.util.Arrays;
import java.lang.String;

public class Main {
    static void array(int[] arr){
        System.out.println("Original Array :"+ Arrays.toString(arr));
        int l=arr.length;
        int start=0,end=l-1,temp;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start+=1;
            end-=1;
        }
        System.out.println("Reversed Array"+Arrays.toString(arr));
    }

    static void Strings(String s){
        int l=s.length();
        String s1="";
        for (int i = l-1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        System.out.println(s1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 4, 3, 9};
        String s="kishor";
        Strings(s);
        array(arr);
    }
}