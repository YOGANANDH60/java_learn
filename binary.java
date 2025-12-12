public class binary {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        int s = 0;
        int e = arr.length -1;
        
       int ans = search(arr,s,e,target);
       System.out.println(ans);
    }

    static int search(int[] arr, int s, int e, int target2) {
         
        if(s>e){
            return -1;
        }
        int m = s+(e-s) / 2;

         if (arr[m] == target2 ) {
            return m;
         }
         if (target2 < arr[m] ) {
            return search(arr, s, m-1, target2);
         }
         else if (target2 > arr[m]) {
            return search(arr, m+1, e, target2);
        }
        else {
            int l = m+1;
            return l;
        }
    }
}
