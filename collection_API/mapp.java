package collection_API;

import java.util.HashMap;
import java.util.Map;

public class mapp {
    public static void main(String[] args) {
        
        Map<String, Integer> student =new HashMap<>();

        student.put("yoga", 99);
        student.put("agil", 98);
        student.put("raja", 97);
        student.put("guna", 99);

        for(String name : student.keySet()){
            
            System.out.print(name + " : " + student.get(name));
            System.out.print( ", ");
        }
    }
}
