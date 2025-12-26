class cal 
{

    public int add(int a,int b)
    {
        int r = a+b;
        return r;
    }
    
}

public class obj 
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        
        cal cals = new cal();
        int result = cals.add(a,b);
        System.out.println(result);
    }
}
        // object - properties and behaviours this is an real time entity this is instence of class 
        // class - blue print of object 