import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>(10);

        list.add(23);
        list.add(23);
        list.add(29999);
        list.add(2888);
        list.add(24);
        
        System.out.println(list.contains(2888));
        System.out.println(list);
        list.set(0, 4458748);
        System.out.println(list);
    }
}


// this is array list is an dynamic 
/*why this is and dynamic every time when we add element it's double the size and
 copy the old  update the valuse an it..
->the old was deleted.  */
