class S{
    public void show(){
        System.out.println("hooryyy...");
    }
}


public class anonymosinner {

    public static void main(String[] args) {
        S obj = new S()
        {
            public void show(){
                System.out.println("yeahhhh....");
            }
        };
        obj.show();
    }
}