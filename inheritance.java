import calculatorrrrr.veryadvcal;

public class inheritance {
    public static void main(String[] args) {
        veryadvcal obj = new veryadvcal();
        int result1 = obj.add(5, 4);
        int result2 = obj.sum(5, 9);
        int result3 = obj.multi(5,5);
        int result4 = obj.div(4,5);
        double result5 = obj.power(5, 2);

        System.out.println(result1+", "+result2+", "+result3+", "+result4+", "+result5);
    }
}
