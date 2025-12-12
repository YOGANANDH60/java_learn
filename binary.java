public class binary {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,9};
        int target = 7;
        int s = 0;
        int e = arr.length -1;
        
       int ans = search(arr,s,e,target);
       System.out.println(ans);
    }

    static int search(int[] arr, int s, int e, int target2) {
         
        if(s>e){
            return s;//to where it would be 
            // return -1;//if not in there in array 
        }
        int m = s+(e-s) / 2;

         if (arr[m] == target2 ) {
            return arr[m];
         }
         if (target2 < arr[m] ) {
            return search(arr, s, m-1, target2);
         }
        return search(arr, m+1, e, target2);

    }
}
