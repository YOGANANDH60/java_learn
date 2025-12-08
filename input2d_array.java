import java.util.Scanner;

public class input2d_array {
    public static void main(String[] args) {
        int arr[][] =new int [3][3];
        Scanner in = new Scanner(System.in);

        for(int row =0; row<arr.length;row++){
            for(int col = 0 ; col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

        for(int[] n:arr){
            for(int m :n){
                System.out.print(" "+m);
            }
            System.out.println();
        }
    }
}
