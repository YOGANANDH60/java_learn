class mobile {
    String brand;
    int price;
    static String name;

    static{
        name = "phone";
        System.out.println("this is from static block");
    }
    public mobile(){
        brand = "";
        price = 20000;
    }
    public void show() {
        System.out.println(brand+" "+price+" "+name);
    }
    static void show1(mobile obj) {
        System.out.println(obj.brand+" "+obj.price+" "+name);
    }
    
}

public class statics {
    public static void main(String[] args) {
        mobile obj = new mobile();
        obj.show();
        // obj.brand = "apple";
        // obj.price = 100000;
        // mobile.name ="smartphone";


    }
}
