// thorw is used to throw the exception to the catch block 

public class throwss {
    public static void main(String[] args) {
        int n = 20;
        int k = 18;
        try{
            int j = k/n;
            System.out.println(j);//this is on arithmatic error
            if (j==0){
                throw new ArithmeticException("this divisible return zero");
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

// in this we can do multiple catch 
// Exception is act like an parent class handle all error 
