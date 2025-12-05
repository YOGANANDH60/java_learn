class f{
    public void show(){
        System.out.println("in f");
    }
}

class g extends f{

    // @Override <--// this is used to if we want to override the method from the parent class that is 
    // possible to we write the worng name to prevent that this annotaion used
    // public void sho(){
    //     System.out.println("in g");
    // }
    public void show(){
        System.out.println("in g");
    }
}

public class annotation {

    public static void main(String[] args) {
        g obj = new g();
        obj.show();
    }
}