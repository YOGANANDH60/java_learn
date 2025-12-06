// handling the exception during compile time or runtime or logic
// it's simply handil the error without affect the program flow 

public class excepti {
    public static void main(String[] args) {
        int n = 0;
        int k = 8;
        try{
            int j = k/n;
            System.out.println(j);//this is on arithmatic error 
        }
        catch (Exception e){
            System.out.println("some error.."+e);
        }
        System.out.println("see this also run...!\n that's why we need exception");
    }
}

// in this we can do multiple catch 
// Exception is act like an parent class handle all error 
