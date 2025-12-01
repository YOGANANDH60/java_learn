class STU{
    int age;
    public void show(){
        System.out.println("hiii");
    }

    class e{
        public void show8(){
            System.out.println("helloooooo!");
        }
    }
    static class d{
        public void show1(){
            System.out.println("helloooooo!");
        }
    }
}

public class inncerclass {
    public static void main(String[] args) {
        
        STU obj = new STU();
        obj.show();
        
        
        STU.e obj1 = obj.new e();
        obj1.show8();
        // below is for when the inner class is an static 
        STU.d obj2 = new STU.d();
        obj2.show1();;
    }
}


