import java.util.Scanner;

public class tryFinally {
    public static void main(String[] args) {
        try{

            Scanner in = new Scanner(System.in);
            int jj = in.nextInt();
            System.out.println(jj);
        }
        finally{

            System.out.println("bye");
            // this finally keyword is used to closed the resource 
        }
    }
}
