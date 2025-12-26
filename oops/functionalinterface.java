@FunctionalInterface
interface aa {
    void show();

}

public class functionalinterface {
    public static void main(String[] args) {
        aa obj = new aa(){
            public void show(){
                System.out.println("this is interfae");
            }
        };
        obj.show();
    }
}
