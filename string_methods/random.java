package string_methods;

import java.util.Arrays;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        int size=5;
        for (int i=0;i<size;i++){
            int r = 97 + (int)(26*random.nextFloat());
            sb.append((char)r);
        }
        System.out.println(sb);
        String n = "        yoganandh, is, an, vibe, coder";
        System.out.println(n);
        System.out.println(n.strip());
        System.out.println(n.split(",", 8));//this return only memory address if we put in array it will the output like below
        String[] a = n.split(",");
        System.out.println(Arrays.toString(a));

    }    
}

// System.out.println((26*random.nextFloat()));//this is genrate the random number between the 26 