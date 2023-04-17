package Pattern;
public class Hollow_Pattern {
    public static void main(String[] args) {
        int n=11;
        int os = n/2;
        int is = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < os; j++) {
                System.out.print(" ");
            }
            if (i < n/2){
                os-=1;
            }
            else {
                os+=1;
            }
            if (i==0 || i==n-1){
                System.out.println("*");
            }
            else {
                System.out.print("*");
                for (int j = 0; j < is; j++) {
                    System.out.print(" ");
                }
                if(i<n/2){
                    is+=2;
                }
                else {
                    is-=2;
                }
                System.out.println("*");
            }

        }
    }
}