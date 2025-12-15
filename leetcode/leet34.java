

import java.util.Arrays;

public class leet34 {

    public static void main(String[] args) {

        leet34 obj = new leet34();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;

        int[] result = obj.searchRange(nums, target);

        System.out.println(Arrays.toString(result));
    }


    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);   // first index
        ans[1] = search(nums, target, false);  // last index

        
        return ans;
    }


    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (target > nums[m]) {
                s = m + 1;
            } 
            else if (target < nums[m]) {
                e = m - 1;
            } 
            else {
                ans = m;
                if (findStartIndex) {
                    e = m - 1;   // search left
                } else {
                    s = m + 1;   // search right
                }
            }
        }
        return ans;
    }
}
