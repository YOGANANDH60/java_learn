import java.util.Arrays;

public class rev {
    public static void main(String[] args) {
        int arr[] ={1,2,3,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while (s < e) {
            swapp(arr, s, e);
            s++;
            e--;
        }
    }

    private static void swapp(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    
}
