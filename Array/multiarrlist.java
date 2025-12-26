import java.util.ArrayList;
import java.util.Scanner;

public class multiarrlist {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);

       int n = in.nextInt();

        for (int i =0 ;i<n;i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0;i<n;i++){
            for(int j=0;j<n-1;j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
