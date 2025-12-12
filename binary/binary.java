package binary;

public class binary {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int s = 0;
        int e = arr.length -1;
        
       int ans = search(arr,s,e,target);
       System.out.println(ans);
    }

    static int search(int[] arr, int s, int e, int target2) {

        if(s>e){
            return -1;//if not in there in array 
        }
        int m = s+(e-s) / 2;

         if (arr[m] == target2 ) {
            return arr[m];
         }
         if (target2 < arr[m] ) {
            return search(arr, s, m-1, target2);
         }
        return search(arr, m+1, e, target2);
         //this is an fast method and above this is mine own method 
        // int s = 0;
        // int e = arr.length -1;

        // while (s<=e) {
        //     int m = s+(e-s)/2;

        //     if(target2>arr[m]){
        //         s = m+1;
        //     }
        //     else if (target2<arr[m]) {
        //         e = m-1;
        //     }
        //     else{
        //         return m ;
        //     }
        // }
        // return -1;
    }
}