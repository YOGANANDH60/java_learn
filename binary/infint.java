package binary;


// this is for find the element in the infinit array we do not know the array size 
// in this if we search 23 it shoow out  of bound bechause it not infinity array it work only work in infinity array
public class infint {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21,23,25};
        int target = 15;
       int ans = search(arr,target);
       System.out.println(ans);
    }
    static int search(int[] arr, int target2) {
        int s = 0;
        int e = 1;

        while (target2>arr[e]) {
            s = e;
            e = e*2;
        }

        return binary(arr, s, e, target2);
        
    }

    static int binary(int[] arr, int s, int e, int target){
        while (s<=e) {
            int m = s+(e-s)/2;

            if(target>arr[m]){
                s = m+1;
            }
            else if (target<arr[m]) {
                e = m-1;
            }
            else{
                return m ;
            }
        }
        return -1;
    }
}
