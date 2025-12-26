class calculator{
    public int add(int a, int b){
        return a+b;
    }
    public double add(float a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
}

public class method_overloading {

    public static void main(String[] args) {
        calculator obj = new calculator();
        int result = obj.add(12, 12);
        int results = obj.add(12, 12);
        int resultss = obj.add(12, 12,12);
        System.out.println(result);
        System.out.println(results);
        System.out.println(resultss);

    }
}


// method ovrloading is a same method name but different parameter or same parameter different data type 