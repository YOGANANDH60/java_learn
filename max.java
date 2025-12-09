public class max {

    public static void main(String[] args) {
        int arr[] = {1,2,8,4,5,};

        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int m = arr[0];
        for (int i = 0 ; i<arr.length;i++){
            if(arr[i]>m){
                m = arr[i];
            }
        }
        return m;
        
    }
    
}