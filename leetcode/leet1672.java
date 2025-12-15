

public class leet1672 {
    public static void main(String[] args) {
        int[][] arr ={{2,8,7},{3,7,1},{1,9,5}};

        int total = max(arr);
        System.out.println(total);
    }

    static int max(int[][] arr) {
        int total = 0;
        for(int row = 0; row<arr.length; row++){
            int t = 0;
            for(int col = 0;col<arr[row].length;col++){
                t += arr[row][col];
            }
            if(t>total){
                total = t;
            }
        }
        return total;
    }
}
