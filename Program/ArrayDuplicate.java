package Program;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int a[]={1,2,34,1,3,2};
        HashMap <Integer,Integer> duplicate=new HashMap<>();
        for(int c : a){
            if(duplicate.containsKey(c)){
                duplicate.put(c,duplicate.get(c)+1);

            }else{
                duplicate.put(c,1);
            }
        }
        System.out.println(duplicate);
        for (Map.Entry entry : duplicate.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
