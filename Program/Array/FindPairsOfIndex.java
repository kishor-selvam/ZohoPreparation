package Program.Array;

public class FindPairsOfIndex {
    static void Pairs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            if(arr[start]+arr[end] > target){
                end-=1;
            }
            else if (arr[start]+arr[end] < target) {
                start+=1;
            }
            else if(arr[start]+arr[end] == target) {
                System.out.println("Pair : " + arr[start] + "," + arr[end]);
                start+=1;
                end-=1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 8;
        Pairs(arr,target);
    }
}
