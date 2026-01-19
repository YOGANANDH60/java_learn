import java.util.Arrays;

public class arraysort {
   public static void main(String[] args) {
    int arr[] = {3,2,4,77,1};

    sort(arr);
    System.out.println(Arrays.toString(arr));

   }

   static void sort(int[] arr) {
        int n = arr.length;
        while (n>1) {
            for(int i = 0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    swapp(arr, i, i+1);
                }
            }
            n--;
        }
   } 
    private static void swapp(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
}
