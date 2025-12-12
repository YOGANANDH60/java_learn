package leetcode;

public class leet744 {
    public static void main(String[] args) {
        
    }

    static int search(int[] letter, int target2) {
         
        int s = 0;
        int e = letter.length -1;

        while (s<=e) {
            int m = s+(e-s)/2;

            if(target2>=letter[m]){
                s = m+1;
            }
            else{
                e = m-1;
            }

        }
        return letter[s % letter.length];
    }
}
