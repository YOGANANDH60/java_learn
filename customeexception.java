// this is an custome exception we can create own exception 

class yogaException extends Exception {
    public yogaException(String string) {
        super(string);
    }
}

public class customeexception {
     public static void main(String[] args) {
        int n = 20;
        int k = 17;
        try{
            int j = k/n;
            System.out.println(j);//this is on arithmatic error
            if (j==0){
                throw new yogaException("this divisible return zero");
            } 
        }
        catch (ArithmeticException e){
            System.out.println("divided by zero not posible"+e);
        }
        catch (Exception e){
            System.out.println("some error.."+e);
        }
        System.out.println("see this also run...!\n that's why we need exception");
    }
}
