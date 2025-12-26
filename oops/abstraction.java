abstract class t{
    public abstract void show();
}

class y extends t{
    public void show(){
        System.out.println("hiiiiiii................");
    }
}


public class abstraction {
    public static void main(String[] args) {
        t obj = new y();
        obj.show();
    }
}