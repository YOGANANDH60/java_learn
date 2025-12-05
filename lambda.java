// this lamda expression only work in functional interface


@FunctionalInterface
interface aa {
    // void show(int a);
    int add (int a,int b);

}


public class lambda {
    public static void main(String[] args) {
        // aa obj = new aa(){
        //     public void show(){
        //         System.out.println("this is interfae");
        //     }
        // };
        // instead of above we can reduce the line of code;
        // aa obj = (i)-> System.out.println("this is interface "+i);
        // obj.show(5);//or 
        // aa obj1 = i-> System.out.println("this is interface "+i);
        // obj1.show(5);
        // return in lambda
        aa obj = (i,j)-> i +j; //or
        aa obj1 = (i,j) -> i+j;
        int result = obj.add(10,18); 
        int result1 = obj1.add(10,18); 
        System.out.println(result);
        System.out.println(result1);

    }
}
