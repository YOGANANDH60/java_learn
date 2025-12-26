import java.util.Arrays;
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

        // // enhanced for loop only for array and collectiob
        // for(int[] n:arr){
        //     for(int m :n){
        //         System.out.print(" "+m);
        //     }
        //     System.out.println();
        // }

        // normal fro loop with toString method
        for(int row =0; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
