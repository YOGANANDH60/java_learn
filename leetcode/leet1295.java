

public class leet1295{
    public int findNumbers(int[] nums) {
        int[] arr ={12,345,2,6,7896};
        
        int c = sol(arr);
        return c;
    }
    static int sol(int[] arr){
        int count = 0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
            
        }
        return count;

    }
    static boolean even(int num) {
        int b = countnumber(num);
        // if(b%2 == 0){
        //     return true;
        // }
        // return false;
        return b%2 == 0;
    }

    static int countnumber(int num) {
        int count = 0;
        while (num>0) {
            count ++;
            num = num/10;
        }
        return count;
    } 
}