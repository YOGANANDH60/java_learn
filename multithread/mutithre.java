package multithread;

class hi extends Thread{
    public void run(){
        for(int i =0;i<=10;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class hello extends Thread{
    public void run(){
        for(int i =0;i<=10;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class mutithre {
    public static void main(String[] args) {
        hi obj = new hi();
        hello obj1 = new hello();

        obj.start();
        // sleep is for waiting stagebetween the threads
        try {
                Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj1.start();
    }
}
