class human{
    private int age;
    private String name;

    public int getage(){
        return age;
    }
    public void setage(int a){
        age = a;
    }

    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }

}

public class encapsulation {

    public static void main(String[] args) {
        human obj = new human();
        obj.setage(20);
        obj.setname("yoga");

        System.out.println(obj.getname()+" -> age("+ obj.getage()+")");
    }
}