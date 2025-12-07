import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class readintput {
    public static void main(String[] args) {
        // InputStreamReader in = new InputStreamReader(System.in); 
        // BufferedReader inp = new BufferedReader(in);
        // // but bufferedreader is an old method can can handle the erroe handle in this 

        // scanner

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        long b = sc.nextLong();
        BigInteger c = sc.nextBigInteger();
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);

        System.out.print(' ');
        System.out.print(c);
        System.out.print(' ');
    }
}
