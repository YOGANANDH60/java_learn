class _if{
    public static void main(String[] args) {
    //     // contidion statement 
    //     int a = 10;
    //     if (a==100){
    //         System.out.println("its equal to 10");
    //         System.out.println("yanna bro if els statement practice polaaa");}
    //     else if (a==10) {
    //         System.out.println(a);
    //     }
    //     else
    //         System.out.println("not equal");  

    //     // ternary operator
    //     int a = 10;
    //     int result = a%3==0?a:20;
    //     System.out.println(result);  

            // // switch statement 
            // int n = 9;
            // switch (n) {
            //     case 1:
            //         System.out.println("monday");
            //         break;
            //     case 2:
            //         System.out.println("tuesday");
            //         break;
            //     case 3:
            //         System.out.println("wednesday");
            //         break;
            //     case 4:
            //         System.out.println("thursday");
            //         break;
            //     case 5:
            //         System.out.println("friday");
            //         break;
            //     case 6:
            //         System.out.println("saturday");
            //         break;
            //     case 7:
            //         System.out.println("sunday");
            //         break;
            
            //     default:
            //          System.out.println("not in value");
            //         break;
            // }   

            // new switch statement in java
            // In This we can Return the Valuve and we can do it without break statement using( -> )
            int n = 2;
            String result = "";

            result = switch (n) {
                // case 1 -> "monday";
                 
                // case 2 -> "tuesday";
                    
                // default -> "not in value";
                case 1 : yield "monday";   
                case 2 : yield "tuesday";
                default: yield "not in value";   
                    
            };
            
            System.out.println(result);

    }
}