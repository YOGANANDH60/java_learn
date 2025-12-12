package binary;

//this is ceiling that mean smallest element grater then or equal to target

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
       int ans = search(arr,target);
       System.out.println(ans);
    }

    static int search(int[] arr, int target2) {
         
        int s = 0;
        int e = arr.length -1;

        while (s<=e) {
            int m = s+(e-s)/2;

            if(target2>arr[m]){
                s = m+1;
            }
            else if (target2<arr[m]) {
                e = m-1;
            }
            else{
                return m ;
            }
        }
        return arr[s];
    }
}
