package Program;

import java.util.*;

public class DuplicateElement {
    static void Duplicate(int[] arr){
        Set<Integer> s=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i])){
                System.out.println("Duplicate Elements : "+arr[i]);
            }
            else{
                s.add(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,4,2,1,5};
        Duplicate(arr);
    }
}
