// polymorphism - many form/behaviour
// it can two type complie time and run time polymorphism 

class A{
    public void show() {
        System.out.println("this is form a");
    }
}

class B extends A{
    public void show() {
        System.out.println("this is form b");
    }
}

class C extends B{
    public void show() {
        System.out.println("this is form c");
    }
}
public class polymorphism {
    public static void main(String[] args) {
       
    //this is an dynamic methos dispatch -this mean a process the overridden method is called 
    // -at runtime based on the object type not the reference type.
    // this is an runtime polymorphism
        A obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    
    }
    
}