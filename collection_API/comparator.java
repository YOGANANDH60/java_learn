package collection_API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student implements Comparable<student>{
    int age;
    String name;
    
    public student(int age, String name) {
        this.age = age;
        this.name = name;
        
    }

    public String toString() {
        return "student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(student that) {
            if(this.age>that.age){
                return 1;
            }
            else{
                return -1;
            }        
    }



    
}

public class comparator {
    public static void main(String[] args) {
        
        // this an interface for sorting the multiple valuse 

        Comparator<student> com = new Comparator<student>() {
            public int compare(student i, student j){
                if(i.age>j.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<student> nums = new ArrayList<>();
        nums.add(new student(20, "yoga"));
        nums.add(new student(19, "gayu"));
        nums.add(new student(21, "santhosh"));
        nums.add(new student(17, "agil"));

        // Collections.sort(nums,com);
        Collections.sort(nums);
        for(student n:nums){

            System.out.println(n);
        }
    }
    
}
