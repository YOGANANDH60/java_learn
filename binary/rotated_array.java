package binary;

public class rotated_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(arr,target);
        System.out.println(ans);
}

    static int search(int[] arr,int target){
        int s = 0;
        int e = arr.length-1;

        while (s<= e) {
            int mid = s+(e-s) /2;

            if(arr[mid] == target){
                return mid;
            }

            // left side

            if(arr[s]<=arr[mid]){
                if(target>=arr[s] && target < arr[mid]){
                    e = mid-1;
                }
                else
                {
                    s = mid + 1;
                }
            }
            else{
                if(target>arr[mid] && target <= arr[e]){
                    s = mid + 1;

                }
                else
                {
                    e = mid-1;
                }
            }
        }
        return -1;
    }

}
