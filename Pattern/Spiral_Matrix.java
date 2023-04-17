package Pattern;

// Spiral Matrix

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] n = {{1,2,3},
                {8,9,4},
                {7,6,5}};
        int rs=0,re=n.length-1;
        int cs=0,ce=n[0].length-1;

        while(rs<=re && cs<=ce) {
            for (int i = rs; i <= re; i++) {
                System.out.print(" " + n[rs][i]);
            }
            rs += 1;
//            System.out.println("\n");
            for (int i = rs; i <= re; i++) {
                System.out.print(" " + n[i][ce]);
            }
            ce -= 1;
//            System.out.println("\n");
            for (int i = ce; i >= cs; i--) {
                System.out.print(" " + n[re][i]);
            }
            re -= 1;
//            System.out.println("\n");
            for (int i = re; i >= rs; i--) {
                System.out.print(" " + n[i][cs]);
            }
            cs += 1;
//            System.out.println("\n");

        }
    }
}