package multithread;

// class hi implements Runnable{
//     public void run(){
//         for(int i =0;i<=5;i++){
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class hello implements Runnable{
//     public void run(){
//         for(int i =0;i<=5;i++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

/*in this we can use lambda expresion and anonymouse inner class also  */

public class runnable {
    public static void main(String[] args) {
        // Runnable obj = new hi();
        // Runnable obj1 = new hello();
        // below for the lambta expression
        Runnable obj = () ->{
                for(int i =0;i<=5;i++){
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };  
        Runnable obj1 = () ->{
                for(int i =0;i<=5;i++){
                    System.out.println("hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

        Thread t = new Thread(obj);
        Thread t1 = new Thread(obj1);

        t.start();
        t1.start();

    }
}
