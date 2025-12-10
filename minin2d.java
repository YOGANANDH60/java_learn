import java.util.Arrays;

public class minin2d {
    public static void main(String[] args) {
        int[][] arr = {
            {33,43,2},
            {4,5,4},
            {88,55,33}
        };
     int t = 55;
     int[] ans = search(arr,t);
     System.out.println(Arrays.toString(ans));   
    }

    // static boolean search(int[][] arr, int t) {
    //     for(int row =0; row<arr.length;row++){
    //         for(int col = 0 ; col<arr[row].length;col++){
    //             if(arr[row][col] == t){
    //                 return True;
    //             } 
    //         }
    //     }
    //     return False;
    static int[] search(int[][] arr, int t) {
        for(int row =0; row<arr.length;row++){
            for(int col = 0 ; col<arr[row].length;col++){
                if(arr[row][col] == t){
                    return new int[]{row,col};
                } 
            }
        }
        return new int[]{-1,-1};
    }

}
