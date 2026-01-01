package collection_API;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class sett {

    public static void main(String[] args) {
        
        
        // Collection<Integer> nums = new ArrayList<Integer>();//in this collection we do not have get we only do just add and print 
        // Set<Integer> nums = new HashSet<Integer>();
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(62);
        nums.add(73);
        nums.add(84);
        nums.add(95);

        Iterator<Integer> valuse = nums.iterator();

        while (valuse.hasNext()) {
            System.out.println(valuse.next());
        }
    }
    
}