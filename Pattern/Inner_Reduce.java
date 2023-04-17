package Pattern;

public class Inner_Reduce {
    public static void main(String[] args) {
        int n=4,l=n*2-1;
        int arr[][] = new int[l][l];
        int start=0,end=l-1;
        logic(start,end,arr,n);
        print(arr,l);

    }
    static void logic(int start,int end,int arr[][],int n){
        while (n!=0){
            for (int i = start; i <= end; i++) {
                for (int j = start; j <= end; j++) {
                    if (i==start || i==end || j==start || j==end){
                        arr[i][j] = n;
                    }
                }
            }
            start+=1;
            end-=1;
            n-=1;
        }
    }
    static void print(int a[][],int length){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println(" ");
        }
    }
}
