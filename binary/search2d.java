package binary;

import java.util.Arrays;

public class search2d {
    public static void main(String[] args) {
        int [][] matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {32,34,38,50}
        };
        System.out.println(Arrays.toString(serach(matrix, 10)));
        // System.out.println(serach(matrix, 110));
    }

    static int[] serach(int [][]mat,int target){
    // static boolean serach(int [][]mat,int target){
        int r = 0;
        int c = mat[0].length-1;

        while (r < mat.length && c >= 0) {
            if(mat[r][c] == target){
                // return true;
                return new int[]{r,c};
            }
            if(mat[r][c] < target){
                r++;
            }
            else{
                c--;

            }
        }
        // return false;
        return new int[]{-1,-1};
    }
}
