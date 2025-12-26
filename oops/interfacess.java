interface A {

    // int age;  //in interface every variable is an final and static 
    String name = "yoganandh";// this is ok but we can not change this name
    void show();
    void config();
}
class B implements A{

    public void show() {
        System.out.println("this is an show");
        System.out.println(name);
    }

    public void config() {
        System.out.println("this ia n config");
    }
    
} 
public class interfacess {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();


    }
}
