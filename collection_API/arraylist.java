package collection_API;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        
        
        // Collection<Integer> nums = new ArrayList<Integer>();//in this collection we do not have get we only do just add and print 
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        
        System.out.println(nums.get(3));
        System.out.println(nums.indexOf(7));
        // for(int n:nums){
        //     System.out.println(n);
        // }
    }
    
}
