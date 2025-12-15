public class leetsqrt {
 public static void main(String[] args) {
    int x= 8;
    int i = 0;

    while ((long)i*i <= x) {
        i++;
    }
    System.out.println(i-1);
 }   
}
