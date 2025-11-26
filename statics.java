class mobile {
    String brand;
    int price;
    static String name;
    
}

public class statics {
    public static void main(String[] args) {
        mobile obj = new mobile();
        obj.brand = "apple";
        obj.price = 100000;
        mobile.name ="smartphone";

        mobile obj1 = new mobile();
        obj1.brand = "apple";
        obj1.price = 100000;
        mobile.name ="smartphone";

        
    }
}
