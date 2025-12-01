
class J {
    public void show(){
        System.out.println("hey this from j");
    }
    
}

class K extends J{
    public void show1(){
        System.out.println("hey this is from k");
    }
}

public class casting {
    public static void main(String[] args) {
        // this is an upcasting 
        J obj =  new K();
        obj.show();
        
        // above refference is the parent class but the object is child class so we can only call 
        // -the parent class method , thats why we down grade them 
        // this is an downcasting
        K obj1= (K) obj;
        obj1.show1();
    }
}
