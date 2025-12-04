// enum week{
//     monday,tuesday,wednesday,thursday,friday,saturday

// }
enum lap{
    hp(500000),dell(690000),lenova(7000000);

    private int i;

    private lap(int i) {
        this.i =i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    

}

public class enumm {

    public static void main(String[] args) {

        lap l= lap.hp;
        System.out.println(l+":"+l.getI());
        System.out.println(l+":"+l.getI());
        System.out.println(l.getI());




        // week w = week.wednesday;
        // // week[] w = week.values();
        // // for (week ww:w){
        // //     System.out.println(ww);
        // // }
        // // // if
        // // if(w==week.monday){System.out.println("start week");}
        // // else{System.out.println("end week");}
        // // switch case::
        // switch (w) {
        //     case monday:
        //         System.out.println("start week");
        //         break;
        
        //     default:
        //         System.out.println("end week");
        //         break;
        // }
        // System.out.println(w.getClass().getSuperclass());//this for getting the class of the enum 
    }
}
